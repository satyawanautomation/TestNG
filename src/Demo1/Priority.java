package Demo1;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=3)
	public void method1() {
		System.out.println("method1");
	}
	
	@Test(priority=2)
	public void method2() {
		System.out.println("method2");
	}
	
	@Test(priority=1)
	public void method3() {
		System.out.println("method3");
	}
	
	@Test(priority=0)
	public void method4() {
		System.out.println("method4");
	}
	
	@Test(priority=0)
	public void method5() {
		System.out.println("method5");
	}
	
	@Test
	public void method6() {
		System.out.println("method6");
	}
	
	@Test(priority=-1)
	public void method7() {
		System.out.println("method7");
	}
	

}
