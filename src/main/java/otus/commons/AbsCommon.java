package otus.commons;

import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import otus.scopeds.ScenarioCucumberScoped;

public abstract class AbsCommon {

    protected WebDriver driver;

    @Inject
    public AbsCommon(ScenarioCucumberScoped scenarioCucumberScoped) {
        this.driver = scenarioCucumberScoped.getDriver();
    }

    protected WebElement $(By by) {
        return driver.findElement(by);
    }
}
