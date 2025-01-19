package otus.pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import otus.commons.AbsCommon;
import otus.scopeds.ScenarioCucumberScoped;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public abstract class AbsBasePage extends AbsCommon {

    @Inject
    public AbsBasePage(ScenarioCucumberScoped scenarioCucumberScoped) {
        super(scenarioCucumberScoped);
    }


    @FindBy(css = "h1")
    private WebElement header;

    private String baseUrl = System.getProperty("baseUrl", "https://otus.ru");

    public void open(String path) {
        driver.get(baseUrl + path);
    }

    public void headerShouldBeSameAs(String header) {
        assertThat(this.header.getText())
                .as("Error")
                .isEqualTo(header);
    }
}
