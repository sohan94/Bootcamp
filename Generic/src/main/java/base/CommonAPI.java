package base;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;


    //screenshot
    public static void captureScreenshot(WebDriver driver, String screenshotName) {

        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/screenshots/" + screenshotName + " " + df.format(date) + ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
            ;
        }

    }


    /**
     * This method create driver instance for the local execution
     *
     * @param browser  name of the browser
     * @param platform platform name
     * @return WebDriver webdriver instance for the driver
     * @Author - peoplenTech
     */
    public static WebDriver getLocalDriver(String browser, String platform) {
        if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "../Generic/src/main/resources/drivers/chromedriver");
        } else if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "../Generic/src/main/resources/drivers/chromedriver.exe");
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    /**
     * This method will take screenshot
     *
     * @param driver The webdriver instance
     * @Author - peoplenTech
     */
    public static void getScreenshot(WebDriver driver) {
        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        String name = df.format(date);
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/screenshots/" + name + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @AfterMethod
    public void quitDriver() {
        driver.close();
        driver.quit();
    }

    /**
     * This method will wait for any condition
     *
     * @param Seconds The seconds that the thread must wait
     * @Author - peoplenTech
     */
    public void sleepFor(int Seconds) {
        try {
            Thread.sleep(Seconds * 1000);
        } catch (Exception e) {
        }
    }


}