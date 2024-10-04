package Gun07;

import Gun06._05_PlaceHolder_Elementleri;
import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
    Senaryo ;
    1- Siteye gidiniz..

   1.Test;
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elamnlardan random bir elelamnı Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */

public class _02_Soru extends BaseDriver {

    @Test
    @Parameters("searchtext")
    public void addToWishList(String searchtext){

        _05_PlaceHolder_Elementleri poe=new _05_PlaceHolder_Elementleri();
        poe.searchInput.sendKeys(searchtext+ Keys.ENTER);
        _01_Elements sre=new _01_Elements();

        int randomsec= Tools.randomGenerator(sre.productListCaption.size());
        System.out.println(randomsec);

        String clickableproduct=sre.productListCaption.get(randomsec).getText();
        sre.productListAddWish.get(randomsec).click();

        sre.wishList.click();

        boolean productfound = Tools.listContainsString(sre.productListWish, clickableproduct);
        Assert.assertTrue(productfound, "Not found in Wishlist which is selected");

    }
}
