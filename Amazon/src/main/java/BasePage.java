import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    WebDriver driver;
    public  BasePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public WebElement Find(By locatur)
    {
        return  driver.findElement(locatur);
    }
    public List<WebElement> findAll (By Locator)
    {
        return  driver.findElements(Locator);

    }
    public  void click(By Locator)
    {
        Find(Locator).click();
    }
    public  void  type (By Locator, String text)
    {
        Find(Locator).sendKeys(text);
    }
    public  boolean İsDisplayed(By Locator)
    {
        return  Find(Locator).isDisplayed();
    }
}
