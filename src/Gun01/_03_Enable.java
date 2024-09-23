package Gun01;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class _03_Enable {
    @Test
    public void Test1(){
        System.out.println("Test 1 çalıştı");
        driver.get("https://www.facebook.com/");
    }
    @Test(enabled = false)//şimdilik çalışma
    public void Test2(){
        System.out.println("Test 2 çalıştı");
    }
    @Test
    public void Test3(){
        System.out.println("Test 3 çalıştı");
        driver.get("https://www.google.com/");
    }

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static JavascriptExecutor js;

    @BeforeClass
    public void Baslangicislemleri(){
        System.out.println("Baslangicislemleri yapılıyor");

        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        wait=new WebDriverWait(driver, Duration.ofSeconds(20));

        js=(JavascriptExecutor)driver;
    }
    @AfterClass
    public void Kapanisislemleri(){
        System.out.println("Kapanisislemleri yapılıyor");
        driver.quit();
    }
}
