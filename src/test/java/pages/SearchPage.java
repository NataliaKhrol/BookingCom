package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    private By COUNTRY_ENTRY = By.cssSelector("[name=ss]");
    private By SUBMIT_BUTTON = By.cssSelector("[type=submit]");
    private By HOTEL_NAME = By.cssSelector("[data-testid=title]");
//private By TITLE_BUTTON = By.cssSelector("//div[contains(text(), 'IntercityHotel Dubai Jaddaf Waterfront')]");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void open() {

        driver.get(BASE_URL + "/searchresults.ru.html");
    }

    public void searchForHotel(String city) {
        driver.findElement(COUNTRY_ENTRY).sendKeys(city);
        driver.findElement(SUBMIT_BUTTON).click();
    }

    public String searchResult() {
        return driver.findElement(HOTEL_NAME).getText();
    }
}
