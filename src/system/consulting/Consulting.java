package system.consulting;
import java.sql.Date;
import java.sql.Timestamp;

import system.employee.EmployeeList;
import system.employee.EmployeeListImpl;

public class Consulting {

	private long consultingId;

	private long customerId;

	private long employeeId;

	private int satisfaction;

	private Timestamp startedAt;

	private ConsultingType consultingType;
	
	@SuppressWarnings("unused")
	public long selectEmployee(EmployeeList ableEmployee) {
		EmployeeList newbies = new EmployeeListImpl();
		for(int i = 0; i < ableEmployee.retrieve().size(); i++) {
			if(ableEmployee.retrieve().get(i).getGrade()==0) {
				newbies.add(ableEmployee.retrieve().get(i));
			};
		}
		int bestGrade = 0;
		long bestEmployeeId = 0;
		if(newbies.retrieve().size() == 0) {
			for(int i = 0; i < ableEmployee.retrieve().size(); i++) {
				if (bestGrade < ableEmployee.retrieve().get(i).getGrade()) {					
					bestGrade = ableEmployee.retrieve().get(i).getGrade();
					bestEmployeeId = ableEmployee.retrieve().get(i).getEmployeeId();
				}
			}
			return bestEmployeeId;
		} else {
			if (newbies.retrieve().size() > 1) {
				Date bestEmployeeDate = newbies.retrieve().get(0).getJoiningDate();
				bestEmployeeId = newbies.retrieve().get(0).getEmployeeId();
				for(int i = 0; i < newbies.retrieve().size(); i++) {
					if (bestEmployeeDate.after(newbies.retrieve().get(i).getJoiningDate())) {					
						bestEmployeeDate = newbies.retrieve().get(i).getJoiningDate();
						bestEmployeeId = newbies.retrieve().get(i).getEmployeeId();
					}
				}
				return bestEmployeeId;
			} else {
				return newbies.retrieve().get(0).getEmployeeId();
			}
		}
	}

	public long getConsultingId() {
		return consultingId;
	}

	public void setConsultingId(long consultingId) {
		this.consultingId = consultingId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeID) {
		this.employeeId = employeeID;
	}

	public int getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(int satisfaction) {
		this.satisfaction = satisfaction;
	}

	public Timestamp getStartedAt() {
		return startedAt;
	}

	public void setStartedAt(Timestamp timestamp) {
		this.startedAt = timestamp;
	}

	public ConsultingType getConsultingType() {
		return consultingType;
	}

	public void setConsultingType(ConsultingType consultingType) {
		this.consultingType = consultingType;
	}

}
