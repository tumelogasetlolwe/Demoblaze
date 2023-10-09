/**
 *
 * @author Tumelo
 */
package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import base.Framework;

import pages.HomePage;



public class DemoBlaze_Test {

    @Before
    public void setUp() {
        Framework.resetDriver();
        Framework.generateRandomNumber(0);
    }

//execute test
    @Test
    public void execute() {
        try {
            HomePage.LoadWebsite();
            Thread.sleep(3000);
            HomePage.ClickOnSignUp();
            HomePage.EnterUsername("lfvf5odss5");
           HomePage.EnterPassword("tee");
            HomePage.ClickOnSignUpButton();
            Thread.sleep(3000);
            HomePage.ClickOkay();
            Thread.sleep(3000);
            HomePage.ClickOnLogInButton();
            Thread.sleep(3000);
            HomePage.EnterLogInUsername("lgzgdoo5");
            HomePage.EnterLogInPassword("tee");
            HomePage.ClickOnLogIn();

            Thread.sleep(3000);
           HomePage.ClickOnMonitors();
            Thread.sleep(3000);
           HomePage.SelectOnAsus();
            HomePage.ClickOnAddToCart();
            Thread.sleep(3000);
            HomePage.ClickOkay();
            HomePage.ClickOnHome();
            Thread.sleep(3000);
            HomePage.ClickOnNexus();
            HomePage.AddOnNexusToCart();
            Thread.sleep(3000);
            HomePage.ClickOkay();
            HomePage.ClickOnCart();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
    }
    @After
    public void cleanUp() {
       
    }

}
