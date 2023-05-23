package system.insurance;

import java.time.LocalDateTime;

public class InsuranceApprovalRequest {

	private int expectedProfit;

	private LocalDateTime requestDate;

	private long requestEmployeeId;

	private long requestInsuranceId;

	public int getExpectedProfit() {
		return expectedProfit;
	}

	public void setExpectedProfit(int expectedProfit) {
		this.expectedProfit = expectedProfit;
	}

	public LocalDateTime getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(LocalDateTime requestDate) {
		this.requestDate = requestDate;
	}

	public long getRequestEmployeeId() {
		return requestEmployeeId;
	}

	public void setRequestEmployeeId(long requestEmployeeId) {
		this.requestEmployeeId = requestEmployeeId;
	}

	public long getRequestInsuranceId() {
		return requestInsuranceId;
	}

	public void setRequestInsuranceId(long requestInsuranceId) {
		this.requestInsuranceId = requestInsuranceId;
	}
}
