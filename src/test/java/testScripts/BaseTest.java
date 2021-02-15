package testScripts;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class BaseTest {

    protected  WebDriver driver;
    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap  = new DesiredCapabilities();
        String path = System.getProperty("user.dir")+ File.separator+"apks"+File.separator+"GeneralStore.apk";

        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, BasePage.getValue("deviceName"));
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, BasePage.getValue("platform"));
        cap.setCapability(MobileCapabilityType.UDID, BasePage.getValue("udid"));
        cap.setCapability("app",path);
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,BasePage.getValue("APP_ACTIVITY"));
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,BasePage.getValue("APP_PACKAGE"));
        driver = new AndroidDriver<MobileElement>(new URL(BasePage.getValue("url")),cap);

    }


}
