import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class VitimexTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://vitimex.com.vn/dang-ky.html");

            // Điền thông tin đăng ký
            driver.findElement(By.id("name")).sendKeys("Nguyen Van Test");
            driver.findElement(By.id("phone")).sendKeys("0123456709");
            driver.findElement(By.id("email")).sendKeys("test@example.com");
            driver.findElement(By.id("pass-regis")).sendKeys("Test@1234");
            driver.findElement(By.id("pass-confirm")).sendKeys("Test@1234");

            WebElement registerBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("register-btn")));
            js.executeScript("arguments[0].scrollIntoView(true); arguments[0].click();", registerBtn);
            System.out.println("Đăng ký thành công!");
            Thread.sleep(2000);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            driver.quit();
        }
    }
}
