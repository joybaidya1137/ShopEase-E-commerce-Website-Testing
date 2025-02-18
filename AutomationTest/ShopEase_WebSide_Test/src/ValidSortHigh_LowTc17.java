/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class ValidSortHigh_LowTc17 {
    public static void main(String[] args) throws InterruptedException {
       
        WebDriver driver = new ChromeDriver();

        try {
           
            driver.get("https://shop-ease-b2fc1.web.app/products");
            driver.manage().window().maximize();

            // Add a wait to ensure the page loads
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate the "Sort" button by its properties and click it
            WebElement sortButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(), 'PRICE: HIGH TO LOW')]")));
              Thread.sleep(1000);  
               System.out.println("Click Sorting by High to Low  ");
               sortButton.click();
               System.out.println("Sorting by High to Low completed successfully.");
               
               
             WebElement sortButton1 = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(), 'PRICE: LOW TO HIGH')]")));
             Thread.sleep(1000);   
             System.out.println("Click Sorting by Low to High ");
             sortButton1.click();
             System.out.println("Sorting by Low to High completed successfully.");
             
            
        } catch (Exception e) {
           System.out.println("An error occurred during the test: " + e.getMessage());
        } finally {
            Thread.sleep(10000);
            // Close the browser
            driver.quit();
        }
    }
}
*/