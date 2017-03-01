package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test extends Drivers{
	private WebDriver driver = getDriver();
	   //private String baseUrl; 
	   static int i=0;

	@Given("^I can see the radio nav$")
	public void i_can_see_the_radio_nav() throws Throwable {
	   // Write code here that turns the phrase above into concrete actions
		
		driver.navigate().to("https://www.bbc.co.uk/radio");
	 // baseUrl = "https://www.bbc.co.uk/radio";
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     // driver.navigate().to(baseUrl);
	      driver.manage().window().maximize();
	     
	    //  Assert.assertTrue(driver.findElements(By.xpath("//section[@class='radionav opened']")).size() == 1);

	}



	@When("^I select Stations in the radio nav$")
	public void i_select_Stations_in_the_radio_nav() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-panelid='stations']")).click();
	}

	@Then("^the Stations drawer is open$")
	public void the_Stations_drawer_is_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(By.xpath("//div[@id='stations-panel']")).size() == 1);
		
		
	
	}

	@When("^I select Stations in the radio nav again$")
	public void i_select_Stations_in_the_radio_nav_again() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-panelid='stations']")).click();
		
	}

	@Then("^the Stations drawer is closed$")
	public void the_Stations_drawer_is_closed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(By.xpath("//div[@id='stations-panel']")).size() < 1);
		
	   
	}

	@When("^I select Categories in the radio nav$")
	public void i_select_Categories_in_the_radio_nav() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-panelid='categories']")).click();
		
	}

	@Then("^the Categories drawer is open$")
	public void the_Categories_drawer_is_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);		
		Assert.assertTrue(driver.findElements(By.xpath("//div[@id='categories-panel']")).size()== 1);
		
	}

	@When("^I select Categories in the radio nav again$")
	public void i_select_Categories_in_the_radio_nav_again() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//a[@data-panelid='categories']")).click();
		
		
	}

	@Then("^the Categories drawer is closed$")
	public void the_Categories_drawer_is_closed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);	
		Assert.assertTrue(driver.findElements(By.xpath("//div[@id='categories-panel']")).size()< 1);
		
	}

	@When("^I select Schedules in the radio nav$")
	public void i_select_Schedules_in_the_radio_nav() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//a[@data-panelid='schedules']")).click();
		
	}

	@Then("^the Schedules drawer is open$")
	public void the_Schedules_drawer_is_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);		
		Assert.assertTrue(driver.findElements(By.xpath("//div[@id='schedules-panel']")).size()== 1);
	   
	}

	@When("^I select Schedules in the radio nav again$")
	public void i_select_Schedules_in_the_radio_nav_again() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//a[@data-panelid='schedules']")).click();
		
		
	}

	@Then("^the Schedules drawer is closed$")
	public void the_Schedules_drawer_is_closed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);	
		Assert.assertTrue(driver.findElements(By.xpath("//div[@id='schedules-panel']")).size()< 1);
	    
	}
	
	@Then("^the Stations drawer is open and the other drawers are closed$")
	public void the_Stations_drawer_is_open_and_the_other_drawers_are_closed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);	
		otherDrawersAreClosed();
	}
	
	boolean otherDrawersAreClosed()
	{
		return driver.findElements(By.xpath("//div[@id='stations-panel']")).size() == 1
		&& driver.findElements(By.xpath("//div[@id='categories-panel']")).size()< 1
		&&driver.findElements(By.xpath("//div[@id='schedules-panel']")).size()< 1;
	}

	@Then("^the Categories drawer is open and the other drawers are closed$")
	public void the_Categories_drawer_is_open_and_the_other_drawers_are_closed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);	
		otherDrawersAreClosed1();
	}

	boolean otherDrawersAreClosed1()
	{
		return driver.findElements(By.xpath("//div[@id='categories-panel']")).size() == 1
		&& driver.findElements(By.xpath("//div[@id='stations-panel']")).size()< 1
		&&driver.findElements(By.xpath("//div[@id='schedules-panel']")).size()< 1;
	}
	
	
	@Then("^the Schedules drawer is open and the other drawers are closed$")
	public void the_Schedules_drawer_is_open_and_the_other_drawers_are_closed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);	
		otherDrawersAreClosed2();
	  
	}
	
	boolean otherDrawersAreClosed2()
	{
		return driver.findElements(By.xpath("//div[@id='schedules-panel']")).size() == 1
		&& driver.findElements(By.xpath("//div[@id='categories-panel']")).size()< 1
		&&driver.findElements(By.xpath("//div[@id='stations-panel']")).size()< 1;
	}

	@Then("^I can see the following categories$")
	public void i_can_see_the_following_categories(DataTable arg1) throws Throwable {
	    
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-panelid='categories']")).click();
		
		 List<WebElement> allElements = driver.findElements(By.xpath("//div/ul[@class='radionav-drawer__categories-list']")); 

		for (WebElement element: allElements) {
		      System.out.println(element.getText());
		}
	   
	}
 
	@When("^I select the all categories link$")
	public void i_select_the_all_categories_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='All Categories']")).click();
	    
	}

	@Then("^I am on the all categories page$")
	public void i_am_on_the_all_categories_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(By.xpath("//div/h1/a[text()='Categories:']")).size()== 1);
		
		
	}
	


