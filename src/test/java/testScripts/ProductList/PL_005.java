package testScripts.ProductList;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductListPage;
import testScripts.BaseTest;

public class PL_005 extends BaseTest {


    @Test
    public void HM_001(){

        HomePage hp = new HomePage(driver);
        hp.verifyElementsOnHomePage();
        hp.enterMandatoryFields("Aruba","Arvind");
        hp.clickOOnLetsShop();
        ProductListPage plp = new ProductListPage(driver);
        plp.addShoes();
        plp.addToCart();
}}
