package tests;

import org.testng.annotations.Test;

public class ProfileTest extends BasicTest {
	
	@Test
	public void editProfileTest() {
		this.driver.get(baseUrl + "guest-user/login-form");
		
	}
		
}
