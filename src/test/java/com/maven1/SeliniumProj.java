package com.maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeliniumProj {
    @Test
	private void tc_1() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		System.out.println("TestNgChrome tc_1");
	}
	@Test
	private void tc_2() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println("TestNgChrome tc_2");
	}
	@Test
	private void tc_3() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("TestNgChrome tc_3");
	}
	

}
