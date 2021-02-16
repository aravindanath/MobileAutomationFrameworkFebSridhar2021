package testScripts.homeTestScripts;

import org.testng.annotations.Test;
import pages.HomePage;
import testScripts.BaseTest;

/**
 * @Author: Arvind
 * HM_003:Enter all mandatory filed and navigate to product listing page.
 */

public class HM_003 extends BaseTest {


    @Test
    public void HM_001(){

        HomePage hp = new HomePage(driver);
        hp.verifyElementsOnHomePage();
         hp. getCountryList();
//        hp.enterMandatoryFields("Cuba","Arvind");
//        hp.clickOOnLetsShop();




    }
}
