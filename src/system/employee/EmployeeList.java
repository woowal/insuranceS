package system.employee;

import java.util.List;

public interface EmployeeList {

	boolean add(Employee employee);

	boolean delete();

	List<Employee> retrieve();

	boolean update();

}
