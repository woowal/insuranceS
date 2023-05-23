package system.customer;

import java.util.List;

public interface CustomerList {

	public boolean add(Customer customer);

	public boolean delete();

	public List<Customer> retrieve();

	public boolean update();

}
