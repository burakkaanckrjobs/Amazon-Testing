import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends  BasePage {

    By shippingOptionLocator = By.className("span[class='a-size-base a-color-base puis-bold-weight-text']");
    By pruductnameLocator = By.cssSelector("span.a-size-base-plus");
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return  İsDisplayed(shippingOptionLocator);
    }
    public void selecetProduct(int i) {

        getAllProducts().get(i).click();
    }
    private List<WebElement> getAllProducts()
    {
        return findAll(pruductnameLocator);
    }
}
