package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utils.Setup.webDriver;

public class SearchPage {
    public WebElement searchField(){
        return webDriver.findElement(By.name("q"));
    }
}
