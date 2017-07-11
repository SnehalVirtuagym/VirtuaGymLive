package Membership;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

import PageWise_UIElements.CreateMembershipPage;

public class Create_Membership extends Base.Driver_Invocation {
	
	 File file= new File("D:\\Git VirtuaGymLive\\VirtuagymLive\\Membership.properties");
	 
	
     public void Redirect_createMembership() throws Exception
     {
    	 driver.navigate().to("https://snehalvg.virtuagym.com/club_portal/memberships/new");
 
     }
     
     
     @Test(description="creates membership")
     public void AddMembership() throws Exception
     {
    	 Properties prop = new Properties();
    	 FileInputStream fis= new FileInputStream(file);
    	 prop.load(fis);
    	 
    	 CreateMembershipPage mp = new CreateMembershipPage(driver);
    	 
    	 Redirect_createMembership();
    	 
    	 mp.MembershipName.sendKeys(prop.getProperty("MembershipName"));
    	 mp.Duration.sendKeys(prop.getProperty("Duration"));
    	 
     }

}
