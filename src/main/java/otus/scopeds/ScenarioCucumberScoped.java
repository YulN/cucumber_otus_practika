package otus.scopeds;

import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class ScenarioCucumberScoped {


    private WebDriver driver = new WebDriverFactory.create();
    public WebDriver getDriver(){
        return new
    }
}
