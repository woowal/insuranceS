package system.customer;

import java.time.LocalDateTime;
import java.util.Date;
import system.accident.Accident;
import system.consulting.Consulting;
import system.contract.Contract;

public class Customer {

	private String account;

	private int age;

	private long customerId;

	private LocalDateTime joinDate;

	private String name;

	private String phoneNumber;

	private String sex;

	public Consulting consulting;

	public Contract contract;

	public Accident accident;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public LocalDateTime getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDateTime joinDate) {
		this.joinDate = joinDate;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Consulting getConsulting() {
		return consulting;
	}

	public void setConsulting(Consulting consulting) {
		this.consulting = consulting;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public Accident getAccident() {
		return accident;
	}

	public void setAccident(Accident accident) {
		this.accident = accident;
	}

	public boolean estimateConsulting(){
		return false;
	}

	public boolean payInsuranceCost(){
		return false;
	}

	public boolean requestAccident(){
		return false;
	}

	public boolean requestConsulting(){
		return false;
	}

}
