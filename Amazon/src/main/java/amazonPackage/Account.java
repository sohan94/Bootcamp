package amazonPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    WebElement signin;

    public void setSignin(){
        signin.click();
    }
}
