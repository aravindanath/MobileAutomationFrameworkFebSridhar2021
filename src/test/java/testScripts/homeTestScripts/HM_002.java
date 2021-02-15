package testScripts.homeTestScripts;

import org.testng.annotations.Test;
import pages.HomePage;
import testScripts.BaseTest;

/**
 * @Author: Arvind
 * HM_002: Select country and enter all the mandatoru fields.
 */

public class HM_002 extends BaseTest {


    @Test
    public void HM_001(){

        HomePage hp = new HomePage(driver);
        hp.verifyElementsOnHomePage();



    }
}
