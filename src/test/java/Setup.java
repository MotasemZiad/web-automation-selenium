import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class Setup {

    @Test
    public void initialize(){
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://google.com");
    }
}
