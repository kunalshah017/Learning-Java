
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.firefox.marionette", "src\\drivers\\geckodriver.exe");

        FirefoxDriver driver = new FirefoxDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");

        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form")).submit();

        System.out.println("Login successful!");    

        Thread.sleep(5000);

        System.out.println("Employee Name: " + driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")).getText());
    }
}
