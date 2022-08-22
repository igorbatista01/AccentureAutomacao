package com.accenture.core.maps;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import drivers.DriverWeb;

public class SelectPriceOptionPage {

	private WebDriver driver;

	public SelectPriceOptionPage() {
		this.driver = DriverWeb.getDriver();

	}
	
	public void selecionarPriceOption(String t) throws InterruptedException {
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@name='Select Option'][@value='"+t+"']/..")).click();
	}


	public void clicarBotaoNextEnterInsurantData() {
		driver.findElement(By.id("nextsendquote")).click();
	}	
}
