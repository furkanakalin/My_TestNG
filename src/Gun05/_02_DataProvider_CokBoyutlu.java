package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {

    @Test(dataProvider = "Userdata")
    public void UsernamePasswordTest(String username, int password){

        System.out.println(username+" "+password);

    }
    @DataProvider
    Object[][] Userdata(){

        Object[][] users={{"Furkan", 1}, {"Robin", 1},{"Fenerbahçe", 1}};

        return users;
    }
}
