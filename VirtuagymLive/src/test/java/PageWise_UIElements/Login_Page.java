package PageWise_UIElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    WebDriver driver;
    @FindBy( id = "username")
    WebElement UserID;
    @FindBy(id = "password")
    WebElement Password;
    @FindBy(id = "login_btn")
    WebElement LoginButton;

    public Login_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement UserID() {
        return this.UserID;
    }

    public WebElement Password() {
        return this.Password;
    }

    public WebElement Login_Btn() {
        return this.LoginButton;
    }
}
