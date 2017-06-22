package PageWise_UIElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Schedule_Page {
    WebDriver driver;
    @FindBy(
        xpath = "//*[@id='head_user']"
    )
    WebElement Professional;
    @FindBy(
        xpath = ".//*[@id='app_15']"
    )
    WebElement Schedule_App;
    @FindBy(
        xpath = ".//*[@id='filters']/div/select"
    )
    WebElement View;
    Select View_select;

    public Schedule_Page(WebDriver driver) {
        this.View_select = new Select(this.View);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
