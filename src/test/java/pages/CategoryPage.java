package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.Objects;

public class CategoryPage extends Driver {

    @FindBy(xpath = "(//div[@class='product-card product-card--one-of-4'])[1]")
    public WebElement firstProduct;

    public CategoryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickFirstProduct() {
        firstProduct.click();
    }

    public boolean isCategoryPageOpened() {
        return Objects.equals(driver.getCurrentUrl(), "https://www.lcwaikiki.com/tr-TR/TR/kategori/erkek/gomlek");
    }
}
