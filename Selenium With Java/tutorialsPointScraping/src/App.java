import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.gecko.driver", "src\\drivers\\geckodriver.exe");

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://www.w3schools.com/");
        driver.findElement(By.xpath(
            "//*[@id=\"search2\"]"
            )).sendKeys("Python");

        driver.findElement(By.xpath(
            "//*[@id=\"learntocode_searchbtn\"]"
            )).click();

        Thread.sleep(5000);

        driver.quit();

    }
}
