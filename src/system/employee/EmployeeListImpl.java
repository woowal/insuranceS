package system.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListImpl implements EmployeeList {

	private List<Employee> employeeList = new ArrayList<Employee>();
	public Employee employee;

	@Override
	public boolean add(Employee employee) {
		return employeeList.add(employee);
	}

	@Override
	public boolean delete() {
		return false;
	}

	@Override
	public List<Employee> retrieve() {
		return employeeList;
	}

	@Override
	public boolean update() {
		return false;
	}
}
