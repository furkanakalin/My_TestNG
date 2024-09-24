package Gun02;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _02_AddressFunctunality extends BaseDriver {

    @Test
    public void AddAddress(){
        WebElement addressBook= driver.findElement(By.xpath("(//*[text()='Address Book'])[2]"));
        addressBook.click();
        Tools.Bekle(1);

        WebElement newaddresss=driver.findElement(By.xpath("//*[text()='New Address']"));
        newaddresss.click();
        Tools.Bekle(1);

        WebElement firstname= driver.findElement(By.id("input-firstname"));
        firstname.sendKeys("Furkan");

        WebElement lastname = driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("Akalın");

        WebElement address1 = driver.findElement(By.id("input-address-1"));
        address1.sendKeys("Nish");

        WebElement city = driver.findElement(By.id("input-city"));
        city.sendKeys("istanbul");

        WebElement postcode = driver.findElement(By.id("input-postcode"));
        postcode.sendKeys("34197");

        WebElement country = driver.findElement(By.xpath("//*[@value='215']"));
        country.click();
        //WebElement webcountry= driver.findElement(By.id("input-country"));
        //Select country=new Select(webcountry);
        //country.selectByVisibleText("Turkey");

        WebElement region = driver.findElement(By.xpath("//*[@value='3354']"));
        region.click();
        //WebElement webregion= driver.findElement(By.id("input-region"));
        //Select region=new Select(webregion);
        //region.selectByVisibleText("istanbul");

        WebElement yes = driver.findElement(By.xpath("//*[@class='radio-inline']/*[@value='1']"));
        yes.click();

        WebElement conti = driver.findElement(By.xpath("//*[@value='Continue']"));
        conti.click();

    }
    @Test(dependsOnMethods = {"AddAddress"})
    public void Editaddress(){

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
    @Test(dependsOnMethods = {"AddAddress", "Editaddress"})
    public void DeleteAddress(){
        WebElement delete= driver.findElement(By.xpath("//*[text()='Delete']"));
        delete.click();
    }
}
