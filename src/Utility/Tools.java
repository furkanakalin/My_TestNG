package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static Utility.BaseDriver.driver;

public class Tools {

    public static void Bekle(int sn){

        try {
            Thread.sleep(sn*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void SuccessMessageValidation(){
        WebElement message= driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(message.getText().toLowerCase().contains("success"), "Yanlış Mesaj");
    }
    public static int randomGenerator(int sinir){
        return (int)(Math.random()*sinir);
    }
    public static boolean listContainsString(List<WebElement> list, String searchtext ){
        boolean productfound =false;
        for(WebElement product : list)
        {
            if (product.getText().equals(searchtext)) {
                productfound = true;
                break;
            }
        }
        return productfound;
    }

}
