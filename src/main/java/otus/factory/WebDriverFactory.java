package otus.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import otus.exceptions.BrowserNotSupportedException;
import otus.factory.settings.ChromeSettings;

public class WebDriverFactory {

    private final String browserName = System.getProperty("browser.name", "chrome");

    public WebDriver create() {
        switch (browserName) {
            case "chrome": {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver((ChromeOptions) new ChromeSettings().settings());
            }
        }
        throw new BrowserNotSupportedException(browserName);
    }
}
