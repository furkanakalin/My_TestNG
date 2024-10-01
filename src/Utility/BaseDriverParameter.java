package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseDriverParameter {
    public WebDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;

    @BeforeClass
    @Parameters("browsertype")
    public void Baslangicislemleri(String browsertype){
        System.out.println("Baslangicislemleri yapılıyor");

        switch (browsertype.toLowerCase()){

            case "firefox":driver=new FirefoxDriver();break;
            case "edge":driver=new EdgeDriver();break;
            case "safari":driver=new SafariDriver();break;
            default:driver=new ChromeDriver();

        }

        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        wait=new WebDriverWait(driver, Duration.ofSeconds(20));

        js=(JavascriptExecutor)driver;

        Login();
    }
    @AfterClass
    public void Kapanisislemleri(){
        System.out.println("Kapanisislemleri yapılıyor");

        Tools.Bekle(3);
        driver.quit();
    }
    public void Login() {

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        Tools.Bekle(1);

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("furkanakalin3423@gmail.com");
        Tools.Bekle(1);

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("Sdet2025");
        Tools.Bekle(1);

        WebElement loginbtn = driver.findElement(By.xpath("//*[@value='Login']"));
        loginbtn.click();
    }
}
