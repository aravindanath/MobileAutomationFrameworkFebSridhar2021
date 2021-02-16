package pages;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testScripts.BaseTest;

import java.time.Duration;
import java.util.List;

public class ProductListPage  extends BasePage {


    public ProductListPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(30)),this);
    }


    @AndroidFindAll(value = {
            @AndroidBy(xpath = "//*[@text='ADD TO CART']")})
   public List<WebElement> addToCart;


    @AndroidFindBy(id ="com.androidsample.generalstore:id/appbar_btn_cart")
    public WebElement cart;



    public void addShoes(){
       int val =  addToCart.size();
       System.out.println("Total shoes: "+ val);
       for(WebElement ele : addToCart){
           ele.click();
       }
    }


    public void addToCart(){
        cart.click();
    }






}
