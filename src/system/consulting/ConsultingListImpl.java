package system.consulting;

import java.util.ArrayList;
import java.util.List;

public class ConsultingListImpl implements ConsultingList {

	private List<Consulting> consultingList = new ArrayList<>();

	public Consulting consulting;

	@Override
	public boolean add(Consulting consulting) {
		return consultingList.add(consulting);
	}

	@Override
	public boolean delete() {
		return false;
	}

	@Override
	public List<Consulting> retrieve() {
		return consultingList;
	}

	@Override
	public boolean update() {
		return false;
	}
}
