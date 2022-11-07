package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;

	// 1. By Locators:
	private By tutorials = By.id("navbtn_tutorials");
	private By learnJavaOpt = By.xpath("//a[text()='Learn Java']");

	// 2. Constructor of the page class:
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public void clickOnTutorial() {
		driver.findElement(tutorials).click();
	}

	public void clickOnLearnJava() {
		driver.findElement(learnJavaOpt).click();
	}
}
