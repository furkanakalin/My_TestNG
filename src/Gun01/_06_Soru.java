package Gun01;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _06_Soru extends BaseDriver {

    @Test
    public void Test(){

        WebElement newsletter= driver.findElement(By.xpath("(//a[text()='Newsletter'])[1]"));
        newsletter.click();
        Tools.Bekle(1);

        WebElement yes= driver.findElement(By.xpath("//input[@value='1']"));
        yes.click();
        Tools.Bekle(1);

        WebElement continuee= driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
        continuee.click();
        Tools.Bekle(1);

        //WebElement message= driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
        //Assert.assertTrue(message.getText().toLowerCase().contains("success"), "Yanlış Mesaj");

        Tools.SuccessMessageValidation();

    }
}
