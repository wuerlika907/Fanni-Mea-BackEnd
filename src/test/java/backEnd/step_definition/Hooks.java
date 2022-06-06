package backEnd.step_definition;

import backEnd.Utiliteis.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks {

    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;
    protected Alert alert;
    protected Select select;

    //before after methods and screen shot and report is here

    @Before     //running before than each scenarios
    public void setUp() {
        driver = Driver.get();
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, 10);

        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Driver.get().manage().window().maximize();
    }

    @After //running after than each scenarios
    public void TearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "imag/png", "screenshot");
        }


        Driver.closeDriver();
    }


}
