package packagepage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethod.Annotations;

public class TC_CreateLead extends Annotations{
	
	@BeforeTest
	public void setValue()
	{
		testName = "TestCase001";//changed
		 testDesc = "Create a new Lead in Leaftaps";
		 moduleName="Leads";
	 author="Sheena";
	 category="Smoke";
	 iteration="Leads";
	 excelFileName="CreateLeadexcel";
	 	 
	}
	
	@Test(dataProvider = "fetchData")
	public void createLead(String cName, String fName, String lName, String email, String ph,String expmessage) {		
		new MyHome()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.typeEmail(email)
		.typePhone(ph)
		.clicksubmiterror()
		.partial(expmessage);
		
	}
}
		
	
		