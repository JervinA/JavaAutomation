package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;

    // Locators
    private By gettext1 = By.xpath("(//*[contains(text(),'Automation')])[1]");
    private By gettext2 = By.xpath("(//*[contains(text(),'Automation')])[2]");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void hometext() {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	
    	WebElement ele1 = wait.until(ExpectedConditions.visibilityOfElementLocated(gettext1));
        WebElement ele2 = wait.until(ExpectedConditions.visibilityOfElementLocated(gettext2));
    	
        String text1 = ele1.getText();
        String text2 = ele2.getText();

        System.out.println("Text from first element: " + text1);
        System.out.println("Text from second element: " + text2);
        
    }
	
}
