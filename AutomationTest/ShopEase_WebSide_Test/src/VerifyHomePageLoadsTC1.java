
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class VerifyHomePageLoadsTC1 {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://shop-ease-b2fc1.web.app/");
        driver.manage().window().maximize();
        
        
        Thread.sleep(3000);      
      
        driver.close();
    }
    
}

