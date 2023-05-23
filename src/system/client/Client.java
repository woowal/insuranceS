package system.client;

import DAO.ConsultingDao;
import DAO.EmployeeDao;
import system.consulting.Consulting;
import system.consulting.ConsultingList;
import system.consulting.ConsultingListImpl;
import system.consulting.ConsultingType;
import system.employee.EmployeeList;

import java.util.Calendar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Client {
	public static void main(String[] args) throws  IOException, ParseException, SQLException{
		BufferedReader objReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				printMenu();
				String sChoice = objReader.readLine().trim();
				switch (sChoice) {
				case "1":
					requestConsulting(objReader);
					break;
				case "2":
					startConsulting(objReader);
					break;
				case "3":
					break;
				case "4":
					break;
				case "5":
					break;
				case "6":
					break;
				case "7":
					break;
				case "8":
					break;
				case "x":
					return;
				default:
					System.out.println("Invalid Choice !!!");
				}
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("기입되지 않은 정보가 있습니다. 기입 완료해주시길 바랍니다.");
			requestConsulting(objReader);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void printMenu() {
		System.out.println("\n***********MENU***********");
		System.out.println("1. 상담을 요청한다");
		System.out.println("2. 상담하기");
//		System.out.println("3. List Reservation");
//		System.out.println("4. Add Students");
//		System.out.println("5. Delete Students");
//		System.out.println("6. Add Courses");
//		System.out.println("7. Delete Courses");
//		System.out.println("8. Make Reservation");
//		System.out.println("x. Exit");
	}
	
		private static void requestConsulting(BufferedReader objReader) throws IOException, ParseException, SQLException {
			Consulting consulting = new Consulting();
			ConsultingType[] consultingType = ConsultingType.values();
			ConsultingDao consultingDao = new ConsultingDao();
			//시나리오 구현
			//로그인 구현 후 로그인 되어 있는 고객ID set
			consulting.setCustomerId(1);
			System.out.println("상담의 내용을 선택해주세요: ");
			for(int i = 0; i < consultingType.length; i++) {
				System.out.println(i+1 + ". " + consultingType[i]);
			}
			int typeChoice = Integer.parseInt(objReader.readLine().trim());
			consulting.setConsultingType(consultingType[typeChoice-1]);
			System.out.println("상담의 시간을 선택해주세요: 연도-월-일-시-분");
//			formatChecker(objReader.readLine().trim());
			//현재 일자의 10일 내로만 가능하게
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh-mm");
			Date stringDate = formatter.parse(objReader.readLine().trim());
			Timestamp stringTOTimestamp= new Timestamp(stringDate.getTime());
			consulting.setStartedAt(stringTOTimestamp);
			System.out.println(consulting.getStartedAt());
			SimpleDateFormat converter = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분으로 신청되었습니다");
			System.out.println(converter.format(consulting.getStartedAt()));
			System.out.println("신청 완료, 확정 후 메세지가 송신됩니다.");
			
			consultingDao.createByCustomer(consulting);
			consulting.setConsultingId(consultingDao.retrieveRequested(consulting).getConsultingId());
			selectConsultingEmployee(consulting);
		}
		
		private static void startConsulting(BufferedReader objReader) throws IOException, SQLException {
			ConsultingDao consultingDao = new ConsultingDao();
			EmployeeDao employeeDao = new EmployeeDao();
			ConsultingList consultingList = consultingDao.retrieveByCustomerId(1);
			ConsultingList filteredConsultingList = filteringConsulting(consultingList);
			for(int i =0; i < filteredConsultingList.retrieve().size(); i++) {
				System.out.println(i+1 + ". 예정 상담 접수 번호: " 
					+ filteredConsultingList.retrieve().get(i).getConsultingId()
					+ " / 직원이름: " 
					+ employeeDao.retrieveNameById(filteredConsultingList.retrieve().get(i).getEmployeeId())
					+" / 직원 연락처: "
					+ employeeDao.retrieveNumberById(filteredConsultingList.retrieve().get(i).getEmployeeId())
					+" / 상담 시간: "
					+ filteredConsultingList.retrieve().get(i).getStartedAt());
			}
			System.out.println("하고자 상담을 선택해주세요: ");
			int choice = Integer.parseInt(objReader.readLine().trim());
			System.out.println(choice);
			if(earlyChecker(filteredConsultingList.retrieve().get(choice-1))) {
				System.out.println(employeeDao.retrieveNumberById(filteredConsultingList.retrieve().get(choice-1).getEmployeeId()));
			} else {
				System.out.println("아직 상담 예정 시간이 아닙니다");
			}
			
		}
		
		private static ConsultingList filteringConsulting(ConsultingList consultingList) {
			List<Consulting> consultingLists = consultingList.retrieve();
			ConsultingList filteredConsultingList = new ConsultingListImpl();
			Calendar calendar = Calendar.getInstance();
			Timestamp currentTime = new Timestamp(System.currentTimeMillis());
			for(int i = 0; i < consultingLists.size(); i++) {
				calendar.setTime(consultingLists.get(i).getStartedAt());
				calendar.add(Calendar.MINUTE, 30);
				if(calendar.getTime().after(currentTime)){
					filteredConsultingList.add(consultingLists.get(i));
				}
			}	
			return filteredConsultingList;
		}
		
		private static boolean earlyChecker(Consulting consulting) {
			Timestamp currentTime = new Timestamp(System.currentTimeMillis());
			return currentTime.after(consulting.getStartedAt());
		}
		
		private static boolean formatChecker(String a) {
			for(int i = 0; i<a.length(); i++) {
				a.indexOf("-");
			}
			if(a.length() == 16) {
				if(a.substring(4, 5).equals("-") && a.substring(4, 5).equals("-") ) {
					System.out.println("yy");
				}
			}
			
			return false;
		}
		
		private static boolean selectConsultingEmployee(Consulting consulting) throws SQLException {
			ConsultingDao consultingDao = new ConsultingDao();
			EmployeeDao employeeDao = new EmployeeDao();
			EmployeeList ableEmployee;
			Vector<Integer> unableEmployeeId = consultingDao.retrieveAbleEmployeeIdByStartedAt(consulting);
			if(!unableEmployeeId.isEmpty()) {
				ableEmployee = employeeDao.retrieveAbleEmployeeById(unableEmployeeId);// 면담 가능한 직원
				long id = consulting.selectEmployee(ableEmployee);
				consulting.setEmployeeId(id);
				consultingDao.updateByEmployee(consulting);
			} else {
				System.out.println("해당 시간에 면담 가능한 직원이 없습니다. 시간을 변경해주시길 바랍니다");
			}
			
			return false;
		}
		
}
