package Gun01;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _04_Soru extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        Tools.Bekle(1);

        WebElement myaccount= driver.findElement(By.xpath("//*[@class='dropdown-toggle']//*[text()='My Account']"));
        myaccount.click();
        Tools.Bekle(1);

        WebElement login= driver.findElement(By.xpath("//*[@class='dropdown-menu dropdown-menu-right']//*[text()='Login']"));
        login.click();
        Tools.Bekle(1);

        WebElement email= driver.findElement(By.id("input-email"));
        email.sendKeys("furkanakalin3423@gmail.com");
        Tools.Bekle(1);

        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("Sdet2025");
        Tools.Bekle(1);

        WebElement loginbtn= driver.findElement(By.xpath("//*[@value='Login']"));
        loginbtn.click();

        Assert.assertTrue(driver.getTitle().contains("My Account"));

    }
}
