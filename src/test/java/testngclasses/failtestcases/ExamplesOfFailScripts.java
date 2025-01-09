package testngclasses.failtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExamplesOfFailScripts {

    @Test
    public void failScriptA(){
        Assert.assertFalse(true);
    }

    @Test
    public void failScriptB(){
        Assert.assertFalse(true);
    }

    @Test
    public void failScriptC(){
        System.out.println("failScriptC");
    }

    @Test
    public void failScriptD(){
        System.out.println("failScriptD");
    }

    @Test
    public void failScriptE(){
        System.out.println("failScriptE");
    }
}
