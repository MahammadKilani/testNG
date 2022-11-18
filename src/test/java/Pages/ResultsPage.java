package Pages;

import Utils.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Collection;

public class ResultsPage extends Setup {

    public Collection<WebElement> resultHeaders() {
        return webDriver.findElements(By.className("yuRUbf"));
    }
}
