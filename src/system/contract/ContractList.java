package system.contract;

import java.util.List;

public interface ContractList {

	boolean add(Contract contract);

	boolean delete();

	List<Contract> retrieve();

	boolean update();

}
