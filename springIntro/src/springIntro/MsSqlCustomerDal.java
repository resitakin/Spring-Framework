package springIntro;

public class MsSqlCustomerDal implements IcustomerDal{
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
