package Demo1;


import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethods {
	
	@Test(dependsOnMethods="method2")
	public void method1() {
		System.out.println("method 1");
	}
	
	@Test
	public void method2() {
		//System.out.println("method 2");
		Assert.assertEquals("10", "20");
	}
	
	@Test
	public void method3() {
		System.out.println("method 3");
	}

	@Test(dependsOnMethods={"method3","method5"})
	public void method4() {
		System.out.println("method 4");
	}
	
	@Test
	public void method5() {
		System.out.println("method 5");
	}
}
