package Methods;

import static Utils.Setup.resultsPage;
import static Utils.Setup.softAssert;

public class Assertions {

    // Assert that each result contains the search term
    // Ignore IntelliJ warning about maybe does not contain object of type String
    public void resultsAssertion(String term) {
        softAssert.assertTrue(resultsPage.resultHeaders().contains(term));
    }
}
