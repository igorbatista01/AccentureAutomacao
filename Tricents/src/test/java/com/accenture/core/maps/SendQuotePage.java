package com.accenture.core.maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.*;

import drivers.DriverWeb;

public class SendQuotePage {

	private WebDriver driver;

	public SendQuotePage() {
		driver = DriverWeb.getDriver();
	}
	
	public void preencherEmail(String t) {
		driver.findElement(By.id("email")).sendKeys(t);
			
	}

	public void preencherPhone(String t) {
		driver.findElement(By.id("phone")).sendKeys(t);
			
	}	

	public void preencherUserName(String t) {
		driver.findElement(By.id("username")).sendKeys(t);
			
	}
	
	public void preencherPassword(String t) {
		driver.findElement(By.id("password")).sendKeys(t);
		driver.findElement(By.id("confirmpassword")).sendKeys(t);			
	}

	public void preencherComments(String t) {
		driver.findElement(By.id("Comments")).sendKeys(t);		
	}
	
	public void clicarBotaoSend() {
		driver.findElement(By.id("sendemail")).click();
	}

	public void aguardarLoading() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[normalize-space() = 'Sending e-mail success!']")));
		
		System.out.println("Sending e-mail success!");
	}

	public void clicarBotaoOkModalSucesso() {
		driver.findElement(By.cssSelector("div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button")).click();
	}
	
	public void finalizar() {
		DriverWeb.finalizar();

	}	
}
