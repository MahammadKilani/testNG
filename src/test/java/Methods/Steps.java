package Methods;

import org.openqa.selenium.Keys;

import static Utils.Setup.searchPage;
import static Utils.Setup.webDriver;

public class Steps {

    // Go to Google
    public void openSearchPage() {
        webDriver.get("https://www.google.com/");
    }

    // Search for a given word
    public void input(String searchTerm) {
        searchPage.searchField().clear();
        searchPage.searchField().sendKeys(searchTerm);
    }

    // Hit Enter in Search
    public void hitEnter(){
        searchPage.searchField().sendKeys(Keys.ENTER);
    }


}