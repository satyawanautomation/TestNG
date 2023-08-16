package Demo2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void method1() {
		
		System.out.println("test2method1");
	}
	
	@BeforeSuite
	public void method2() {
		System.out.println("test2method2BeforeSuite");
	}
	
	@AfterSuite
	public void method3() {
		System.out.println("test2method3AfterSuite");
	}
	
	@BeforeTest
	public void method4() {
		System.out.println("test2method4BeforeTest");
	}
	
	@AfterTest
	public void method5() {
		System.out.println("test2method5AfterTest");
	}
	
	@BeforeClass
	public void method6() {
		System.out.println("test2method6BeforeClass");
	}
	
	@AfterClass
	public void method7() {
		System.out.println("test2method7AfterClass");
	}
	
	@BeforeMethod
	public void method8() {
		System.out.println("test2method8BeforeMethod");
	}
	
	@AfterMethod
	public void method9() {
		System.out.println("test2method9AfterMethod");
	}
	
	@Test
	public void method10() {
		System.out.println("test2method10");
	}

	

}
