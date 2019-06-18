package amazonPackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Account extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    WebElement signin;

    @FindBy(xpath = "//span[@class='nav-action-inner'][1]")
    WebElement signi2;

    @FindBy(id = "ap_email")
    WebElement email;

    @FindBy(id = "ap_password")
    WebElement pass;

    @FindBy(id = "signInSubmit")
    WebElement signbutton;

    public void setSignin(){
        signin.click();
    }

    public void setEmail(String user){
        email.sendKeys(user);
    }
    public void setPass(String password){
        pass.sendKeys(password);
    }
    public void setSignbutton(){
        signbutton.click();
    }


    public void setSigni2(String user, String password){

        WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]"));
        Actions action= new Actions(driver);
        action.moveToElement(element).build().perform();
        sleepFor(3);
        signi2.click();
        sleepFor(2);
        email.sendKeys(user);
        sleepFor(2);
        pass.sendKeys(password);
        sleepFor(2);

    }
}
