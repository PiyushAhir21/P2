package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {
		System.out.println("Execute createContactTest");
	}
	
	@Test(groups = "smokeTest")
	public void modifyContactTest() {
		System.out.println("Execute modifyContactTest");
	}
}
