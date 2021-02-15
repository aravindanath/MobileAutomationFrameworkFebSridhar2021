package testScripts.homeTestScripts;

import org.testng.annotations.Test;
import pages.HomePage;
import testScripts.BaseTest;

/**
 * @Author: Arvind
 * HM_001: Verify home page elements.
 */

public class HM_001  extends BaseTest {


    @Test
    public void HM_001(){

        HomePage hp = new HomePage(driver);
        hp.verifyElementsOnHomePage();

    }
}