@Given("^I can see Local Radio link inside the Stations drawer$")
public void i_can_see_Local_Radio_link_inside_the_Stations_drawer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	Thread.sleep(2000);
	Assert.assertTrue(driver.findElements(By.xpath("//div[@id='stations-panel']/ul/li[@class='stations--localradio']")).size()== 1);
	
}
	

@When("^I select the Local Radio link in the Stations drawer$")
public void i_select_the_Local_Radio_link_in_the_Stations_drawer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='stations-panel']/ul/li[@class='stations--localradio']")).click();
	
	
}

@Then("^the stations page is open$")
public void the_stations_page_is_open() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	Assert.assertTrue(driver.findElements(By.xpath("//ul[@class='nations-and-national-logo-list']")).size()== 1);
	
}

@Then("^Stations page contains section listing all the local networks$")
public void stations_page_contains_section_listing_all_the_local_networks() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);	
	Assert.assertTrue(driver.findElements(By.xpath("//div[@id='local']")).size()== 1);

  
}


@When("^I select a Radio (\\d+) from the station drawer$")
public void i_select_a_Radio_from_the_station_drawer(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	//System.out.println(arg1);
	
	Thread.sleep(2000);	
	//driver.findElement(By.xpath("//a[@class='link-radio1']")).click();
	driver.findElement(By.xpath("//a[@class='link-radio"+arg1+"']")).click();
}



@Then("^I am taken to the appropriate Radio (\\d+) homepage$")
public void i_am_taken_to_the_appropriate_Radio_homepage(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);	
	String[] radio_names;
	radio_names = new String[] {"radio_one", "radio_two", "radio_three", "radio_fourfm"};
	System.out.println("Prints: " +radio_names[i]);
	Assert.assertTrue(driver.findElements(By.xpath("//picture/img[@alt='bbc_"+radio_names[i]+" logo']")).size()== 1);	
	i++;
	 }


	
	
	@When("^I select a Radio (\\d+)Xtra from the station drawer$")
public void i_select_a_Radio_Xtra_from_the_station_drawer(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	driver.findElement(By.xpath("//a[@class='link-1xtra']")).click();

	//throw new PendingException();
}

@Then("^I am taken to the appropriate Radio (\\d+)Xtra homepage$")
public void i_am_taken_to_the_appropriate_Radio_Xtra_homepage(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	Assert.assertTrue(driver.findElements(By.xpath("//picture/img[@alt='bbc_1xtra logo']")).size()== 1);

	//throw new PendingException();
}

@When("^I select a Radio (\\d+) Extra from the station drawer$")
public void i_select_a_Radio_Extra_from_the_station_drawer(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//a[@class='link-radio4extra']")).click();
	
	
}

