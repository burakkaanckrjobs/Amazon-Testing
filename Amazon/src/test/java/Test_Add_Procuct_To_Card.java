import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Add_Procuct_To_Card {
    HomePage homePage;
    ProductPage  productPage;
    ProductDetailPage productdetailpage;
    CartPage cartPage;
    @Test
    public void  Search_a_Product()
    {
        homePage.searchBox().search("Laptop");
        Assertions.assertTrue(productPage.isOnProductPage(),
                "Not on Product Page!");
    }
    @Test
    public void  Select_a_Product()
    {
        productPage.selecetProduct(2);
        Assertions.assertTrue(productdetailpage.İsOnProductDetailPage(),
                "Not on Product Detail Page!");
    }
    @Test
    public void  add_Product_to_cart()
    {
        productdetailpage.addToCart();
        Assertions.assertTrue(homePage.isProductCount(),
                "Product Count did not incresa!");
    }
    @Test
    public void  go_to_cart()
    {  homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(),
                "Product was not added to cart!");
    }
}
