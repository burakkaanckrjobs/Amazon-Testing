import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    public WebElement findall (By Locator)
    {
        return  driver.findElement(Locator);
    }
    public  void Click(By Locator)
    {
        Find(Locator).click();
    }
    public  void  type (By Locator, String text)
    {
        findall(Locator).sendKeys(text);
    }
    public  boolean İsDisplayed(By Locator)
    {
        return  Find(Locator).isDisplayed();
    }
}
