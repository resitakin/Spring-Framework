package com.springDemo;

import org.springframework.beans.factory.annotation.Value;

public class MsSqlCustomerDal implements IcustomerDal{
	@Value("${local.email}")
    String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectioString) {
		this.connectionString = connectioString;
	}

	@Override
	public void add() {
		System.out.println("connection String : "+this.connectionString);
		System.out.println("MsSql veritabanı eklendi");
	}

}
