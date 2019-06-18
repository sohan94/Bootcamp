package amazonPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowseProduct extends CommonAPI {

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchfield;

    @FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
    WebElement search;

    @FindBy(xpath = "//div[@class='s-result-list s-search-results sg-row']//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//span[1]//a[1]//div[1]")
    WebElement glasses;

    @FindBy(id = "add-to-cart-button")
    WebElement addcart;

    @FindBy(id = "hlb-ptc-btn-native")
    WebElement checkout;

    @FindBy(id = "ap_email")
    WebElement email;

    @FindBy(id = "ap_password")
    WebElement password;

    @FindBy(id = "signInSubmit")
    WebElement submit;

    public void setSerachfield(){
        searchfield.click();
    }
    public void setSearchfield1(String product){
        searchfield.sendKeys(product);
    }
    public void setSearch(){
        search.click();
    }
    public void setGlasses(){
        glasses.click();
    }
    public void setAddcart(){
        addcart.click();
    }
    public void setCheckout(){
        checkout.click();
    }
    public void setEmail(String username){
        email.sendKeys(username);
    }
    public void setPassword(String pass){
        password.sendKeys(pass);
    }
    public void setSubmit(){
        submit.click();
    }

}
