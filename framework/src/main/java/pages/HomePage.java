

/**
 *
 * @author Tumelo
 */

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import base.Driver;
import base.SeleniumUtil;
import java.util.List;


public class HomePage {
    public static void LoadWebsite() {
        Driver.getWebInstance().manage().window().maximize();
        Driver.getInstance().get(SeleniumUtil.BASE_URL_STRING);

        
    }
     public static void EnterNumber(String number) {

        Driver.getInstance().wait(5,
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("#number"))).sendKeys(number);
    }
    public static WebElement ClickCalculate() {
        return Driver.getInstance().wait(5, ExpectedConditions.
                presenceOfElementLocated(By.xpath("//*[@id=\"getFactorial\"]")));
    }

       public static void ClickOnCalculate() {
        ClickCalculate().click();
    }
}
