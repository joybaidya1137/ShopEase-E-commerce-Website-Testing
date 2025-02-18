import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class PriceFilterTest15 {
    public static void main(String[] args) throws InterruptedException {
      
        WebDriver driver = new ChromeDriver();
      try {
           
            driver.get("https://shop-ease-b2fc1.web.app/products");
            driver.manage().window().maximize();
        
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
            WebElement minPriceInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@placeholder='Min Price']")));
            minPriceInput.click();
            minPriceInput.clear();
            minPriceInput.sendKeys("200");
             System.out.println("input min Price 20");
             
            WebElement maxPriceInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//input[@placeholder='Max Price']")));
            maxPriceInput.click();
            maxPriceInput.clear();
            maxPriceInput.sendKeys("1000");       
             System.out.println("input max Price 1000 ");

            
            System.out.println("Price range set successfully!");   
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           Thread.sleep(40000);
            driver.quit();
        }
    }
}
