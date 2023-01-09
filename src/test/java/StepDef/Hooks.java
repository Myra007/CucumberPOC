package StepDef;

import BasePkg.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    WebDriver driver;

    @Before
    public void setUp(){
        System.out.println("HEYY MEERA!!");
        Base base = new Base();
        base.initializeDriver();
        driver = base.getDriver();
    }


    @After
    public void tearDown(){
        System.out.println("Tearing Down");
        driver.quit();
    }
}
