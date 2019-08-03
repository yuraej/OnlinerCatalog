import com.google.gson.Gson;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Locators {
        @Test
        public void lookingLocators(){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://catalog.onliner.by/cpu/amd/rzn53600");
            driver.findElement(By.id("topmailru-code"));
            driver.findElement(By.className("b-top-navigation"));
            driver.findElement(By.tagName("h3"));
            driver.findElement(By.linkText("Каталог"));
            driver.findElement(By.partialLinkText("Разместить"));
            driver.findElement(By.cssSelector("div.modal-dialog"));
            driver.findElement(By.cssSelector("#container"));
            driver.findElement(By.cssSelector("div"));
            driver.findElement(By.cssSelector("script"));
            driver.findElement(By.cssSelector("div.product-specs__table-title-inner"));
            driver.findElement(By.cssSelector("h1.catalog-masthead__title"));
            driver.findElement(By.cssSelector("*.product-specs__table-title"));
            driver.findElement(By.cssSelector("td[colspan='2']"));
            driver.findElement(By.cssSelector("div"));
            driver.findElement(By.cssSelector("div,td,tr"));
            driver.findElement(By.cssSelector("div td"));
            driver.findElement(By.cssSelector("div tr"));
            driver.findElement(By.cssSelector("div h3"));
            driver.findElement(By.cssSelector("tr > td"));
            driver.findElement(By.cssSelector("[type]"));
            driver.findElement(By.cssSelector("a[href^='https']"));
            driver.findElement(By.cssSelector("a[href*='onliner.by']"));
            driver.findElement(By.cssSelector("a[href$='prices']"));
            driver.findElement(By.xpath("//div/h3"));
            driver.findElement(By.xpath("//div[@class='product-specs__table-title-inner']"));
            driver.findElement(By.xpath("//div[@id='specs']"));
            driver.findElement(By.xpath("//div[@id='specs']/div[last()-2]"));
            driver.findElement(By.xpath("//div[@id='specs']/div[last()-1]"));
            driver.findElement(By.xpath("//div[@id='specs']/div[last()]"));
            driver.findElement(By.xpath("//div[@id='specs']/div[2]"));
            driver.findElement(By.xpath("//div[@id='specs']/div[position()>1]"));
            driver.findElement(By.xpath("//div[@id='specs']/div[position()>2]"));
            driver.findElement(By.xpath("//div[@id='specs']/div[position()<3]"));
            driver.findElement(By.xpath("//div[@id='specs']/div[2]//tr[7]"));
            driver.findElement(By.xpath("//div[@id='specs']/div[2]//tr[7]/td"));
            driver.findElement(By.xpath("//div[@id='specs']/div[2]//tr[7]/td[2]"));
            driver.quit();
        }
}
