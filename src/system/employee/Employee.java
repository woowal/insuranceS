package system.employee;

import java.sql.Date;
import java.util.List;
import system.accident.Accident;
import system.contract.ContractState;
import system.insurance.Insurance;
import system.insurance.InsuranceApprovalRequest;

public class Employee {

	private long employeeId;

	private int grade;

	private String name;

	private String phoneNumber;

	private EmployeeType employeeType;
	
	private Date joiningDate;

	public Accident accident;

	public Insurance insurance;

	public InsuranceApprovalRequest insuranceApprovalRequest;

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public Accident getAccident() {
		return accident;
	}

	public void setAccident(Accident accident) {
		this.accident = accident;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public InsuranceApprovalRequest getInsuranceApprovalRequest() {
		return insuranceApprovalRequest;
	}

	public void setInsuranceApprovalRequest(InsuranceApprovalRequest insuranceApprovalRequest) {
		this.insuranceApprovalRequest = insuranceApprovalRequest;
	}

	public int calculateInsuranceAmount(){
		return 0;
	}

	public List<ContractState> checkContractState(){
		return null;
	}

	public boolean determineTarget(){
		return false;
	}

	public boolean examineRevival(){
		return false;
	}

	public boolean finishAccident(){
		return false;
	}

	public boolean informContractState(){
		return false;
	}

	public int measureInsuranceCost(){
		return 0;
	}

	public int payInsuranceAmount(){
		return 0;
	}

	public boolean receiptAccident(){
		return false;
	}

	public boolean recordConsult(){
		return false;
	}

	public boolean requestAccidentHandling(){
		return false;
	}

	public boolean requestInsuranceApproval(){
		return false;
	}

	public boolean requestTariffValidation(){
		return false;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

}
