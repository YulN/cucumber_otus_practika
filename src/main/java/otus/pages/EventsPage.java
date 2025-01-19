package otus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import otus.scopeds.ScenarioCucumberScoped;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EventsPage extends AbsBasePage {

    public EventsPage(ScenarioCucumberScoped scenarioCucumberScoped) {
        super(scenarioCucumberScoped);
    }

    @FindBy(css = "event_tiles")
    public List<WebElement> eventTiles;

    public void eventTilesShouldBePresent() {
        assertThat(eventTiles.size())
                .as("Error")
                .isGreaterThan(0);
    }
}
