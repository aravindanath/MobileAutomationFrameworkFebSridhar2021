package testScripts.homeTestScripts;

import org.testng.annotations.Test;
import pages.HomePage;
import testScripts.BaseTest;

/**
 * @Author: Arvind
 * HM_004: Add 2 shoes and verify with total price
 */

public class HM_004 extends BaseTest {


    @Test
    public void HM_001(){

        HomePage hp = new HomePage(driver);
        hp.verifyElementsOnHomePage();
        hp.enterMandatoryFields("Aruba","Arvind");
        hp.clickOOnLetsShop();




    }
}
