package system.contract;

import java.util.ArrayList;
import java.util.List;


public class ContractListImpl implements ContractList {

	private List<Contract> contractList = new ArrayList<>();

	public Contract contract;


	@Override
	public boolean add(Contract contract) {
		return contractList.add(contract);
	}

	@Override
	public boolean delete() {
		return false;
	}
	@Override
	public List<Contract> retrieve() {
		return contractList;
	}

	@Override
	public boolean update() {
		return false;
	}
}
