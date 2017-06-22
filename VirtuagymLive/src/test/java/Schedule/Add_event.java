package Schedule;

import Base.Driver_Invocation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Add_event extends Driver_Invocation {
    public Add_event() {
    }

    @Test(
        description = "Clicks and launches schedule"
    )
    public void Schedules_View() {
        this.driver.findElement(By.xpath("//*[@id='head_user']")).click();
        this.driver.findElement(By.xpath(".//*[@id='app_15']")).click();
        Select View = new Select(this.driver.findElement(By.xpath(".//*[@id='filters']/div/select")));
        View.selectByVisibleText("Client view");
        this.driver.findElement(By.xpath(".//*[@id='cat_tab']/a[2]/span")).click();
    }

    @Test(
        description = "Mandate_Fields",
        dependsOnMethods = {"Schedules_View"}
    )
    public void Mandate_Fields() throws Exception {
        this.driver.findElement(By.xpath(".//*[@id='week_schedule']/a/span/div")).click();
        this.driver.findElement(By.xpath("//*[@id='dropdown-options']/ul/li[6]/a")).click();
        Select Activity_dd = new Select(this.driver.findElement(By.id("activity_id")));
        Activity_dd.selectByValue("selected");
        this.driver.findElement(By.xpath(".//*[@id='submit_btn']")).click();
        String Submit_result = this.driver.findElement(By.xpath(".//*[@id='submitresult']")).getText();
        System.out.println("Message is " + Submit_result);
    }
}
