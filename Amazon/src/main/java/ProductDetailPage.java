import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends  BasePage{
    public ProductDetailPage(WebDriver driver)
    {
        super(driver);
    }
    By addToCartButtonlacoter = By.id("add-to-cart-button");

    public boolean İsOnProductDetailPage() {
      return İsDisplayed(addToCartButtonlacoter);
    }
    public void addToCart() {
       click(addToCartButtonlacoter);
    }
}
