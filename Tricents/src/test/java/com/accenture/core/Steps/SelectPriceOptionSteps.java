package com.accenture.core.Steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.accenture.core.maps.EnterVehicleDataPage;
import com.accenture.core.maps.SelectPriceOptionPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectPriceOptionSteps{



	private SelectPriceOptionPage selectPriceOptionPage;
	
	
	@Given("Estou na página Select Price Option")
	public void estou_na_pagina_select_price_option() {
		selectPriceOptionPage = new SelectPriceOptionPage();
		System.out.println("passei no passo 2");
		

	}
	
	@When("Seleciono Price Option {string}")
	public void seleciono_price_option(String t) throws InterruptedException, FileNotFoundException, IOException{
		selectPriceOptionPage.selecionarPriceOption(t);
	}
	
	

	@Then("Clico no botão Next Select Price Option")
	public void clico_no_botao_next_select_price_option() throws InterruptedException {
		selectPriceOptionPage.clicarBotaoNextEnterInsurantData();
	}
}