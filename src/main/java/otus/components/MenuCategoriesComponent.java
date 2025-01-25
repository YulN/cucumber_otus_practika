package otus.components;

import com.google.inject.Inject;
import org.openqa.selenium.By;
import otus.commons.AbsCommon;
import otus.scopeds.ScenarioCucumberScoped;

public class MenuCategoriesComponent extends AbsCommon {
    @Inject
    public MenuCategoriesComponent(ScenarioCucumberScoped scenarioCucumberScoped) {
        super(scenarioCucumberScoped);
    }

    public void clickCategoryInMenu(String category) {
        By locator = By.xpath("//*[text()='%s']");
        $(locator).click();
    }
}
