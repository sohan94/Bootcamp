package amazonPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyItem extends CommonAPI {

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchfield;

    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
    WebElement submit;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[2]/div/div/div/div/div/div[2]/div[1]/div/div/span/a/div/img")
    WebElement soccer;

    @FindBy(xpath = "//*[@id=\"acrCustomerReviewText\"]")
    WebElement picture1;

    @FindBy(xpath = "//*[@id=\"vpcButton\"]/span/a")
    WebElement details;


    public void setSerachfield(String item){
        searchfield.click();
        sleepFor(2);
        searchfield.sendKeys(item);
        sleepFor(2);
    }
    public void setSubmit(){
        submit.click();
        sleepFor(2);
    }
    public void setSoccer(){
        soccer.click();
    }
    public void setPicture1(){
        picture1.click();
    }
    public void setDetails(){
        details.click();
    }

}
