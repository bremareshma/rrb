package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class LeafTapsWrapper extends WrapperMethods{	
	
	@Parameters({"browser","url","pwd","uName"})
	@BeforeMethod	
	public void logIn(String browser, String URL, String pwd, String uName) throws Exception {
		invokeApp(browser, URL);
		enterById("username", uName);
		enterById("password", pwd);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
	}
	
	@AfterMethod(groups = {"common"})
	public void closeApplication(){
		closeBrowser();
	}
	
	@DataProvider(name="fetchData")
	public static String[][] getData(){
		String[][] data = new String[3][3];
		data[0][0] = "Nesa....";
		data[0][1] = "Kumar";
		data[0][2] = "Google";
		data[1][0] = "Gopinath";
		data[1][1] = "JayaKumar";
		data[1][2] = "Microsoft";
		data[2][0] = "Lokesh";
		data[2][1] = "Kumar";
		data[2][2] = "Facebook";
		return data;
	}
}
