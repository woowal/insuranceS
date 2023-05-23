package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;

import system.consulting.Consulting;
import system.consulting.ConsultingList;
import system.consulting.ConsultingListImpl;
import system.consulting.ConsultingType;

public class ConsultingDao extends Dao{
	public ConsultingDao() {
		try {
			super.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void createByCustomer(Consulting consulting) {
		String query = "insert into consulting(customerId, startedAt, type) values (" + 
						+ consulting.getCustomerId() + ", '"
						+ consulting.getStartedAt() + "', '"
						+ consulting.getConsultingType() + "');";
		super.create(query);
	}
	public void retrieve(Consulting consulting) throws SQLException {
		String query = "insert into insurance values (" + 
				+ consulting.getConsultingId() + ","
				+ 
				");";
		ResultSet resultSet = super.retrieve(query);
		while(resultSet.next()) {
			System.out.print(resultSet.getString("user_name") + ", ");
			System.out.print(resultSet.getString("user_phonenumber") + ", ");
			System.out.println(resultSet.getInt("isAccepted")); } 
	}
	public void update(Consulting consulting) {
		String query = "update consulting set employeeid = "
				+ consulting.getEmployeeId() 
				+ ", satisfaction = "
				+ consulting.getSatisfaction() 
				+ " where consultingId = "
				+ consulting.getConsultingId() + ";";
		super.update(query);
	}
	public void updateByEmployee(Consulting consulting) {
		String query = "update consulting set employeeid = "
				+ consulting.getEmployeeId() 
				+ " where consultingId = "
				+ consulting.getConsultingId() + ";";
		super.update(query);
	}
	public void delete(Consulting consulting) {
		String query = "insert into insurance values (" + 
				+ consulting.getConsultingId() + ","
				+ 
				");";
		super.delete(query);
	}
	public Vector<Integer> retrieveAbleEmployeeIdByStartedAt(Consulting consulting) throws SQLException {
		String query = "select distinct employeeId from consulting where startedAt = '"
				+ consulting.getStartedAt()
				+ "';";
		ResultSet resultSet = super.retrieve(query);
		Vector<Integer> unableEmployeeId = new Vector<Integer>();
		while(resultSet.next()) {
			unableEmployeeId.add(resultSet.getInt("employeeId"));
		}
		return unableEmployeeId;
		
	}
	public Consulting retrieveRequested(Consulting consulting) throws SQLException {
		String query = "select consultingId from consulting where startedAt = '"
				+ consulting.getStartedAt() + "' and customerId = "
				+ consulting.getCustomerId() + " and type = '"
				+ consulting.getConsultingType() + "';";
		ResultSet resultSet = super.retrieve(query);
		while(resultSet.next()) {
			consulting.setConsultingId(resultSet.getInt("consultingId"));
		}
		return consulting;
	}
	public ConsultingList retrieveByCustomerId(int customerId) throws SQLException {
		String query = "select * from consulting where customerId = "
				+ customerId + ";";
		ResultSet resultSet = super.retrieve(query);
		ConsultingList consultingList = new ConsultingListImpl();
		Calendar calendar = Calendar.getInstance();
		while(resultSet.next()) {
			Consulting consulting = new Consulting();
			consulting.setConsultingId(resultSet.getInt("consultingId"));
			consulting.setCustomerId(resultSet.getInt("customerId"));
			consulting.setEmployeeId(resultSet.getInt("employeeId"));
			consulting.setSatisfaction(resultSet.getInt("satisfaction"));
			calendar.setTime(resultSet.getTimestamp("startedAt"));
			calendar.add(Calendar.HOUR, -9);
			Timestamp startedAt = new Timestamp(calendar.getTime().getTime());
			consulting.setStartedAt(startedAt);
			consulting.setConsultingType(Enum.valueOf(ConsultingType.class, resultSet.getString("type")));
			consultingList.add(consulting);
		}
		return consultingList;
	}
}
