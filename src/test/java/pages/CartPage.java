package pages;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(30)),this);
    }


    //OBj Repo


    @AndroidFindAll( value= { @AndroidBy(id = "com.androidsample.generalstore:id/productPrice")})
    public List<WebElement> prices;

    @AndroidFindBy(id="com.androidsample.generalstore:id/totalAmountLbl")
    public WebElement totalAmount;


    // business logic


    public void priceCompare(){

        ArrayList<String> str = new ArrayList<>();

        for(WebElement ele : prices){
            str.add(ele.getText().replace("$","").trim());
        }
        String total =  totalAmount.getText().replace("$","").trim();

        float p1 = Float.parseFloat(str.get(0));
        float p2 = Float.parseFloat(str.get(1));
        float tot = Float.parseFloat(total);

        System.out.println("Price 1 "+ p1);
        System.out.println("Price 2 "+ p2);
        System.out.println("Total   "+ tot);

        Assert.assertEquals(p1+p2,tot,"Total amount mismatch!");



    }






}
