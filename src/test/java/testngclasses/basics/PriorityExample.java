package testngclasses.basics;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 1)
    public void testScenarioZ(){
        System.out.println("Test Scenario Z");
    }

    @Test(priority = 2)
    public void testScenarioF(){
        System.out.println("Test Scenario F");
    }

    @Test(priority = 3, groups = "smoke")
    public void testScenarioP(){
        System.out.println("Test Scenario P");
    }

    @Test(priority = -4)
    public void testScenarioB(){
        System.out.println("Test Scenario B");
    }

    @Test(priority = 'a')
    public void testScenarioH(){
        System.out.println("Test Scenario H");
    }

    @Test(priority = 6, groups = "smoke")
    public void testScenarioA(){
        System.out.println("Test Scenario A");
    }
}
