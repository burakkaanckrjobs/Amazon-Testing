import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends  BasePage {


    SearchBox searchBox;
    By CartcountLacoter =By.id("nav-cart-count");
    By CartCountainerLocator = By.id("nav-cart-count-container");

    public HomePage(WebDriver driver) {

        super(driver);
        searchBox= new SearchBox(driver);
    }


    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCount() {

        return  getCartCount()>0;
    }
    public void goToCart() {

        click(CartCountainerLocator);
    }

    private  int getCartCount()
    {
       String count= Find(CartcountLacoter).getText();
       return Integer.parseInt(count);
    }
}
