import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_Product_To_Cart  extends  BaseTest {

    HomePage homePage;
    ProductPage  productPage;
    ProductDetailPage productdetailpage;
    CartPage cartPage;
    @Test
    @Order(1)
    public void  Search_a_Product()
    {
        homePage = new HomePage(driver);
        homePage.searchBox().search("lego");
        productPage = new ProductPage(driver);
        Assertions.assertTrue(productPage.isOnProductPage(),
                "Not on Product Page!");
    }
    @Test
    @Order(2)
    public void  Select_a_Product()
    {
        productdetailpage = new ProductDetailPage(driver);
        productPage.selecetProduct(1);
        Assertions.assertTrue(productdetailpage.İsOnProductDetailPage(),
                "Not on product detail page!");
    }
    @Test
    @Order(3)
    public void  add_Product_to_cart()
    {

        productdetailpage.addToCart();
        Assertions.assertTrue(homePage.isProductCount(),
                "Product Count did not incresa!");
    }
    @Test
    @Order(3)
    public void  go_to_cart()
    {
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded() ,
                "Product was not added to cart!");
    }
}
