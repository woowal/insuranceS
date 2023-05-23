package system.customer;

import java.util.List;

public class CustomerListImpl implements CustomerList {

	private List<Customer> customerList;

	public Customer customer;

	@Override
	public boolean add(Customer customer) {
		return customerList.add(customer);
	}

	@Override
	public boolean delete() {
		return false;
	}

	@Override
	public List<Customer> retrieve() {
		return customerList;
	}

	@Override
	public boolean update() {
		return false;
	}
}
