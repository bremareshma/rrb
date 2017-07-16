package leafTaps.lead;


import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;

public class CreateLead extends LeafTapsWrapper{
	
	//@Test//(groups = {"smoke"})
	@Test(dataProvider="fetchData"/*,dataProviderClass=LeafTapsWrapper.class*/)
	public void createLead(String FN,String LN,String CN) throws Exception{		
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",CN);
		enterById("createLeadForm_firstName",FN);
		enterById("createLeadForm_lastName", LN);		
		enterById("createLeadForm_primaryEmail", "gopinath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByXpath("//input[@name='submitButton']");		
		
	}
	/*@DataProvider(name="fetchData")
	public String[][] getData(){
		String[][] data = new String[3][3];
		data[0][0] = "Nesa";
		data[0][1] = "Kumar";
		data[0][2] = "Google";
		data[1][0] = "Gopinath";
		data[1][1] = "JayaKumar";
		data[1][2] = "Facebook";
		data[2][0] = "Lokesh";
		data[2][1] = "Kumar";
		data[2][2] = "Facebook";
		return data;
	}
*/	
	















}
