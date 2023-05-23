package system.consulting;

import java.util.List;

public interface ConsultingList {

	boolean add(Consulting consulting);

	boolean delete();

	List<Consulting> retrieve();

	boolean update();

}
