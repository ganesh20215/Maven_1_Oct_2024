package testngclasses.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {


    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifyOnboarding(){
        System.out.println("Verify Onboarding");
    }
}
