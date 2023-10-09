/**
 *
 * @author Tumelo
 */
package testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import base.Framework;

import pages.HomePage;



public class angular_Test {

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
            HomePage.EnterNumber("7");
            HomePage.ClickOnCalculate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
    }
    @After
    public void cleanUp() {
       
    }

}
