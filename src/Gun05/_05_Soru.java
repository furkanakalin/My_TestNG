package Gun05;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _05_Soru extends BaseDriverParameter {

     /*
     Bir önceki taskı PARAMETERDRIVER ile yapınız
     sonrasında farklı tarayıcılar ile çalıştırınız. (crossbrowser)
     sonrasında paralel çalıştırınız.(parallel)
     */

    @Test(dataProvider = "mydata")
    public void Search(String searchword){

        WebElement searchInput=driver.findElement(By.name("search"));
        searchInput.clear();
        searchInput.sendKeys(searchword+ Keys.ENTER);

        List<WebElement> captions=driver.findElements(By.cssSelector("[class='caption']>h4"));

        for(WebElement e : captions)
            Assert.assertTrue(e.getText().toLowerCase().contains(searchword.toLowerCase()),
                    "Aranan kelime bulunamadı");

    }
    @DataProvider
    Object[] mydata() {

        Object[] data = {"mac", "ipod", "samsung"};

        return data;

    }


}
