package otus.steps.pages;

import com.google.inject.Inject;
import io.cucumber.java.ru.Тогда;
import otus.pages.EventsPage;

public class EventPageSteps {

    @Inject
    private EventsPage eventsPage;

    @Тогда("Откроется страница с заголовком {string}")
    public void pageShouldBeHeaderSameAs(String header) {
        eventsPage.headerShouldBeSameAs(header);
    }

    @Тогда("На странице мероприятия отображаются плитки событий")
    public void eventsTilesListShouldBePresent() {
        eventsPage.eventTilesShouldBePresent();
    }
}
