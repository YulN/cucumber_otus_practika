package otus.steps.components;

import com.google.inject.Inject;
import io.cucumber.java.ru.Если;
import otus.components.EventBlockComponent;

public class EventBlockSteps {

    @Inject
    private EventBlockComponent eventBlockComponent;

    @Если("Кликнуть на плитку Мероприятия")
    public void clickEventBlock(String blockTitle) {
        eventBlockComponent.clickBlockTitle();
    }

}
