package Gun01;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _08_Soru extends BaseDriver {

    By linknewsletter =By.xpath("(//a[text()='Newsletter'])[1]");
    By subyes=By.xpath("//input[@value='1']");
    By subno=By.xpath("//input[@value='0']");

    @Test
    public void Test(){

        WebElement newsletter= driver.findElement(linknewsletter);
        newsletter.click();
        Tools.Bekle(3);

        WebElement yes = driver.findElement(subyes);
        WebElement no = driver.findElement(subno);
        if (yes.isSelected()){
            no.click();
        }else
            yes.click();

        WebElement continuee= driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
        continuee.click();
        Tools.Bekle(1);

        Tools.SuccessMessageValidation();
    }
}
