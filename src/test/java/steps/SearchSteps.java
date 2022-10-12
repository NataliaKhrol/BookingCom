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

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class SearchSteps {
        WebDriver driver;

        @Before
        public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize(); //открывает браузер в полном окне
    }

    @Given("user is on the search page")
    public void userIsOnTheSearchPage() {


        driver.get("https://www.booking.com/searchresults.ru.html");
    }

    @When("user searches for {string}")
    public void userSearchesFor(String city) {
        driver.findElement(By.cssSelector("[name=ss]")).sendKeys(city);
        driver.findElement(By.cssSelector("[type=submit]")).click();
    }

    @Then("hotel name is {string}")
    public void hotelNameIs(String expectedHotelName) {
           String actualHotelName = driver.findElement(By.cssSelector("[data-testid=title]")).getText();
            assertEquals(actualHotelName, expectedHotelName, "");
    }

    @And("hotel rating is {string}")
    public void hotelRatingIs(String arg0) {
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
