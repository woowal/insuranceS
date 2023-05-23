package system.contract;

import java.time.LocalDateTime;

public class Contract {

	private String carModel;

	private long customerId;

	private long employeeId;

	private long insuranceId;

	private ContractState contractState;

	private int nonPaymentCount;

	private LocalDateTime startedAt;


	public boolean contract(){
		return false;
	}

	public boolean revival(){
		return false;
	}

	public boolean terminate(){
		return false;
	}

}
