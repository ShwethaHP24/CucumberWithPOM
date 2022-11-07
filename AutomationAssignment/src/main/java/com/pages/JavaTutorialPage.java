package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaTutorialPage {

	private WebDriver driver;

	// 1. By Locators:
	private By javaClass = By.xpath("//h2[text()='Java Classes']/following-sibling::a");
	private By javaFileHandling = By.xpath("//h2[text()='Java File Handling']/following-sibling::a");

	// 2. Constructor of the page class:
	public JavaTutorialPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getJavaTutorialPageTitle() {
		return driver.getTitle();
	}

	public List<String> getJavaClassList() {

		List<String> javaTutorialList1 = new ArrayList<>();
		List<WebElement> list1 = driver.findElements(javaClass);
		for (WebElement e : list1) {
			javaTutorialList1.add(e.getText());
		}

		List<String> javaTutorialList2 = new ArrayList<>();
		List<WebElement> list2 = driver.findElements(javaFileHandling);
		for (WebElement e : list2) {
			javaTutorialList2.add(e.getText());
		}

		System.out.println(javaTutorialList1.removeAll(javaTutorialList2));
		return javaTutorialList1;

	}

}