@Then("^I am taken to the appropriate Radio (\\d+) Extra homepage$")
public void i_am_taken_to_the_appropriate_Radio_Extra_homepage(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Thread.sleep(2000);	
	Assert.assertTrue(driver.findElements(By.xpath("//picture/img[@alt='bbc_radio_four_extra logo']")).size()== 1);
	
}

@When("^I select a Radio (\\d+) live from the station drawer$")
public void i_select_a_Radio_live_from_the_station_drawer(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	

	Thread.sleep(2000);	
	driver.findElement(By.xpath("//a[@class='link-5live']")).click();

    
}

@Then("^I am taken to the appropriate Radio (\\d+) live homepage$")
public void i_am_taken_to_the_appropriate_Radio_live_homepage(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	Thread.sleep(2000);	
	Assert.assertTrue(driver.findElements(By.xpath("//picture/img[@alt='bbc_radio_five_live logo']")).size()== 1);

	
	
}

@When("^I select a Radio (\\d+) live sports extra from the station drawer$")
public void i_select_a_Radio_live_sports_extra_from_the_station_drawer(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//a[@class='link-5livesportsextra']")).click();

}

@Then("^I am taken to the appropriate Radio (\\d+) live sports extra homepage$")
public void i_am_taken_to_the_appropriate_Radio_live_sports_extra_homepage(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	Thread.sleep(2000);	
	Assert.assertTrue(driver.findElements(By.xpath("//picture/img[@alt='bbc_radio_five_live_sports_extra logo']")).size()== 1);
	
}

@When("^I select a Radio (\\d+) Music from the station drawer$")
public void i_select_a_Radio_Music_from_the_station_drawer(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//a[@class='link-6music']")).click();
    
}

@Then("^I am taken to the appropriate Radio (\\d+) Music homepage$")
public void i_am_taken_to_the_appropriate_Radio_Music_homepage(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Thread.sleep(2000);	
	Assert.assertTrue(driver.findElements(By.xpath("//picture/img[@alt='bbc_6music logo']")).size()== 1);

   
	
}


@When("^I select a Asian Network from the station drawer$")
public void i_select_a_Asian_Network_from_the_station_drawer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//a[@class='link-asiannetwork']")).click();
}

@Then("^I am taken to the appropriate Asian Network homepage$")
public void i_am_taken_to_the_appropriate_Asian_Network_homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Thread.sleep(2000);	
	Assert.assertTrue(driver.findElements(By.xpath("//picture/img[@alt='bbc_asian_network logo']")).size()== 1);
   
}

@When("^I select a World Service from the station drawer$")
public void i_select_a_World_Service_from_the_station_drawer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//a[@class='link-worldserviceradio']")).click();
    
	
}

@Then("^I am taken to the appropriate World Service homepage$")
public void i_am_taken_to_the_appropriate_World_Service_homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	Thread.sleep(2000);	
	Assert.assertTrue(driver.findElements(By.xpath("//picture/img[@alt='bbc_world_service logo']")).size()== 1);
}

@When("^I select a Radio Scotland from the station drawer$")
public void i_select_a_Radio_Scotland_from_the_station_drawer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//a[@class='link-radioscotland']")).click();
   
}

@Then("^I am taken to the appropriate Radio Scotland homepage$")
public void i_am_taken_to_the_appropriate_Radio_Scotland_homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Thread.sleep(2000);	
	Assert.assertTrue(driver.findElements(By.xpath("//picture/img[@alt='bbc_radio_scotland_fm logo']")).size()== 1);

    
}

@When("^I select a Radio nan G?idheal from the station drawer$")
public void i_select_a_Radio_nan_G_idheal_from_the_station_drawer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//a[@class='link-radionangaidheal']")).click();
	
  
}

@Then("^I am taken to the appropriate Radio nan G?idheal homepage$")
public void i_am_taken_to_the_appropriate_Radio_nan_G_idheal_homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);	
	Assert.assertTrue(driver.findElements(By.xpath("//picture/img[@alt='bbc_radio_nan_gaidheal logo']")).size()== 1);
}





