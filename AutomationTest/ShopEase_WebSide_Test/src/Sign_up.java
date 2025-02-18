
 //valid  SignUp....................Test (error occur: "Infinity password takes.)

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sign_up {
    public static void main(String[] args) throws InterruptedException {
      
        WebDriver driver = new ChromeDriver();

        try {
         
            driver.get("https://shop-ease-b2fc1.web.app/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300)); 
            WebElement registerLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Register")));  // Using linkText for more precision
            registerLink.click();

            WebElement usernameField = driver.findElement(By.cssSelector("input[placeholder='Username']"));
            usernameField.click();
            usernameField.sendKeys("Joy Baidya Tamanna");
                 System.out.println(" Enter User Name Joy Baidya Tamanna ");
           
            WebElement photoUrlField = driver.findElement(By.cssSelector("input[placeholder='Photo URL']"));
            photoUrlField.click();
            photoUrlField.sendKeys("https://i.ibb.co.com/jhBxxXL/FB-IMG-1630315251688.jpg");
                  System.out.println("input photo url:https://i.ibb.co.com/jhBxxXL/FB-IMG-1630315251688.jpg");
                  
            WebElement emailField = driver.findElement(By.cssSelector("input[placeholder='Email']"));
            emailField.click();
            emailField.sendKeys("joybaidya@gmail.com");
                     System.out.println("Enter Email :joybaidya@gmail.com");
          
            WebElement passwordField = driver.findElement(By.cssSelector("input[placeholder=' Choose Password']"));
            passwordField.click();
            passwordField.sendKeys("JoyTamanna");
             System.out.println("Enter Password : JoyTamanna");
           Thread.sleep(1000);
            WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
            registerButton.click();
             System.out.println(" Cleck on the Resister buton");
           
            WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
            Thread.sleep(1000);
            okButton.click();
              
            System.out.println("Cleck on the ok Button");
            System.out.println("SIGN UP SUCCESSFULLY");
            
        } catch (Exception e) {
            System.out.println("Error occurred during login test: " + e.getMessage());
        } finally {
          Thread.sleep(1000);
            driver.quit();
        }
    }
}







// invalid signUp.................................test  (error occur: "Infinity password takes.")

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sign_up {
    public static void main(String[] args) {
        // Step 1: Set up WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Step 2: Navigate to the website
            driver.get("https://shop-ease-b2fc1.web.app/");

            // Step 3: Wait for the 'Register' link to be clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Increased timeout
            WebElement registerLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Register")));  // Using linkText for more precision
            registerLink.click();

            // Step 4: Fill in the Username field
            WebElement usernameField = driver.findElement(By.cssSelector("input[placeholder='Username']"));
            usernameField.click();
            usernameField.sendKeys("Joy Baidya Nazrul");

            // Step 5: Fill in the Photo URL field
            WebElement photoUrlField = driver.findElement(By.cssSelector("input[placeholder='Photo URL']"));
            photoUrlField.click();
            photoUrlField.sendKeys("https://i.ibb.co.com/jhBxxXL/FB-IMG-1630315251688.jpg");

            // Step 6: Fill in the Email field
            WebElement emailField = driver.findElement(By.cssSelector("input[placeholder='Email']"));
            emailField.click();
            emailField.sendKeys("joybaidya@example.com");

            // Step 7: Fill in the Password field
            WebElement passwordField = driver.findElement(By.cssSelector("input[placeholder=' Choose Password']"));
            passwordField.click();
            passwordField.sendKeys("23es");

            // Step 8: Click on the 'Register' button
            WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
            registerButton.click();

            // Step 9: Handle confirmation (if applicable)
            WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
            okButton.click();

        } catch (Exception e) {
            System.out.println("Error occurred during login test: " + e.getMessage());
               System.out.println("INVALID OPERATON");
            
        } finally {
            // Step 10: Close the browser
            driver.quit();
        }
    }
}
*/













// signUp.................................test automation fill up 10 time 

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class Sign_up {
    public static void main(String[] args) {
        // Step 1: Set up WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Step 2: Navigate to the website
            String url = "https://shop-ease-b2fc1.web.app/";
            driver.get(url);

            // Step 3: Perform the registration process 10 times
            for (int i = 1; i <= 10; i++) {
                System.out.println("Attempt #" + i + " to register.");

                // Wait for the 'Register' link and click it
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
                WebElement registerLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Register")));
                registerLink.click();

                // Fill out the registration form with random data
                fillField(driver, By.cssSelector("input[placeholder='Username']"), generateRandomString(8));
                fillField(driver, By.cssSelector("input[placeholder='Photo URL']"), generateRandomPhotoUrl());
                fillField(driver, By.cssSelector("input[placeholder='Email']"), generateRandomEmail());
                fillField(driver, By.cssSelector("input[placeholder=' Choose Password']"), "JoyNazrul123");

                // Click the 'Register' button
                WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
                registerButton.click();

                // Handle confirmation dialog
                WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
                okButton.click();
                System.out.println("Registration " + i + " completed successfully.");

                // Navigate back to the home page for the next registration
                driver.navigate().to(url);
            }

        } catch (Exception e) {
            System.out.println("Error occurred during signup process: " + e.getMessage());
        } finally {
            // Step 4: Close the browser
            driver.quit();
        }
    }

    // Helper method to fill form fields
    private static void fillField(WebDriver driver, By locator, String value) {
        WebElement field = driver.findElement(locator);
        field.clear();
        field.sendKeys(value);
    }

    // Helper method to generate a random string
    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(characters.charAt(random.nextInt(characters.length())));
        }
        return builder.toString();
    }

    // Helper method to generate a random email
    private static String generateRandomEmail() {
        String domain = "@example.com";
        return generateRandomString(6) + domain;
    }

    // Helper method to generate a random photo URL
    private static String generateRandomPhotoUrl() {
        return "https://picsum.photos/200?random=" + new Random().nextInt(1000);
    }
}


*/

