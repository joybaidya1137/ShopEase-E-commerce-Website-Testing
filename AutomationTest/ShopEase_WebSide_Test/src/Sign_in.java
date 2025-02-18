// vadid sign in .................test

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sign_in {
    public static void main(String[] args) {
     
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
          
            driver.get("https://shop-ease-b2fc1.web.app/login");

         
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));  // Increased timeout
            WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));  // Using linkText for more precision
            loginLink.click();
                 
            WebElement emailField = driver.findElement(By.cssSelector("input[placeholder='Email']"));
            emailField.click();
            emailField.sendKeys("joybaidya@gmail.com");
             System.out.println("joybaidya@gmail.com"); 
         
             
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.click();
            passwordField.sendKeys("JoyTamanna");
            System.out.println("JoyTamanna");
        
             WebElement passwordButton = driver.findElement(By.xpath("//button[text()='Log in']"));
            passwordButton.click();
            System.out.println("Log in Successfull");
        
            WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
            okButton.click();


        } catch (Exception e) {
            System.out.println("Error occurred during login test: " + e.getMessage());
             System.out.println("Password correct and Email correct use");
        } finally {
           
            driver.quit();
        }
    }
} 











//Invalid sign in... password right but Email incorrect use ........

/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sign_in {
    public static void main(String[] args) {
        // Step 1: Set up WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Step 2: Navigate to the website
            driver.get("https://shop-ease-b2fc1.web.app/login");

            // Step 3: Wait for the 'Register' link to be clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Increased timeout
            WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));  // Using linkText for more precision
            loginLink.click();
            // Step 6: Fill in the Email field
            WebElement emailField = driver.findElement(By.cssSelector("input[placeholder='Email']"));
            emailField.click();
            emailField.sendKeys("bangladesh12@gmail.com");
            System.out.println("incurrect email= bangladesh12@gmail.com");
            // Step 7: Fill in the Password field
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.click();
            passwordField.sendKeys("JoyNazrul");
             System.out.println("correct password");
            // Step 8: Click on the 'Register' button
            WebElement passwordButton = driver.findElement(By.xpath("//button[text()='Log in']"));
            passwordButton.click();

            // Step 9: Handle confirmation (if applicable)
            WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
            okButton.click();

        } catch (Exception e) {
            System.out.println("Error occurred during login test: " + e.getMessage());
            System.out.println("Password Correct and Email Incorrect use");
        } finally {
            // Step 10: Close the browser
            driver.quit();
        }
    }
} 








/*
//Invalid sign in... password Incrrret but Email Correct use ........

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Sign_in {
    public static void main(String[] args) {
        // Step 1: Set up WebDriver
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://shop-ease-b2fc1.web.app/login");

            // Step 3: Wait for the 'Register' link to be clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Increased timeout
            WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));  // Using linkText for more precision
            loginLink.click();
            // Step 6: Fill in the Email field
            WebElement emailField = driver.findElement(By.cssSelector("input[placeholder='Email']"));
            emailField.click();
            emailField.sendKeys("joybaidya@example.com");
               System.out.println(" Email correct use = joybaidya@example.com ");
            // Step 7: Fill in the Password field
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.click();
            passwordField.sendKeys("hfjdhfjdshfj");
                  System.out.println("Password is incorrect = hfjdhfjdshfj ");
            // Step 8: Click on the 'Register' button
            WebElement passwordButton = driver.findElement(By.xpath("//button[text()='Log in']"));
            passwordButton.click();
            // Step 9: Handle confirmation (if applicable)
            WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
            okButton.click();

        } catch (Exception e) {
            System.out.println("Error occurred during login test: " + e.getMessage());
            System.out.println("Password Incorrect and Email Incorrect use");
            System.out.println("Login Not Successful");
        } finally {
            // Step 10: Close the browser
            driver.quit();
        }
    }
} 
*/


















//Invalid sign in... password Incrrret and Email Incorrect use ........


/* import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sign_in {
    public static void main(String[] args) {
        // Step 1: Set up WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Step 2: Navigate to the website
            driver.get("https://shop-ease-b2fc1.web.app/login");

            // Step 3: Wait for the 'Register' link to be clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));  // Increased timeout
            WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));  // Using linkText for more precision
            loginLink.click();

          

            // Step 6: Fill in the Email field
            WebElement emailField = driver.findElement(By.cssSelector("input[placeholder='Email']"));
            emailField.click();
            emailField.sendKeys("joybaidya123@example.com");

            // Step 7: Fill in the Password field
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.click();
            passwordField.sendKeys("JNaul");

            // Step 8: Click on the 'Register' button
            WebElement passwordButton = driver.findElement(By.xpath("//button[text()='Log in']"));
            passwordButton.click();

            // Step 9: Handle confirmation (if applicable)
            WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
            okButton.click();

        } catch (Exception e) {
            System.out.println("Error occurred during login test: " + e.getMessage());
            System.out.println("password Incrrret and Email Incorrect use");
        } finally {
            // Step 10: Close the browser
            driver.quit();
        }
    }
} */















//Invalid sign in... password Empty and Email Empty use ........
/*

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sign_in {
    public static void main(String[] args) {
        // Step 1: Set up WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Step 2: Navigate to the website
            driver.get("https://shop-ease-b2fc1.web.app/login");

            // Step 3: Wait for the 'Register' link to be clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));  // Increased timeout
            WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));  // Using linkText for more precision
            loginLink.click();
            // Step 6: Fill in the Email field
            WebElement emailField = driver.findElement(By.cssSelector("input[placeholder='Email']"));
            emailField.click();
            emailField.sendKeys("");
             System.out.println("Empty Email");
            // Step 7: Fill in the Password field
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.click();
            passwordField.sendKeys("");
            System.out.println("Empty Password");
            
            // Step 8: Click on the 'Register' button
            WebElement passwordButton = driver.findElement(By.xpath("//button[text()='Log in']"));
            passwordButton.click();
                    
        } catch (Exception e) {
            System.out.println("Error occurred during login test: " + e.getMessage());
            System.out.println("password empty and Email Empty use");
           
        } finally {
            // Step 10: Close the browser
            driver.quit();
        }
    }
} 



*/























