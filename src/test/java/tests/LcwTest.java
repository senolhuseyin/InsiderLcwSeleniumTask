package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CategoryPage;
import pages.HomePage;
import pages.ProductPage;
import utilities.Driver;
import utilities.Listener;

@Listeners(Listener.class)

public class LcwTest extends Driver {

    HomePage homePage = new HomePage();
    CategoryPage categoryPage = new CategoryPage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();


    @BeforeTest
    public void beforeTest() {
        getTheDriverAndGoHomePage();
    }

    @Test
    public void lcwTest() {

        Assert.assertTrue(homePage.isHomePageOpened(), "Home Page is not opened");
        System.out.println("Home Page is opened");

        homePage.moveMouseToManCategory();
        homePage.clickManShirtCategory();
        Assert.assertTrue(categoryPage.isCategoryPageOpened(), "Category Page is not opened");
        System.out.println("Clicked man->shirt category button and Category Page is opened");

        categoryPage.clickFirstProduct();
        Assert.assertTrue(productPage.isProductPageOpened(), "Product Page is not opened");
        System.out.println("Clicked first product and Product Page is opened");

        productPage.selectSize();
        productPage.clickAddToCartButton();
        productPage.clickCartPageButton();
        Assert.assertTrue(cartPage.isCartPageOpened(), "Cart Page is not opened");
        System.out.println("Size selected, clicked 'add to cart' button, clicked 'cart' page button and Cart Page is Opened");

        goHomePage();
        Assert.assertTrue(homePage.isHomePageOpened(), "Home Page is not opened again");
        System.out.println("Navigated to home page url and Home Page is opened again");

    }

    @AfterTest
    public void afterTest() {
        closeDriver();
    }
}
