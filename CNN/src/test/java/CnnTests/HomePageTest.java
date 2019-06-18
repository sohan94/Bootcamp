package CnnTests;

import CnnObjects.CnnObject_VerifyPage;
import CnnObjects.CnnObjects_Homepage;
import CnnTests.HomePageTest;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


    public class HomePageTest extends CommonAPI {
        CnnObjects_Homepage homePage;
        CnnObject_VerifyPage pageObject;

        @BeforeMethod
        public void init (){
            homePage= PageFactory.initElements(driver,CnnObjects_Homepage.class);
            pageObject= PageFactory.initElements(driver,CnnObject_VerifyPage.class);
        }
        @Test
        public void setUsTest(){
            homePage.setUs();

        }
        @Test
        public void setWorldTest(){
            homePage.setWorld();
        }
         @Test
        public  void setPoliticsTest(){
            homePage.setPolitics();
        }
        @Test
        public void setsearchNewsTest(){
            homePage.setSearchnews();
        }


        // @Test
        public void setnewdispTest(){

            pageObject.setnewsdisp();
        }
        //@Test
        public void setLogoTest(){
            pageObject.setCNNlogo();
        }
        @Test
        public void setTextvalidationTest(){
            pageObject.setTextvalidation();

        }


    }
