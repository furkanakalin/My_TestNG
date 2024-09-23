package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {

    @Test(priority = 1)
    public void DriverStart(){
        System.out.println("DriverStart");
    }
    @Test(priority = 2)
    public void OpenWebSite(){
        System.out.println("OpenWebSite");
    }
    @Test(priority = 3)
    public void LoginTest(){
        System.out.println("LoginTest");
    }
    @Test(priority = 4)
    public void SepetTest(){
        System.out.println("SepetTest");
    }
    @Test(priority = 5)
    public void DriverEnd(){
        System.out.println("DriverEnd");
    }
}
