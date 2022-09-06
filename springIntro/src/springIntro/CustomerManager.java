package springIntro;

public class CustomerManager implements IcustomerService{
	
	private IcustomerDal customerDal;
	//constructor injection
//	public CustomerManager(IcustomerDal customerDal) {
//		
//		this.customerDal = customerDal;
//	}

	public void add() {
		
		customerDal.add();
		
	}

	public void setCustomerDal(IcustomerDal customerDal) {
		this.customerDal = customerDal;
	}

}
