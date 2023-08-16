package Demo1;

import org.testng.annotations.Test;

public class groups {
	
	@Test(groups={"Regression","Sanity"})
	public void method1() {
		System.out.println("Regressionmethod1");
	}
	
	@Test(groups="Regression")
	public void method2() {
		System.out.println("Regressionmethod2");
	}
	
	@Test(groups="Regression")
	public void method3() {
		System.out.println("Regressionmethod3");
	}
	
	@Test(groups="Sanity")
	public void method4() {
		System.out.println("Sanitymethod4");
	}
	
	@Test(groups="Sanity")
	public void method5() {
		System.out.println("Sanitymethod5");
	}
	
	@Test(groups="Regression")
	public void method6() {
		System.out.println("Regressionmethod6");
	}
	
	@Test(groups="Sanity")
	public void method7() {
		System.out.println("Sanitymethod7");
	}

}
