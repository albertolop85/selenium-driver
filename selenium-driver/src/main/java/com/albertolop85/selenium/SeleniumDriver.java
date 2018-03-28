package com.albertolop85.selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class SeleniumDriver implements WebDriver {
	
	private WebDriver webDriver;
	private Screen screen;
	
	public SeleniumDriver(WebDriver wd) {
		webDriver = wd;
	}
	
	// Selenium Methods

	public void close() {
		webDriver.close();
	}

	public WebElement findElement(By arg0) {
		return webDriver.findElement(arg0);
	}

	public List<WebElement> findElements(By arg0) {
		return webDriver.findElements(arg0);
	}

	public void get(String arg0) {
		webDriver.get(arg0);
	}

	public String getCurrentUrl() {
		return webDriver.getCurrentUrl();
	}

	public String getPageSource() {
		return webDriver.getPageSource();
	}

	public String getTitle() {
		return webDriver.getTitle();
	}

	public String getWindowHandle() {
		return webDriver.getWindowHandle();
	}

	public Set<String> getWindowHandles() {
		return webDriver.getWindowHandles();
	}

	public Options manage() {
		return webDriver.manage();
	}

	public Navigation navigate() {
		return webDriver.navigate();
	}

	public void quit() {
		// TODO: ADD MORE BEHAVIOR. QUIT EVERYTHING ELSE
		webDriver.quit();
	}

	public TargetLocator switchTo() {
		return webDriver.switchTo();
	}
	
	// Sikuli Methods
	
	public int click() {
		return screen.click();
	}
	
	public <T> int click(T target) throws FindFailed {
		return screen.click(target);
	}
	
	public <T> Match find(T target) throws FindFailed {
		return screen.find(target);
	}
	
	public <T> Object wait(T target) throws FindFailed {
		return screen.wait(target);
	}
	
	public <T> Object wait(T target, int timeout) throws FindFailed {
		return screen.wait(target, timeout);
	}
}
