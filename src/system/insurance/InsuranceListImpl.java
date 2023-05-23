package system.insurance;

import java.util.List;

public class InsuranceListImpl implements InsuranceList {

	private List<Insurance> insuranceList;
	public Insurance insurance;

	@Override
	public boolean add() {
		return false;
	}

	@Override
	public boolean delete() {
		return false;
	}

	@Override
	public List<Insurance> retrieve() {
		return null;
	}

	@Override
	public boolean update() {
		return false;
	}

}
