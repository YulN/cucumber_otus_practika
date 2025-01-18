package otus.scopeds;

import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;
import otus.factory.WebDriverFactory;

@ScenarioScoped
public class ScenarioCucumberScoped {

    private final WebDriver driver = new WebDriverFactory().create();

    public WebDriver getDriver() {
        return driver;
    }
}
