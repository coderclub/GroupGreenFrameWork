package serviceStatusHomePage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import reporting.TestLogger;

public class TestServiceStatus extends HomePage {
    HomePage servicestatus;
    @BeforeMethod
    public void initialization(){servicestatus=new HomePage(driver);}

    @Test(priority = 1,enabled = true)
    public void checkServiceStatusComponents(){
        clickOnStatusServicesComponents();
        Assert.assertTrue(true);
    }
    @Test
    public void languageOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectLanguage();
    }
    @Test
    public void checkBusTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        cickOnBus();
    }
    @Test
    public void checkBridge(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnBridge();
    }



}
