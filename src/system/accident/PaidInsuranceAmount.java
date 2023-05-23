package system.accident;

import java.util.Date;


public class PaidInsuranceAmount {

	private long accidentId;

	private int amount;

	private Date paidAt;

	public long getAccidentId() {
		return accidentId;
	}

	public void setAccidentId(long accidentId) {
		this.accidentId = accidentId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getPaidAt() {
		return paidAt;
	}

	public void setPaidAt(Date paidAt) {
		this.paidAt = paidAt;
	}

	public PaidInsuranceAmount(){

	}

}
