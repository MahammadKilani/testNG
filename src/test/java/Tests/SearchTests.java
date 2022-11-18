package Tests;

import Methods.Assertions;
import Utils.Setup;
import org.testng.annotations.Test;

// any test class should extend setup class, to be able to see @BeforeTest and @AfterTest from another package
public class SearchTests extends Setup {

    // To make data driven testing we provide a Data Provider class
    // In this example for better arranging the Data Provider class in another package
    // Make sure that the output number and type match the input for this method
    @Test(dataProviderClass = Utils.DataProviders.class, dataProvider = "searchTermsProvider")
    public void search(String term) {
        //Test steps
        tests.openSearchPage();
        tests.input(term);
        tests.hitEnter();
        // Assertions
        assertions.resultsAssertion(term);
    }
}
