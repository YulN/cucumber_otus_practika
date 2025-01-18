package otus.pages;

import com.google.inject.Inject;
import otus.commons.AbsCommon;
import otus.scopeds.ScenarioCucumberScoped;

public abstract class AbsBasePage extends AbsCommon {

    @Inject
    public AbsBasePage(ScenarioCucumberScoped scenarioCucumberScoped) {
        super(scenarioCucumberScoped);
    }

    private String baseUrl = System.getProperty("baseUrl", "https://otus.ru");

    public void open(String path) {
        driver.get(baseUrl + path);
    }
}
