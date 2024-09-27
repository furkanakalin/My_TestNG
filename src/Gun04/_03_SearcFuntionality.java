package Gun04;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _03_SearcFuntionality extends BaseDriver {

    @Test
    @Parameters("search")
    public void SearcFuntionality(String searchword){

        WebElement searchInput=driver.findElement(By.name("search"));
        searchInput.sendKeys(searchword+ Keys.ENTER);

        List<WebElement> captions=driver.findElements(By.cssSelector("[class='caption']>h4"));

        for(WebElement e : captions)
            Assert.assertTrue(e.getText().toLowerCase().contains(searchword.toLowerCase()),
                    "Aranan kelime bulunamadı");
    }
}
