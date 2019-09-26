package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import page.Home;
import page.SignUp;

import java.util.Random;

public class signUpSuccess {

    @Test
    public void SignUpSuccess(){

        Home home = new Home();
        home.lnkSignUp.click();

        SignUp signUp = new SignUp();
        int num = new Random().nextInt(5000);
        signUp.fillUpAllFields("Duong", "Nguyen", "duong.nguyen",
                "27", "November", "1992", "Male");
        String emailError = signUp.txtError.getText();
        Assert.assertEquals(emailError, "Enter valid email");

        signUp.fillUpAllFields("Duong", "Nguyen", "duong.nguyen"+num+"@gmail.com",
                "27", "November", "1992", "Male");
        String step2 = signUp.txtStepTitle.getText();
        Assert.assertEquals(step2, "Step 2: ");

        signUp.cleanUpTest();
    }

}
