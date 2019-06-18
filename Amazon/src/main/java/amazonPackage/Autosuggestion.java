package amazonPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Autosuggestion extends CommonAPI {

    @FindBy(xpath = "//a[@class='nav-imageHref']//img")
    WebElement deals;

    @FindBy(xpath = "//a[contains(text(),'daily deals email')]")
    WebElement details;

    @FindBy(xpath = "//input[@name='verify']")
    WebElement verify;

    @FindBy(id = "ap_email")
    WebElement email;

    @FindBy(id = "ap_password")
    WebElement pass;

    @FindBy(id = "signInSubmit")
    WebElement submit;

    public void setDeals(){
        deals.click();
    }
    public void setDetails(){
        details.click();
    }
    public void setVerify(){
        verify.click();
    }
    public void setEmail(String name){
        email.sendKeys(name);
    }
    public void setPass(String password){
        pass.sendKeys(password);
    }
    public void setSubmit(){
        submit.click();
    }
}
