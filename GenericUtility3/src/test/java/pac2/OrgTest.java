package pac2;

import org.testng.annotations.Test;

public class OrgTest {

	@Test
	public void createOrgTest() {
		String url = System.getProperty("url");
		System.out.println(url);
		String bro = System.getProperty("bro");
		System.out.println(bro);
	}

	@Test
	public void modifyOrgTest() {
		String un = System.getProperty("un");
		String pwd = System.getProperty("pwd");
		System.out.println(un);
		System.out.println(pwd);
	}
}
