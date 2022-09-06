package springIntro;

import java.sql.Connection;

public class CustomerDal implements IcustomerDal {
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectioString) {
		this.connectionString = connectioString;
	}
	public void add() {
		System.out.println("connection String : "+this.connectionString);
		System.out.println("oracle veritabanı eklendi");
	}

}
