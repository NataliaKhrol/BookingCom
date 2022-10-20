package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
   WebDriver driver;

    public final static String BASE_URL = "https://www.booking.com";

    public BasePage(WebDriver driver) {
      this.driver = driver;

   }
}
