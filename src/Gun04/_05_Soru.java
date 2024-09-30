package Gun04;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _05_Soru extends BaseDriverParameter {

    /*

   Senaryo
   1- Siteye gidiniz
   2- Specials tiklayiniz
   3- Cikan urun lerde (bütün ürünlerde indirim var mı, eski fiyat yeni fiyat var mı)
   4- Yukarıdaki işlemden sonra her ürünün önceki fiyatının şu andaki fiyattan
      yüksek olduğunu doğrulayınız.
   5- Yukarıdaki işlemi 2 farklı browserda ve paralel şekilde test ediniz.
*/

    @Test
    public void Soru(){

        WebElement specials= driver.findElement(By.xpath("//*[text()='Specials']"));
        specials.click();

        List<WebElement> products=driver.findElements(By.xpath("//*[@class='product-thumb']"));

        for (WebElement product:products){

            WebElement oldprice=product.findElement(By.xpath("//*[@class='price-old']"));
            WebElement newprice=product.findElement(By.xpath("//*[@class='price-new']"));

            Assert.assertTrue(oldprice.isDisplayed(),"Eski fiyat görünmüyor");
            Assert.assertTrue(newprice.isDisplayed(),"Yeni fiyat görünmüyor");

            String stroldprice=oldprice.getText().replace("$","");
            String strnewprice= newprice.getText().replace("$","");

            Double dbloldprice=Double.parseDouble(stroldprice);
            Double dblnewprice=Double.parseDouble(strnewprice);

            if (dbloldprice>dblnewprice)
                System.out.println("İndirim var");
            else
                System.out.println("Hata var, indirim yapılmamış,");
        }
    }
}
