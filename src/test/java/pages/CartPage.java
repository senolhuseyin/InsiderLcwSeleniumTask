package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.Objects;

public class CartPage extends Driver {

    public CartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public boolean isCartPageOpened() {
        return Objects.equals(driver.getCurrentUrl(), "https://www.lcwaikiki.com/tr-TR/TR/sepetim");
    }
}
