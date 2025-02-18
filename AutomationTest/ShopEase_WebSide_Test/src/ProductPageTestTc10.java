/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPageTestTc10 {
    public static void main(String[] args) {

        
        WebDriver driver = new ChromeDriver();

        try {
           
            driver.get("https://shop-ease-b2fc1.web.app/");
            System.out.println("Step 1: Home page loaded successfully.");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement productsLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Products")));
            System.out.println("Step 2: 'Products' link located on the home page.");

            productsLink.click();
            System.out.println("Step 3: Clicked on the 'Products' link.");

            wait.until(ExpectedConditions.titleContains("Products"));
            System.out.println("Step 4: All Products page is displayed successfully.");

        } catch (Exception e) {
            System.out.println("An error occurred during the test: " + e.getMessage());
        } finally {
            
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
*/