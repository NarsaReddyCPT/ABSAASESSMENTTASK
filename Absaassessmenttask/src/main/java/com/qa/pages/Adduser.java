package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Adduser extends Testbase {
	@FindBy(xpath="//*[@class = \"btn btn-link pull-right\"]")
	WebElement Adduser;
	
	@FindBy(name="FirstName")
	WebElement firstname;
	
	@FindBy(name="LastName")
	WebElement lastname;
	
	@FindBy(name="UserName")
	WebElement username;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(name="optionsRadios")
	WebElement radiobutton;
	
	@FindBy(xpath="//*[@type=\"radio\" and @value = \"16\"]")
	WebElement customer;
	
	@FindBy(name="Email")
	WebElement email;
	
	@FindBy(name="Mobilephone")
	WebElement cell;
	
	@FindBy(xpath="//*[contains(text(), \"Save\")]")
	WebElement save;
	
	
	// by using this command ww will call the current class
	public Adduser() {
		PageFactory.initElements(driver, this);
	}
	//validate you are on the user list table
	public void validatelisttable() {
		  driver.findElement(By.xpath("//span[contains(.,'First Name')]"));
		
	}
	// it will click on adduser element
	public void clickmethod() {
		Adduser.click();
	}
	
	// sending the firstname
public void sendkeys() {
	firstname.clear();
	firstname.sendKeys("Narsa");
	
	// sending the lastname
	lastname.clear();
	lastname.sendKeys("baddam");
}

// sending the unique username
	public void uniquename() {
		username.clear();
		username.sendKeys("narsareddy");
		
	}
	
	//sending the another unique username
	public void uniqueusername() {
		username.clear();
		username.sendKeys("dushyanth");
	}
	//sending the password 
	public void Password() {
	password.clear();
	password.sendKeys("narsa123");
	}
	//click on radiobutton of company AAA 
	public void checkbox() {
		driver.findElement(By.xpath("//label[contains(.,'Company AAA')]"));
		radiobutton.click();
	}
	//click on another radiobutton of company BBB
	public void customerclick() {
		driver.findElement(By.xpath("//label[contains(.,'Company BBB')]"));
	customer.click();
	}
	//click and select the salesteam in dropdown list
	public void salesteam() {
	Select sel = new Select(driver.findElement(By.name("RoleId")));
	sel.selectByIndex(1);
	}
	//click and select the admin in dropdown list
	public void Admin() {
		Select sel = new Select(driver.findElement(By.name("RoleId")));
		sel.selectByIndex(3);
		
	}
	
	public void emailmethod() {
		// enter the email id
	email.clear();
	email.sendKeys("narsa12@gmail.com");
	
	// enter the cellphone number
	cell.clear();
	cell.sendKeys("112244558");
	
	// click on save button
	save.click();
}

}



