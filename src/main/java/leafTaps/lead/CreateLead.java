package leafTaps.lead;


import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;

public class CreateLead extends LeafTapsWrapper{
	
	@Test
	public void createLead() throws Exception{
		//logIn();
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","Qeagle");
		enterById("createLeadForm_firstName", "Gopinath");
		enterById("createLeadForm_lastName", "Jayakumar");		
		enterById("createLeadForm_primaryEmail", "gopinath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByXpath("//input[@name='submitButton']");		
		//closeBrowser();
	}
















}
