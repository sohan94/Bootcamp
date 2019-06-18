package testCignaPackage;

import base.CommonAPI;
import cignaPackage.HealthCoverage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHealthCoverage extends CommonAPI {

    HealthCoverage healthCoverage;

    @BeforeMethod
    public void initialization(){
        healthCoverage= PageFactory.initElements(driver, HealthCoverage.class);
    }

    @Test(enabled = false)
    public void testSetPlan1(){
        healthCoverage.setPlan1();
    }

    @Test(enabled = false)
    public void testSetPlan2(){
        healthCoverage.setPlan2();
    }

    @Test(enabled = false)//to run
    public void testSetPlan3(){
        healthCoverage.setPlan3();
    }

    @Test(enabled = false)
    public void testSetPlan4(){
        healthCoverage.setPlan4();
    }

}