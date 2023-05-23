package system.insurance;
import java.util.Date;
import system.contract.Contract;

public class Insurance {

	private int additionalCost;

	private int basicCost;

	private int basicInsuredAmount;

	private String content;

	private Date duration;

	private long insuranceId;

	private String name;

	private int standardTariff;

	private String target;

	private InsuranceType insuranceType;

	public Contract contract;

	public int getAdditionalCost() {
		return additionalCost;
	}

	public void setAdditionalCost(int additionalCost) {
		this.additionalCost = additionalCost;
	}

	public int getBasicCost() {
		return basicCost;
	}

	public void setBasicCost(int basicCost) {
		this.basicCost = basicCost;
	}

	public int getBasicInsuredAmount() {
		return basicInsuredAmount;
	}

	public void setBasicInsuredAmount(int basicInsuredAmount) {
		this.basicInsuredAmount = basicInsuredAmount;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	public long getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(long insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandardTariff() {
		return standardTariff;
	}

	public void setStandardTariff(int standardTariff) {
		this.standardTariff = standardTariff;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public int calculateAdditionalCost(){
		return 0;
	}

	public int calculateProfit(){
		return 0;
	}

	public int calculateTotalCost(){
		return 0;
	}

}
