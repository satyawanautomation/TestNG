package Demo1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertHardAssert {
	
	
	//Hard assert
	//it will give exception and will not execute all code in that method after that 
	@Test
	public void method1() {
		
		//Assert.assertEquals("10", "20");
		Assert.assertEquals("10", "20", "Values are not matching");
		System.out.println("method 1");
	}
	
	@Test
	public void method2() {
		
		System.out.println("method 2");
	}
	
	//Soft assert
	//it will give exception and will execute all code in that method after that 
	@Test
	public void method3() {
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals("10", "20");
		System.out.println("method 3");
		
		assertion.assertAll();//this line is mandatory 
	}

}
