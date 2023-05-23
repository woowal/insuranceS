package system.insurance;

import java.util.List;

public interface InsuranceList {

	boolean add();

	boolean delete();

	List<Insurance> retrieve();

	boolean update();

}
