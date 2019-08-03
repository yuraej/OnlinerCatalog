import com.google.gson.Gson;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class CatalogTest {
    @Test
    public void checkItem(){
        Item item = new Item("для мытья окон", 60, 50, "белый", "нет");
        Gson gson = new Gson();

        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/yura/Документы/JAVA/OnlinerCatalog/src/test/resources/Product.html");
        String jsonCode = driver.findElement(By.tagName("code")).getText();
        Item itemJson = gson.fromJson(jsonCode, Item.class);
        assertEquals(item, itemJson);
        driver.quit();
    }
}
