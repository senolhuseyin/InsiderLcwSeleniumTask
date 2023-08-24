package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.Objects;

public class HomePage extends Driver {

    @FindBy(xpath = "(//a[@class='menu-header-item__title'])[2]")
    public WebElement manCategoryButton;
    @FindBy(xpath = "(//a[text()='Gömlek'])[2]")
    public WebElement manShirtCategoryButton;

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void moveMouseToManCategory() {
        actions.moveToElement(manCategoryButton).perform();
    }

    public void clickManShirtCategory() {
        manShirtCategoryButton.click();
    }

    public boolean isHomePageOpened() {
        return Objects.equals(driver.getTitle(), "LC Waikiki | Türkiye’nin Moda ve Giyim Online Alışveriş Sitesi - LC Waikiki");
    }
}




