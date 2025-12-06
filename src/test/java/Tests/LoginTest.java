package Tests;

import org.testng.annotations.Test;

import Pages.AddToCart;
import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest extends BaseTest {
	

	@Test(priority = 1)
	    public void validLoginTest() {
	        LoginPage lp = new LoginPage(driver);
	        lp.login("jervinit120@gmail.com", "Sample@123");
	        // assertions using TestNG
	    }
	 
	
	 @Test(priority = 2)
	    public void validateHomepagetext() {
	        HomePage hp = new HomePage(driver);
	        hp.hometext(); // Print texts
	    }
	 
	 @Test(priority = 3) 
	 public void validateAddtoCart() {
		AddToCart ac = new AddToCart(driver);
		ac.cart();	
		
	 }
}
