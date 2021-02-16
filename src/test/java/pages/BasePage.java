package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(30)),this);
    }


    /**
     * @Author Arvind
     * This methos is to read the properties file.
     * @param key
     * @return
     */


    public static String getValue(String key){

        String path = System.getProperty("user.dir")+File.separator+"config.properties";
        String value = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(fis);
            value = prop.getProperty(key);
        }catch (Exception e){
            e.printStackTrace();
        }
        return value;
    }




    public static void assertTitle(WebElement element,String title){
        String actual = element.getText();
        Assert.assertEquals(actual,title,"Title mismatch!");
    }


    public static void assertTitleWithContains(WebElement element,String value){
        String actual = element.getText();
        System.out.println("Title: "+ actual);
        Assert.assertEquals(actual,value,"Title mismatch!");

    }


    public static void assertElementIsEnabled(WebElement element){
        boolean actual = element.isEnabled();
        System.out.println("Element is enabled? "+ actual);
        Assert.assertTrue(actual,"Element is disabled!");
    }



    public static WebElement scroll(WebDriver driver, String text){
        String automatorString = "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\""+text+"\"));";
                return ((AndroidDriver)driver).findElementByAndroidUIAutomator(automatorString);
    }

    public static void waitForElement(long sleep){

        try{
            Thread.sleep(sleep);
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}
