package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.Testbase;

public class testcases extends Testbase {
com.qa.pages.Adduser  adduser;
	
	@BeforeMethod
	public void SetUp() { 
		initialization();
		adduser = new com.qa.pages.Adduser();
	}
	@Test(priority=1)
	public void uservalidate() {
		adduser.validatelisttable();
	}
	
	@Test(priority=2)
	public void Adduserlist() {
	adduser.clickmethod();
	adduser.sendkeys();
	adduser.uniquename();
	adduser.Password();
	adduser.checkbox();
	adduser.salesteam();
	adduser.emailmethod();
		
	}
	@Test(priority=3)
	public void adduserlistmethos() {
		adduser.clickmethod();
		adduser.sendkeys();
		adduser.uniqueusername();
		adduser.Password();
		adduser.customerclick();
		adduser.Admin();
		adduser.emailmethod();
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
		

}



