package Gun01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _02_Annotation {

    @Test
    public void Test1(){
        System.out.println("Test 1 çalıştı");
    }
    @Test
    public void Test2(){
        System.out.println("Test 2 çalıştı");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass bölümü çalıştı");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass bölümü çalıştı");
    }
}
