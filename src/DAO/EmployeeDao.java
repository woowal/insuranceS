package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import system.employee.Employee;
import system.employee.EmployeeList;
import system.employee.EmployeeListImpl;
import system.employee.EmployeeType;

public class EmployeeDao extends Dao{
	public EmployeeDao() {
		try {
			super.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void create(Employee employee) {
		String query = "insert into employee values (" + 
						+ employee.getEmployeeId() + ","
						+ employee.getGrade() + ", '"
						+ employee.getName() + "', '"
						+ employee.getPhoneNumber() + "', '"
						+ employee.getJoiningDate() + "', '"
						+ employee.getEmployeeType() + "');";
		super.create(query);
	}
	public EmployeeList retrieve(Employee employee) throws SQLException {
		String query = "select * from employee;";
		ResultSet resultSet = super.retrieve(query);
		EmployeeList employeeList = new EmployeeListImpl();
		while(resultSet.next()) {
			employeeList.add(employee);
			System.out.print(resultSet.getString("user_name") + ", ");
			System.out.print(resultSet.getString("user_phoneno") + ", ");
			System.out.println(resultSet.getInt("isAccepted")); }
		return null; 
	}
	public void update(Employee employee) {
		String query = "insert into insurance values (" + 
				+ employee.getEmployeeId() + ","
				+ 
				");";
		super.update(query);
	}
	public void delete(Employee employee) {
		String query = "insert into insurance values (" + 
				+ employee.getEmployeeId() + ","
				+ 
				");";
		super.delete(query);
	}
	public EmployeeList retrieveAbleEmployeeById(Vector<Integer> unableEmployeeId) throws SQLException {
		String idQuery = "" + unableEmployeeId.get(0);
		for(int i = 0; i < unableEmployeeId.size(); i++) {
			idQuery = idQuery + " and not employeeId = " + unableEmployeeId.get(i);
		};
		if(unableEmployeeId.get(0) == 0) {
			idQuery = "0";
		}
		String query = "select * from employee where not employeeId = " + 
				idQuery
				+ " and type = '상담';";
		ResultSet resultSet = super.retrieve(query);
		EmployeeList employeeList = new EmployeeListImpl();
		while(resultSet.next()) {
			Employee employee = new Employee();
			employee.setEmployeeId(resultSet.getInt("employeeId"));
			employee.setGrade(resultSet.getInt("grade"));
			employee.setName(resultSet.getString("name"));
			employee.setPhoneNumber(resultSet.getString("phonenumber"));
			employee.setJoiningDate(resultSet.getDate("joiningDate"));
			employee.setEmployeeType(Enum.valueOf(EmployeeType.class, resultSet.getString("type")));
			employeeList.add(employee);
		}
		return employeeList;
	}
	
	public String retrieveNameById(long id) throws SQLException {
		String query = "select name from employee where employeeId = " + 
				id + ";";
		ResultSet resultSet = super.retrieve(query);
		String name = null;
		while(resultSet.next()) {
			name = resultSet.getString("name");
		}
		return name;
	}
	public String retrieveNumberById(long id) throws SQLException {
		String query = "select phonenumber from employee where employeeId = " + 
				id + ";";
		ResultSet resultSet = super.retrieve(query);
		String number = null;
		while(resultSet.next()) {
			number = resultSet.getString("phonenumber");
		}
		return number;
	}
}
