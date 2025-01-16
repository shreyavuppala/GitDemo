package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

    @Test(groups={"Smoke"})
    public void Demo2(){
        System.out.println("Bye");
    }
    @BeforeTest
    public void prerequiste(){
        System.out.println("I will execute first");
    }
}
