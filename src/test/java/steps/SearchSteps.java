package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.ResultPage;
import pages.SearchPage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class SearchSteps {
    WebDriver driver;
   // WebDriverWait wait;
    BasePage basePage;
    SearchPage searchPage;
    ResultPage resultPage;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
      //  wait = new WebDriverWait(driver, (20));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize(); //открывает браузер в полном окне
        basePage = new BasePage(driver);
        searchPage = new SearchPage(driver);
        resultPage = new ResultPage(driver);
    }

    @Given("user is on the search page")
    public void userIsOnTheSearchPage() {
        searchPage.open();

    }

    @When("user searches for {string}")
    public void userSearchesFor(String city) {
        searchPage.searchForHotel(city);
    }

    @Then("hotel name is {string}")
    public void hotelNameIs(String expectedHotelName) {
        assertEquals(searchPage.searchResult(), expectedHotelName, "Hotel names do not match");
    }

    @And("hotel rating is {string}")
    public void hotelRatingIs(String expectedRating) {
        assertEquals(resultPage.getRating(), expectedRating, "The rating is incorrect");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
