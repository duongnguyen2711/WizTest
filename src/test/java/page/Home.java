package page;

import base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home extends BasePage{

    @FindBy(xpath = ".//a[text()='Sign Up For Free']")
    public WebElement lnkSignUp;

    public Home(){
        super();
        DriverContext.setUpDriver();
        DriverContext.getDriver().get("https://www.utest.com");
        DriverContext.getDriver().manage().window().maximize();
    }
}
