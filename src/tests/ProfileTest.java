package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTest extends BasicTest {
	
//		U okviru edit profile testa potrebno je izvršiti sledeće korake:
//		učitajte stranicu http://demo.yo-meals.com/guest-user/login-form
//		ugasite lokacioni iskačući dijalog
//		prijavite se na aplikaciju preko demo naloga
//		verifikujte da je prikazana poruka sa tekstom "Login Successfull"
//		učitajte stranicu http://demo.yo-meals.com/member/profile
//		zamenite sve osnovne informacije korisnika
//		verifikujte da je prikazana poruka sa tekstom "Setup Successful"
//		odjavite se sa sajta
//		verifikujte da je prikazana poruka sa tekstom "Logout Successfull!"

	
	@Test
	public void editProfileTest() throws InterruptedException {
		String path1 = "guest-user/login-form";
		driver.get(baseUrl + path1);
		Thread.sleep(5000);
		locationPopupPage.closeSelectLocationWindow();
		Thread.sleep(2000);
		loginPage.userLoginMethod(userEmail, userPassword);
		String loginMessage = "Login Successfull";
		Assert.assertEquals(notificationSystemPage.getAlertMessage(), loginMessage, "Login message do not appear");
		notificationSystemPage.waitMessageToDisappear();
		String path2 = "member/profile";
		driver.navigate().to(baseUrl + path2);
		
		
		
		
		
	}
		
}
