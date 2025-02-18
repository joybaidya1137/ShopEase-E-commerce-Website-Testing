import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.ui.Select;

public class ProductCategoryFilterFunctionalitytc12 {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();

        try {
            // Step 2: Open the target web page
            driver.get("https://shop-ease-b2fc1.web.app/products");
            System.out.println("Step 1: Products page loaded successfully.");

            // Step 3: Define an explicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            
            // Step 6: Locate the 'Category' dropdown and select 'Laptop'
            WebElement categoryDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector
        ("select.p-2.px-4.font-bold.border-2.bg-purple-400.border-gray-100.rounded-lg")));
           Select categorySelect = new Select(categoryDropdown);
           categorySelect.selectByValue("Laptop");
           System.out.println("Step 5: 'Laptop' selected from Category dropdown.");

             // Step 7: Locate the 'Brand' dropdown and select 'Samsung'
                WebElement brandDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector
        ("select.p-2.px-4.font-bold.border-2.bg-purple-400.border-gray-100.rounded-lg.mt-4.lg\\:mt-0")));
               Select brandSelect = new Select(brandDropdown);
               brandSelect.selectByValue("Samsung");
               System.out.println("Step 6: 'Samsung' selected from Brand dropdown.");
            
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
 

/*

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class ProductCategoryFilterFunctionality {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://shop-ease-b2fc1.web.app/products");
            System.out.println("Step 1: Products page loaded successfully.");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            // Step 2: Select 'Laptop' from Category dropdown
            WebElement categoryDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector("select.p-2.px-4.font-bold.border-2.bg-purple-400.border-gray-100.rounded-lg")
            ));
            Select categorySelect = new Select(categoryDropdown);
            categorySelect.selectByValue("Laptop");
            System.out.println("Step 2: 'Laptop' selected from Category dropdown.");

            // Step 3: Select 'Samsung' from Brand dropdown
            WebElement brandDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector("select.p-2.px-4.font-bold.border-2.bg-purple-400.border-gray-100.rounded-lg.mt-4.lg\\:mt-0")
            ));
            Select brandSelect = new Select(brandDropdown);
            brandSelect.selectByValue("");
            System.out.println("Step 3: 'Samsung' selected from Brand dropdown.");

            // Step 4: Locate the product grid and count the displayed products
            WebElement productGrid = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector("div.grid.lg\\:grid-cols-4.gap-6")
            ));
            List<WebElement> productItems = productGrid.findElements(By.cssSelector("div"));
            int productCount = productItems.size();

            System.out.println("Step 4: Total products displayed: " + productCount);

        } catch (Exception e) {
            System.out.println("An error occurred during the test: " + e.getMessage());
            e.printStackTrace();
        } finally {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
*/