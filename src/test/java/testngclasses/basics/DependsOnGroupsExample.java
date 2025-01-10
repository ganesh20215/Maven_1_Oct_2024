package testngclasses.basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsExample {

    @Test(groups = {"smoke"})
    public void verifyAddAccountInPayee(){
        Assert.assertTrue(false);
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyFundTransfer(){
        System.out.println("Verify Fund Transfer");
    }

    @Test
    public void verifyCashBackOffer(){
        System.out.println("Verify Cash back Offer");
    }
}
