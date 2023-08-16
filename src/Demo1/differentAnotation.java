package Demo1;

import org.testng.annotations.Test;

public class differentAnotation {

	@Test(enabled=false) //bydefault enabled is true
	public void method1() {
		System.out.println("method 1");
	}
	
	@Test(timeOut=500) //Suit level time out <suite name="Time test Suite" time-out="500" >
	public void method2() {
		System.out.println("method 2");
	}
	
	//We use invocation count to run same test multiple time with same data
	@Test(invocationCount =10)
	public void method3() {
		System.out.println("method 3");
	}
}
