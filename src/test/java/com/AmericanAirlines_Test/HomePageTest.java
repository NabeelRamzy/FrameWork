package com.AmericanAirlines_Test;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	@Test (enabled = false , priority = 1)
	public void clickJoinButtonTest() throws InterruptedException {
		homePage.clickJoinButton();
		Thread.sleep(3000);
	}
	@Test(enabled = false , priority = 2)
	public void clickAndInputUserNameTest() throws InterruptedException {
		homePage.clickAndInputFirstName();
		Thread.sleep(3000);
	}
	@Test(enabled = false , priority = 4)
	public void logo_Test() throws InterruptedException {
		homePage.Validate_Logo();
		Thread.sleep(3000);
	}
    @Test(enabled = true , priority = 3)
	public void searchfield_Test() throws InterruptedException {
		homePage.search_field();
		Thread.sleep(3000);
	}
}
