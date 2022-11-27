package Utils;

import Methods.Assertions;
import Methods.Steps;
import Pages.ResultsPage;
import Pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class Setup {

    // Static objects which will save a lot of memory
    public static WebDriver webDriver;
    public static Steps steps;
    public static SearchPage searchPage;
    public static ResultsPage resultsPage;
    public static SoftAssert softAssert;
    public static Assertions assertions;

    // Before test has to declare the initiation of each declared Static Object
    @BeforeTest
    public static void Start() {

        // This options to make Headless Mode no GUI
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        // To disable this, and show GUI Testing Comment Chrome Options
        // And remove options from webDriver = new ChromeDriver(options); in next line

        webDriver = new ChromeDriver(options);
        searchPage = new SearchPage();
        resultsPage = new ResultsPage();
        steps = new Steps();
        softAssert = new SoftAssert();
        assertions = new Assertions();
    }

    // Before test has to be .quit not .close to terminate the driver completely
    @AfterTest
    public static void Teardown() {
        webDriver.quit();
    }
}
