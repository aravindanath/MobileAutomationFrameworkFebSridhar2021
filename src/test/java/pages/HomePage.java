package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage  extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(30)),this);
    }


    //OBj Repo

    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    public WebElement selectCountry;

    @AndroidFindBy(xpath = "//*[@text='Enter name here']")
    public WebElement enterNameHereTextBox;

    @AndroidFindBy(xpath = "//*[@text='Male']")
    public WebElement maleRb;

    @AndroidFindBy(xpath = "//*[@text='Female']")
    public WebElement femaleRb;

    @AndroidFindBy(xpath = "//*[contains(@text,'Let')]")
    public WebElement letsShopButton;

    @AndroidFindBy(xpath = "//*[contains(@text,'Select')]")
    public WebElement SelectTitle;

    @AndroidFindBy(xpath = "//*[contains(@text,'Your Name')]")
    public WebElement yourNameTitle;



    // business logic


    public void verifyElementsOnHomePage(){

        assertTitleWithContains(SelectTitle,"Select the country where you want to shop");
        assertTitle(yourNameTitle,"Your Name");
        assertElementIsEnabled(letsShopButton);
    }


    public void enterMandatoryFields(String country, String name){
        selectCountry.click();
        waitForElement(2000);
        scroll(driver,country);
        waitForElement(2000);
        driver.findElement(By.xpath("//*[@text='"+country+"']")).click();
        enterNameHereTextBox.sendKeys(name);
        maleRb.click();
    }

    public void clickOOnLetsShop(){
        letsShopButton.click();
    }


    public void getCountryList(){
        selectCountry.click();
        waitForElement(2000);

        List<WebElement> courty = driver.findElements(By.id("android:id/text1"));
        ArrayList<String> countryList = new ArrayList<>();
        for(WebElement ele : courty){
            countryList.add(ele.getText());

        }
        scroll(driver,"Cuba");
        waitForElement(2000);
        List<WebElement> courty1 = driver.findElements(By.id("android:id/text1"));
        for(WebElement ele : courty1){
            countryList.add(ele.getText());

        }


        System.out.println(countryList);
    }




}
