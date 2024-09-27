package Gun03;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _01_EditAccount extends BaseDriver {

    @Test
    public void Test(){

        WebElement edit= driver.findElement(By.xpath("//*[text()='Edit']"));
        edit.click();
        Tools.Bekle(2);

        WebElement firstname= driver.findElement(By.id("input-firstname"));
        firstname.clear();
        firstname.sendKeys("Robin");

        WebElement lastname = driver.findElement(By.id("input-lastname"));
        lastname.clear();
        lastname.sendKeys("Can");

        WebElement conti = driver.findElement(By.xpath("//*[@value='Continue']"));
        conti.click();
        Tools.Bekle(2);

    }
}
