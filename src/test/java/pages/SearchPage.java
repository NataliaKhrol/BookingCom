package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    private By COUNTRY_BUTTON = By.cssSelector("[name=ss]");
    private By SUBMIT_BUTTON = By.cssSelector("[type=submit]");
    private String actualHotelName;
    private By TITLE_BUTTON = By.cssSelector("[data-testid=title]");
//private By TITLE_BUTTON = By.cssSelector("//div[contains(text(), 'IntercityHotel Dubai Jaddaf Waterfront')]");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void open() {

        driver.get(BASE_URL);
    }

    public void searchForHotel(String country) {
        driver.findElement(COUNTRY_BUTTON).sendKeys(country);
        driver.findElement(SUBMIT_BUTTON).click();
    }

    public String actualName() {
      actualHotelName = driver.findElements(TITLE_BUTTON).get(0).getText();
        return actualHotelName;
  //     return actualHotelName;
    }


    }
