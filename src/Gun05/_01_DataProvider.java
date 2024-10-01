package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {

    @Test(dataProvider = "datalarim")
    public void UsernameTest(String username){

        System.out.println(username);

    }
    @DataProvider
    Object[] datalarim(){

        Object[] users={"Fenerbahçe", "Robin", "Furkan"};

        return users;
    }

    @Test(dataProvider = "datalarim2")
    public void UsernameTest2(int userid){

        System.out.println(userid);

    }
    @DataProvider
    Object[] datalarim2(){

        Object[] users2 ={1, 1, 1};

        return users2;
    }
}
