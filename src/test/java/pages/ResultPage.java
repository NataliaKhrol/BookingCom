package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage extends BasePage {
    //private final By SORT_BUTTON = By.cssSelector("[data-testid=sorters-dropdown-trigger]");
    private final By HOTEL_RATING = By.xpath("//div[@data-testid='review-score']/div");


    public ResultPage(WebDriver driver) {
        super(driver);
    }


    public String getRating() {
        return driver.findElement(HOTEL_RATING).getText();

    }
}