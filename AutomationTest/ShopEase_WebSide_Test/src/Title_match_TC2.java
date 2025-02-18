
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;


public class Title_match_TC2 {
    public static void main(String[] args) throws IOException, InterruptedException {
       
// TODO code application logic here
ChromeDriver driver = new ChromeDriver();
driver.get("https://shop-ease-b2fc1.web.app/");
       
String pageTitle = driver.getTitle();
String expectedTitle = "Shopase | Home";

boolean titleMatch = pageTitle.equals(expectedTitle);

System.out.println("Actual Title: " + pageTitle);
System.out.println("Expected Title: " + expectedTitle);
System.out.println("Title Match: " + titleMatch);

BufferedWriter writer = new BufferedWriter (new FileWriter("test_result.csv"));
writer.write("Actual Title, Expected Title, Title Match\n");

writer.close();
System.out.println("Test results saved");
Thread.sleep(5000);
driver.close();
    }
}


