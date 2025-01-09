package testngclasses.basics;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }


    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod
    public void beforeM(){
        System.out.println("Before Method");
    }


    @AfterMethod
    public void afterM(){
        System.out.println("After Method");
    }

    @Test
    public void demo_1(){
        System.out.println("Demo 1");
    }

    @Test(groups = "smoke")
    public void demo_2(){
        System.out.println("Demo 2");
    }

    @Test
    public void demo_3(){
        System.out.println("Demo 3");
    }
}
