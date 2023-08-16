package Demo1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	@Test(dataProvider = "getdata")
	public void method1(String username , String password) {
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@DataProvider //Use to run same method multiple times with different data 
	public Object[][] getdata(){
		Object[][] data = new Object[2][2];
		data[0][0] = "satya";
		data[0][1] = "123";
		data[1][0] = "satya1";
		data[1][1] = "12345";
		
		return data;
	}

}
