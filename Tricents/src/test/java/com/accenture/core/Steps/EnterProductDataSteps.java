package com.accenture.core.Steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.accenture.core.maps.EnterVehicleDataPage;
import com.accenture.core.maps.EnterInsurantDataPage;
import com.accenture.core.maps.EnterProductDataPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class EnterProductDataSteps{



	private EnterProductDataPage enterProductDataPage;
	
	
	@Given("Estou na página Enter Product Data")
	public void estou_na_pagina_enter_product_data() {
		enterProductDataPage = new EnterProductDataPage();
		System.out.println("passei no passo 3");
		
	}
	
	@When("Preencho o campo Start Date com {string}")
	public void preencho_start_date(String t) throws InterruptedException, FileNotFoundException, IOException{
		enterProductDataPage.preencherStartDate(t);
	}
	
	@Then("Seleciono Insurance Sum {string}")
	public void preencho_insurance_sum(String t) {
		enterProductDataPage.selecionarInsuranceSum(t);
	}
	
	@And("Seleciono Merit Rating {string}")
	public void seleciono_merit_rating(String t) {
		enterProductDataPage.selecionarMeritRating(t);
	}
	
	@And("Seleciono Damage Insurance {string}")
	public void seleciono_damage_insurance(String t) {
		enterProductDataPage.selecionoDamageInsurance(t);
	}
	
	@And("Seleciono Optional Products {string}")
	public void seleciono_optional_products(String t) throws InterruptedException {
		enterProductDataPage.preencherOptionalProducts(t);
	}
	
	@And("Seleciono Courtesy Car {string}")
	public void seleciono_courtesy_car(String t) {
		enterProductDataPage.selecionoCourtesyCar(t);
	}
	
	@Then("Clico no botão Next Enter Product Data")
	public void clico_no_botao_next_enter_insurant_data() throws InterruptedException {
		enterProductDataPage.clicarBotaoNextEnterProductData();
	}
}