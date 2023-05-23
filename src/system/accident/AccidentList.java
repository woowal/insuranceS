package system.accident;


import java.util.List;

public interface AccidentList {

	boolean add();

	boolean delete();

	List<Accident> retrieve();

	boolean update();

}
