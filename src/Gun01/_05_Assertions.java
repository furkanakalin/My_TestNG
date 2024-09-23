package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_Assertions {

    @Test
    public void Equals(){

        String s1="Furkan";
        String s2="Robin";

        Assert.assertEquals(s1,s2,"Eşit değiller");//Eşit değiller yazdıracak
    }
    @Test
    public void NotEquals(){
        String s1="Furkan";
        String s2="Furkan";

        Assert.assertNotEquals(s1,s2,"Eşitler"); //Eşitler yazdıracak
    }
    @Test
    public void True(){
        String s1="Furkan";
        String s2="Furkan";

        Assert.assertTrue(s1.equals(s2),"Eşit değiller"); //birşey yazdırmayacak
    }
    @Test
    public void Null(){
        String s1=null;

        Assert.assertNull(s1,"değer null değil");//birşey yazdırmayacak
    }
}
