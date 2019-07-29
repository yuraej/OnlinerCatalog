import com.google.gson.Gson;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CatalogTest {
    @Test
    public void validateCode(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("E:\\onlanerCatalog\\src\\main\\resources\\catalog.html");
        String jsonCode = driver.findElement(By.tagName("pre")).getText();
        System.out.println(jsonCode);
        Gson gson = new Gson();
        Catalog catalog = gson.fromJson(jsonCode, Catalog.class);

    }
}
