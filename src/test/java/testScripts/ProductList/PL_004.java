package testScripts.ProductList;

import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductListPage;
import testScripts.BaseTest;

/**
 * @Author: Arvind
 * PL_004: Add 2 shoes and verify with total price
 */

public class PL_004 extends BaseTest {


    @Test
    public void HM_001(){

        HomePage hp = new HomePage(driver);
        hp.verifyElementsOnHomePage();
        hp.enterMandatoryFields("Aruba","Arvind");
        hp.clickOOnLetsShop();
        ProductListPage plp = new ProductListPage(driver);
        plp.addShoes();
        plp.addToCart();
        CartPage cp = new CartPage(driver);
        cp.priceCompare();

    }
}
