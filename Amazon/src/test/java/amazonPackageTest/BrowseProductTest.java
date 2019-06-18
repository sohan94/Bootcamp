package amazonPackageTest;

import amazonPackage.BrowseProduct;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowseProductTest extends CommonAPI {

    BrowseProduct browseProduct;

    @BeforeMethod
    public void init(){
        browseProduct = PageFactory.initElements(driver,BrowseProduct.class);
    }
    @Test
    public void setSerachfieldTest(){

        browseProduct.setSerachfield();
        browseProduct.setSearchfield1("sun glasses fashion men");
        browseProduct.setSearch();
        sleepFor(2);
        browseProduct.setGlasses();
        sleepFor(2);
        browseProduct.setAddcart();
        sleepFor(2);
        browseProduct.setCheckout();
        sleepFor(2);
        browseProduct.setEmail("Jeff@Selenium.com");
        sleepFor(2);
        browseProduct.setPassword("Djafar");
        sleepFor(2);
        browseProduct.setSubmit();
        sleepFor(2);
    }
}
