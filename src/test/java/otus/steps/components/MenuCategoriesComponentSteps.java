package otus.steps.components;

import com.google.inject.Inject;
import io.cucumber.java.ru.Если;
import otus.components.MenuCategoriesComponent;

public class MenuCategoriesComponentSteps {

    @Inject
    private MenuCategoriesComponent menuCategoriesComponent;

    @Если("Кликнуть по меню (.*)")
    public void clickByMenuCategory(String category) {
        menuCategoriesComponent.clickCategoryInMenu(category);
    }
}
