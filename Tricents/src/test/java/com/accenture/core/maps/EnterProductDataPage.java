package com.accenture.core.maps;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import drivers.DriverWeb;

public class EnterProductDataPage {

	private WebDriver driver;

	public EnterProductDataPage() {
		this.driver = DriverWeb.getDriver();

	}
	
	public void preencherStartDate(String t) {
		driver.findElement(By.id("startdate")).sendKeys(t);
			
	}
	public void selecionarInsuranceSum(String t) {
		Select select = new Select(driver.findElement(By.id("insurancesum")));
		select.selectByVisibleText(t);
	}

	public void selecionarMeritRating(String t) {
		Select select = new Select(driver.findElement(By.id("meritrating")));
		select.selectByVisibleText(t);		
	}
	
	public void selecionoDamageInsurance(String t) {
// parent subir um nível acima
		Select select = new Select(driver.findElement(By.id("damageinsurance")));
		select.selectByVisibleText(t);	
	}
	public void preencherOptionalProducts(String t) {
		driver.findElement(By.xpath("//*[@name='Optional Products[]']/parent::*[normalize-space() = '"+t+"']")).click();
	}
	
	public void selecionoCourtesyCar(String t) {
		Select select = new Select(driver.findElement(By.id("courtesycar")));
		select.selectByVisibleText(t);
	}

	
	public void clicarBotaoNextEnterProductData() {
		driver.findElement(By.id("nextselectpriceoption")).click();
	}	
}
