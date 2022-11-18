package Utils;

import org.testng.annotations.DataProvider;

public class DataProviders {
    // This one is providing a single String as a search term
    // We can use an Excel reader or File CSV reader inside it to get data from outsource
    // For this example we use static data
    @DataProvider(name = "searchTermsProvider")
    public Object[][] Data() {
        return new Object[][]{
                {"Adam"}, {"Help"}, {"Free"}
        };
    }
}
