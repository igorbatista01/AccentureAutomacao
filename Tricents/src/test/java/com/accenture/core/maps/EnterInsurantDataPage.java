package com.accenture.core.maps;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import drivers.DriverWeb;

public class EnterInsurantDataPage {

	private WebDriver driver;

	public EnterInsurantDataPage() {
		driver = DriverWeb.getDriver();

	}
	
	public void preencherFirstName(String t) {
		driver.findElement(By.id("firstname")).sendKeys(t);
			
	}

	public void preencherLastName(String t) {
		driver.findElement(By.id("lastname")).sendKeys(t);	
	}

	public void preencherBirthDate(String t) {
		driver.findElement(By.id("birthdate")).sendKeys(t);			
	}
	
	public void selecionarGender(String t) {
// parent subir um nível acima
		driver.findElement(By.xpath("//*[@name='Gender']/parent::*[normalize-space() = '"+t+"']")).click();
	}
	public void preencherStreetAddress(String t) {
		driver.findElement(By.id("streetaddress")).sendKeys(t);	
	}
	
	public void selecionarCountry(String t) {
		Select select = new Select(driver.findElement(By.id("country")));
		select.selectByVisibleText(t);
	}
	
	public void preencherZipCode(String t) {
		driver.findElement(By.id("zipcode")).sendKeys(t);			
	}
	
	public void preencherCity(String t) {
		driver.findElement(By.id("city")).sendKeys(t);			
	}
	
	public void selecionarOccupation(String t) {
		Select select = new Select(driver.findElement(By.id("occupation")));
		select.selectByVisibleText(t);		
	}
	
	public void selecionarHobbies(String t) {
		driver.findElement(By.xpath("//*[@name='Hobbies']/parent::*[normalize-space() = '"+t+"']")).click();
	}
	
	public void preencherWebSite(String t) {
		driver.findElement(By.id("website")).sendKeys(t);		
	}
	
	public void clicarBotaoNextEnterInsurantData() {
		driver.findElement(By.id("nextenterproductdata")).click();
	}	
}
