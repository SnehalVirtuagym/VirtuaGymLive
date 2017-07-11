package Base;

import PageWise_UIElements.Login_Page;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Driver_Invocation {
    public WebDriver driver = null;

    public Driver_Invocation() {
    }

    @BeforeSuite
    public void Invoke_Browser() {
        System.setProperty("webdriver.chrome.driver", "D:\\Configuration\\chromedriver_win32\\chromedriver.exe");
        this.driver = new ChromeDriver();
        Login_Page lp = new Login_Page(this.driver);
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        this.driver.get("https://snehalvg.virtuagym.com/");
        lp.UserID().sendKeys(new CharSequence[]{"snehal@virtuagym.com"});
        lp.Password().sendKeys(new CharSequence[]{"Virtuagym"});
        lp.Login_Btn().click();
    }
}
