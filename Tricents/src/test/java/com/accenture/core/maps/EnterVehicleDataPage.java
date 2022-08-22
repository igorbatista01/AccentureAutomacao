package com.accenture.core.maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import drivers.DriverWeb;

public class EnterVehicleDataPage {

	private WebDriver driver;

	public EnterVehicleDataPage() {
		this.driver = DriverWeb.getDriver();

	}
	
	public void clicarAutomobileMenu() {
		driver.findElement(By.id("nav_automobile")).click();
			
	}

	public void selecionarMake(String t) {
		Select select = new Select(driver.findElement(By.id("make")));
		select.selectByVisibleText(t);
	}

	public void preencherEnginePerformance(String t) {
		driver.findElement(By.id("engineperformance")).sendKeys(t);			
	}
	
	public void preencherDateOfManufacture(String t) {
		driver.findElement(By.id("dateofmanufacture")).sendKeys(t);
	}
	public void selecionarNumberOfSeats(String t) {
		Select select = new Select(driver.findElement(By.id("numberofseats")));
		select.selectByVisibleText(t);
	}
	
	public void selecionarFuelType(String t) {
		Select select = new Select(driver.findElement(By.id("fuel")));
		select.selectByVisibleText(t);
	}
	
	public void preencherListPrice(String t) {
		driver.findElement(By.id("listprice")).sendKeys(t);			
	}
	
	public void preencherLicensePlateNumber(String t) {
		driver.findElement(By.id("licenseplatenumber")).sendKeys(t);			
	}
	
	public void preencherAnnualMileage(String t) {
		driver.findElement(By.id("annualmileage")).sendKeys(t);			
	}
	
	public void clicarBotaoNextEnterVehicleData() {
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}	
}

