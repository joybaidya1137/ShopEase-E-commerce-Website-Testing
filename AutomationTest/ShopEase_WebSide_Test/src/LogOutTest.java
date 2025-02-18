/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutTest {
    public static void main(String[] args) {
       

        WebDriver driver = new ChromeDriver();
      
        try {
            // Step 1: Navigate to the website
            driver.get("https://shop-ease-b2fc1.web.app/");
            driver.manage().window().maximize();

            // Step 2: Wait for the 'Logout' link and click
            WebElement logoutLink = driver.findElement(By.cssSelector(".btn.btn-info.font-bold.text-lg"));
            Thread.sleep(1000);
    
            logoutLink.click();
          
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
*/