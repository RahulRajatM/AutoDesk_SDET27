package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomer {


	@Test
	public void createCustomer()
	{
		Reporter.log("Customer Created ");
	}

	@Test
	public void modifyCustomer()
	{
		Reporter.log("Customer Modify",true);
	}
}
