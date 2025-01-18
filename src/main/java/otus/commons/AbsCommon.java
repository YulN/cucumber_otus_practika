package otus.commons;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import otus.scopeds.ScenarioCucumberScoped;

public abstract class AbsCommon {

    protected WebDriver driver;

    @Inject
    public AbsCommon(ScenarioCucumberScoped scenarioCucumberScoped) {
        this.driver = scenarioCucumberScoped.getDriver();
    }
}
