package system.accident;


import java.util.List;

public class AccidentListImpl implements AccidentList {

	private List<Accident> accidentList;

	public Accident accident;

	public AccidentListImpl(){

	}

	@Override
	public boolean add() {
		return false;
	}

	@Override
	public boolean delete() {
		return false;
	}

	@Override
	public List<Accident> retrieve() {
		return null;
	}

	@Override
	public boolean update() {
		return false;
	}
}
