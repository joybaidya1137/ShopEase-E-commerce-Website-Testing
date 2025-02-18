
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonSeeAllProducttc9 {
  


    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://shop-ease-b2fc1.web.app/");
        driver.manage().window().maximize();
        
        WebElement seeAllProductButton = driver.findElement(By.xpath("//button[contains(text(),'See All Product')]"));
        seeAllProductButton.click();
         System.out.println("Step 4: All Products page is displayed successfully.");
        Thread.sleep(10000);      
      
        driver.close();
    }
    
} 
