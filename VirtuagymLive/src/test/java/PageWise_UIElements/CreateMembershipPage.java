package PageWise_UIElements;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateMembershipPage {
    WebDriver driver;
    
    @FindBy(id = "ms_name")
    public WebElement MembershipName;
    
    @FindBy(id = "ms_grouplist")
    public WebElement GroupSelection_DD;
    
    @FindBy(xpath = ".//input[@name='ms_availability']")
    List<WebElement> Availabilty_CB;
   
    @FindBy(id = "ms_duration")
    public WebElement Duration;
    
    @FindBy(id = "ms_duration_term")
    public WebElement Duration_DD;
    
    @FindBy(id = "startonfirst")
    public WebElement Prorata_CB;
    
    @FindBy(
        id = "ms_autorenew"
    )
    WebElement Autorenew_CB;
    @FindBy(
        xpath = ".//*[@id='autorenew_period']/td[2]/input"
    )
    WebElement Prolongation;
    @FindBy(
        xpath = ".//select[@name='ms_autorenew_renew_term']"
    )
    WebElement Prolongation_DD;
    @FindBy(
        xpath = ".//input[@name='ms_autorenew_before']"
    )
    WebElement Renewal;
    @FindBy(
        xpath = ".//select[@name='ms_autorenew_before_term']"
    )
    WebElement Renewal_DD;
    @FindBy(
        id = "ms_price"
    )
    WebElement RegularPrice;
    @FindBy(
        id = "ms_price_term"
    )
    WebElement RegularPrice_DD;
    @FindBy(
        id = "vat"
    )
    WebElement SalesTax_DD;
    @FindBy(
        id = "ms_recurring_price"
    )
    WebElement ProlongationPrice;
    @FindBy(
        id = "ms_income_category"
    )
    WebElement IncomeCategory_DD;
    @FindBy(
        id = "ms_payment_method"
    )
    WebElement PaymentMethod_DD;
    @FindBy(
        xpath = ".//select[@name='ms_billingcycle']"
    )
    WebElement BillingCycle_DD;
    @FindBy(
        xpath = ".//input[@name='membership_invoice_creation_numb']"
    )
    WebElement NextInvoice;
    @FindBy(
        xpath = ".//select[@name='membership_invoice_creation_term']"
    )
    WebElement NextInvoice_DD;
    @FindBy(
        xpath = ".//*[@id='ms_registration_fee']"
    )
    WebElement PayRegFee_CB;
    @FindBy(
        id = "ms_start_payment"
    )
    WebElement FreePeriod_CB;
    @FindBy(
        xpath = ".//span[text()='Next step'][@data-identifyelement='58']"
    )
    WebElement NextStep_Btn;

    public CreateMembershipPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
  
