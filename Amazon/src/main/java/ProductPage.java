import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends  BasePage {

    By shippingOptionLocator = By.id("p_n_free_shipping_eligible-title");
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
    }

    public void selecetProduct(int i) {
    }
}
