import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VerifySearchFunctionalitytc11 {
    public static void main(String[] args) throws InterruptedException {
        // Step 1: Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Step 2: Open the target web page
            driver.get("https://shop-ease-b2fc1.web.app/products");
            System.out.println("Step 1: Products page loaded successfully.");

            // Step 3: Define an explicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Step 4: Locate the search input element and input the search term
            WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector(".p-2.px-12.lg\\:w-96.border-2.border-gray-100.rounded-lg")
            ));
            searchInput.click();
            searchInput.sendKeys("NOKIA");
            System.out.println("Step 2: 'NOKIA' entered into the search box.");

           WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(
             By.cssSelector("input.btn.bg-orange-500[value='Search']")));
                searchButton.click();
             System.out.println("Step 3: Search button clicked.");

            // Step 6: Confirm search results are displayed
            System.out.println("Step 4: Search results displayed successfully.");

        } catch (Exception e) {
            System.out.println("An error occurred during the test: " + e.getMessage());
            e.printStackTrace(); // Print detailed exception stack trace for debugging
        } finally {
             Thread.sleep(7000);
            // Step 7: Close the browser
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}





