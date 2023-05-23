package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import system.insurance.Insurance;

public class InsuranceDao extends Dao{
	public InsuranceDao() {
		try {
			super.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void create(Insurance insurance) {
		String query = "insert into insurance values (" + 
						+ insurance.getInsuranceId() + ","
						+ 
						");";
		super.create(query);
	}
	public void retrieve(Insurance insurance) throws SQLException {
		String query = "insert into insurance values (" + 
				+ insurance.getInsuranceId() + ","
				+ 
				");";
		ResultSet resultSet = super.retrieve(query);
		while(resultSet.next()) {
			System.out.print(resultSet.getString("user_name") + ", ");
			System.out.print(resultSet.getString("user_phoneno") + ", ");
			System.out.println(resultSet.getInt("isAccepted")); } 
	}
	public void update(Insurance insurance) {
		String query = "insert into insurance values (" + 
				+ insurance.getInsuranceId() + ","
				+ 
				");";
		super.update(query);
	}
	public void delete(Insurance insurance) {
		String query = "insert into insurance values (" + 
				+ insurance.getInsuranceId() + ","
				+ 
				");";
		super.delete(query);
	}
}
