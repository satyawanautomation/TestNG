package Demo1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	@Test
	@Parameters("url")
	public void method1(String url) {
	
	System.out.println(url);
		
	}
	
	@Test
	@Parameters({"username","password"})
	public void method1(String username ,String password) {
	
	System.out.println(username);
	System.out.println(password);
		
	}

}
