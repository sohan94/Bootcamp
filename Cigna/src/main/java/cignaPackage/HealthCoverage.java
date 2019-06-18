package cignaPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HealthCoverage extends CommonAPI {

    @FindBy(xpath = "(//a[@class='link-unstyled subhead-4'])[1]")
    WebElement plan1;

    @FindBy(xpath = "(//a[@role='button'])[9]")
    WebElement learnplan;

    @FindBy(xpath = "(//a[@class='link-unstyled subhead-4'])[2]")
    WebElement plan2;

    @FindBy(xpath = "(//a[@role='button'])[13]")
    WebElement quote;

    @FindBy(xpath = "(//a[@class='link-unstyled subhead-4'])[3]")
    WebElement plan3;

    @FindBy(xpath = "(//a[@class='link-unstyled subhead-4'])[4]")
    WebElement plan4;

    @FindBy(id = "input_002")
    WebElement firstname;

    @FindBy(id = "input_003")
    WebElement lastname;

    @FindBy (xpath = "//md-icon[@class='fa fa-calendar vpush-2 fs-9 ng-isolate-scope md-default-theme']")
    WebElement icon;
    @FindBy (xpath = "//md-input-container[@class='md-default-theme md-input-has-value']")
    WebElement years;



    public void setPlan1(){
        System.out.println(plan1.getText());
        plan1.click();
        System.out.println(learnplan.getText());
        learnplan.click();
        System.out.println(driver.getCurrentUrl());
    }

    public void setPlan2(){
        System.out.println(plan2.getText());
        plan2.click();
        System.out.println(quote.getText());
        quote.click();
        System.out.println(driver.getCurrentUrl());

    }

    public void setPlan3(){
        System.out.println(plan3.getText());
        plan3.click();
        System.out.println(quote.getText());
        quote.click();
        System.out.println(driver.getCurrentUrl());
        handleNewTab(driver);
        firstname.sendKeys("Daljeet");
        lastname.sendKeys("Alli");
        icon.click();
        years.click();
        years.click();
        years.click();
        years.click();
        years.click();


    }

    public void setPlan4(){
        System.out.println(plan4.getText());
        plan4.click();

    }
}
