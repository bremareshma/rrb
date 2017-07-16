package week4Day2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider {

	@Test(dataProvider="fetchData"/*,invocationCount=3*/)
	public void print(String FN,String LN,String CN){
		System.out.println("First Name :"+FN);
		System.out.println("Last Name :"+LN);
		System.out.println("Company Name :"+CN);
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
