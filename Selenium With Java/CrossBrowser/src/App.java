import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Select your browser");
        System.out.println("1. Chrome");
        System.out.println("2. Firefox");
        System.out.println("3. Edge");

        int browser = Integer.parseInt(System.console().readLine());

        WebDriver driver = null;

        switch (browser) {
            case 1:
                System.out.println("Chrome");
                System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case 2:
                System.out.println("Firefox");
                System.setProperty("webdriver.gecko.driver", "src\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case 3:
                System.out.println("Edge");
                System.setProperty("webdriver.edge.driver", "src\\drivers\\msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Invalid Browser");
                break;
        }

        driver.get("https://www.google.com");
        
        System.out.println(driver.getTitle());

        Thread.sleep(5000);

        driver.quit();
    }
}
