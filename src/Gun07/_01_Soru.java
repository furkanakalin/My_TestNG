package Gun07;

import Gun06._05_PlaceHolder_Elementleri;
import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Soru extends BaseDriver {

    @Test
    public void addToCart(){

        _05_PlaceHolder_Elementleri poe=new _05_PlaceHolder_Elementleri();
        _01_Elements sre=new _01_Elements();

        poe.searchInput.sendKeys("ipod", Keys.ENTER);

        int randonsec= Tools.randomGenerator(sre.productListAddCart.size());
        System.out.println(randonsec);

        String tiklanacakurun=sre.productListCaption.get(randonsec).getText();
        sre.productListCaption.get(randonsec).click();

        poe.shoppingCart.click();

        boolean productfind=false;
        for (WebElement product:sre.productListBasket){

            if (product.getText().equals(tiklanacakurun)){
                productfind=true;
                break;
            }
        }

        Assert.assertTrue(productfind, "Not found");

    }
}
