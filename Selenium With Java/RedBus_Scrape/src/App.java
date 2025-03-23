import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.firefox.marionette", "src\\drivers\\geckodriver.exe");

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.redbus.in/");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter From : ");
        String from = sc.nextLine();

        System.out.print("Enter To : ");
        String to = sc.nextLine();

        driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys(from);
        driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys(to);

        driver.findElement(By.xpath("//*[@id=\"search_button\"]")).click();

        driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[4]/div/div[2]/div/div/div[3]/div[5]/span/div[4]")).click();
    
        driver.findElement(By.xpath("//*[@id=\"search_button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"search_button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"search_button\"]")).click();

    }
}
