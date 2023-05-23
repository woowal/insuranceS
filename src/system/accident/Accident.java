package system.accident;
import java.util.Date;


public class Accident {

	private String accidentContent;

	private Date accidentDate;

	private int accidentGrade;

	private long accidentID;

	private String accidentName;

	private String carNumber;

	private int certificate;

	private long customerId;

	private DamageType damageType;

	private String hospital;

	private boolean isFinished;

	private boolean isReported;

	private String location;

	private int mistakeRatio;

	private String ownerName;

	private String ownerPhoneNumber;

	private String patientName;

	private String patientNum;

	private AccidentType accidentType;

	public PaidInsuranceAmount paidInsuranceAmount;

	public Accident(){

	}

	public String getAccidentContent() {
		return accidentContent;
	}

	public void setAccidentContent(String accidentContent) {
		this.accidentContent = accidentContent;
	}

	public Date getAccidentDate() {
		return accidentDate;
	}

	public void setAccidentDate(Date accidentDate) {
		this.accidentDate = accidentDate;
	}

	public int getAccidentGrade() {
		return accidentGrade;
	}

	public void setAccidentGrade(int accidentGrade) {
		this.accidentGrade = accidentGrade;
	}

	public long getAccidentID() {
		return accidentID;
	}

	public void setAccidentID(long accidentID) {
		this.accidentID = accidentID;
	}

	public String getAccidentName() {
		return accidentName;
	}

	public void setAccidentName(String accidentName) {
		this.accidentName = accidentName;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public int getCertificate() {
		return certificate;
	}

	public void setCertificate(int certificate) {
		this.certificate = certificate;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public DamageType getDamageType() {
		return damageType;
	}

	public void setDamageType(DamageType damageType) {
		this.damageType = damageType;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public boolean isFinished() {
		return isFinished;
	}

	public void setFinished(boolean finished) {
		isFinished = finished;
	}

	public boolean isReported() {
		return isReported;
	}

	public void setReported(boolean reported) {
		isReported = reported;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMistakeRatio() {
		return mistakeRatio;
	}

	public void setMistakeRatio(int mistakeRatio) {
		this.mistakeRatio = mistakeRatio;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerPhoneNumber() {
		return ownerPhoneNumber;
	}

	public void setOwnerPhoneNumber(String ownerPhoneNumber) {
		this.ownerPhoneNumber = ownerPhoneNumber;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientNum() {
		return patientNum;
	}

	public void setPatientNum(String patientNum) {
		this.patientNum = patientNum;
	}

	public AccidentType getAccidentType() {
		return accidentType;
	}

	public void setAccidentType(AccidentType accidentType) {
		this.accidentType = accidentType;
	}

	public PaidInsuranceAmount getPaidInsuranceAmount() {
		return paidInsuranceAmount;
	}

	public void setPaidInsuranceAmount(PaidInsuranceAmount paidInsuranceAmount) {
		this.paidInsuranceAmount = paidInsuranceAmount;
	}

	public int decideAccidentGrade(){
		return 0;
	}

}
