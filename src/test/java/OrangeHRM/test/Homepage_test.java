package OrangeHRM.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.util.Assert;

import Core.TestBase;
import OrangeHRM.main.Homepage;
public class Homepage_test extends TestBase{
	Homepage home;
	
	@Test(groups= {"A"})
	public void clickOperation() {
		test = extent.createTest("Home: Click operation", "").assignCategory("HomePage");
		home = new Homepage(driver);
		home.try_free_link.click();
		logger.info("Home page open");
		
		//test.log(Status.PASS, "send data in username field");
	}
	
	@Test(dependsOnGroups= {"A"})
	public void registation() {
		test = extent.createTest("Home: Click operation", "").assignCategory("Registation page");
		home = new Homepage(driver);
		home.fullName.sendKeys("Pavan");
		
	}

}
//