package otus.pages;

import com.google.inject.Inject;
import otus.scopeds.ScenarioCucumberScoped;

public class MainPage extends AbsBasePage {

    @Inject
    public MainPage(ScenarioCucumberScoped scenarioCucumberScoped) {
        super(scenarioCucumberScoped);
    }
}
