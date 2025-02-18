// 8 to 16 character range different type character use random auto security(password  chack)
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Random;

public class BounderyTest_sign_up{
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        try {
            
            String url = "https://shop-ease-b2fc1.web.app/";
            driver.get(url);

            // Step 1: Perform the registration process 10 times
            for (int i = 1; i <= 10; i++) {
                System.out.println("Attempt #" + i + " to register.");

                // Wait for the 'Register' link and click it
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
                WebElement registerLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Register")));
                registerLink.click();

                
                fillField(driver, By.cssSelector("input[placeholder='Username']"), generateRandomString(8));
                fillField(driver, By.cssSelector("input[placeholder='Photo URL']"), generateRandomPhotoUrl());
                fillField(driver, By.cssSelector("input[placeholder='Email']"), generateRandomEmail());
                fillField(driver, By.cssSelector("input[placeholder=' Choose Password']"), generateRandomPassword());

                // Click the 'Register' button
                WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
                registerButton.click();

               
                WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
                okButton.click();
                System.out.println("Registration " + i + " completed successfully.");

                // Navigate back to the home page for the next registration
                driver.navigate().to(url);
            }
            System.out.println("bounder");

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

    // Helper method to generate a random password with a length between 8 and 16 characters
    private static String generateRandomPassword() {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-_+=<>?";
        String allCharacters = upperCaseLetters + lowerCaseLetters + digits + specialCharacters;

        Random random = new Random();
        int passwordLength = 8 + random.nextInt(9); // Generates a random length between 8 and 16

        StringBuilder password = new StringBuilder();

        // Ensure at least one character from each character group
        password.append(upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length())));
        password.append(lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

        // Fill the remaining characters with random characters from the entire set
        for (int i = 4; i < passwordLength; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        // Shuffle the password to avoid predictable patterns
        return shuffleString(password.toString());
    }

    // Helper method to shuffle a string
    private static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        Random random = new Random();
        for (int i = 0; i < characters.length; i++) {
            int randomIndex = random.nextInt(characters.length);
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }
        return new String(characters);
    }
} 