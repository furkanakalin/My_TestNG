package Gun02;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {

    @Test
    public void startCar(){
        System.out.println("Car Started");
        //Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    public void DriveCar(){
        System.out.println("Drive Car");
    }

    @Test(dependsOnMethods = {"startCar", "DriveCar"}) // bağımlılık 1 den fazla verilebilir
    public void ParkCar(){
        System.out.println("Park Car");
    }

    @Test(dependsOnMethods = {"ParkCar"}, alwaysRun = true) // hatali olsada sen basla
    public void stopCar(){
        System.out.println("Car Stopped");
    }
}
