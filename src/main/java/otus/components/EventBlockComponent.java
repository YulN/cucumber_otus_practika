package otus.components;

import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import otus.commons.AbsCommon;
import otus.scopeds.ScenarioCucumberScoped;

public class EventBlockComponent extends AbsCommon {

    @Inject
    public EventBlockComponent(ScenarioCucumberScoped scenarioCucumberScoped) {
        super(scenarioCucumberScoped);
    }

    @FindBy(css = ".event_block")
    private WebElement blockTitle;

    public void clickBlockTitle() {
        blockTitle.click();
    }
}
