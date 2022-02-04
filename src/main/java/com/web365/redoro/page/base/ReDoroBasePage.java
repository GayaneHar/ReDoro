package com.web365.redoro.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ReDoroBasePage {
	
	protected WebDriver driver;

	public ReDoroBasePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
	}
}