/*
@When("^I select a Radio nan G?idheal from the station drawer$")
public void i_select_a_Radio_nan_G_idheal_from_the_station_drawer throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//a[@class='link-radionangaidheal']")).click();
	//throw new PendingException();
}

@Then("^I am taken to the appropriate Radio nan G?idheal homepage$")
public void i_am_taken_to_the_appropriate_Radio_nan_G_idheal_Radio_homepage(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(driver.findElements(By.xpath("//picture/img[@alt='bbc_radio_nan_gaidheal logo']")).size()== 1);

    
	//throw new PendingException();
}
*/

@When("^I select a Radio Ulster from the station drawer$")
public void i_select_a_Radio_Ulster_from_the_station_drawer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	

	Thread.sleep(2000);	
	driver.findElement(By.xpath("//a[@class='link-radioulster']")).click();
	
	
   
}

@Then("^I am taken to the appropriate Radio Ulster homepage$")
public void i_am_taken_to_the_appropriate_Radio_Ulster_homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Thread.sleep(2000);	
	Assert.assertTrue(driver.findElements(By.xpath("//picture/img[@alt='bbc_radio_ulster logo']")).size()== 1);
	
	
    
}

@When("^I select a Radio Foyle from the station drawer$")
public void i_select_a_Radio_Foyle_from_the_station_drawer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//a[@class='link-radiofoyle']")).click();
   
	
}

@Then("^I am taken to the appropriate Radio Foyle homepage$")
public void i_am_taken_to_the_appropriate_Radio_Foyle_homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Thread.sleep(2000);	
	Assert.assertTrue(driver.findElements(By.xpath("//picture/img[@alt='bbc_radio_foyle logo']")).size()== 1);
	
	
  
}

@When("^I select a Radio Wales from the station drawer$")
public void i_select_a_Radio_Wales_from_the_station_drawer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//a[@class='link-radiowales']")).click();
    
}

@Then("^I am taken to the appropriate Radio Wales homepage$")
public void i_am_taken_to_the_appropriate_Radio_Wales_homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	

	Thread.sleep(2000);	
	Assert.assertTrue(driver.findElements(By.xpath("//picture/img[@alt='bbc_radio_wales_fm logo']")).size()== 1);
	
   
}

@When("^I select a Radio Cymru from the station drawer$")
public void i_select_a_Radio_Cymru_from_the_station_drawer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//a[@class='link-radiocymru']")).click();
    
}

@Then("^I am taken to the appropriate Radio Cymru homepage$")
public void i_am_taken_to_the_appropriate_Radio_Cymru_homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	Thread.sleep(2000);	
	Assert.assertTrue(driver.findElements(By.xpath("//picture/img[@alt='bbc_radio_cymru logo']")).size()== 1);
}

@When("^I select a Local Radio from the station drawer$")
public void i_select_a_Local_Radio_from_the_station_drawer() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//a[@class='link-localradio']")).click();
   
}

@Then("^I am taken to the appropriate Local Radio homepage$")
public void i_am_taken_to_the_appropriate_Local_Radio_homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Thread.sleep(2000);	
	Assert.assertTrue(driver.findElements(By.xpath("//ul[@class='nations-and-national-logo-list']")).size()== 1);
   
}

@Given("^I am on the BBC website$")
public void i_am_on_the_BBC_website() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
}

@When("^I select the iplayer Radio logo$")
public void i_select_the_iplayer_Radio_logo() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);	
	driver.findElement(By.xpath("//a/i[@class='iplayer-radio__logo-pr']")).click();
}

@Then("^I am taken to the radio homepage$")
public void i_am_taken_to_the_radio_homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);	
	Assert.assertTrue(driver.findElements(By.xpath("//a/i[@class='iplayer-radio__logo-pr']")).size()== 1);
    
}
}

