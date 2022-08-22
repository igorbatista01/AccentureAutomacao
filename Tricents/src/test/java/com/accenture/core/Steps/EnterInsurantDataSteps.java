package com.accenture.core.Steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.accenture.core.maps.EnterVehicleDataPage;
import com.accenture.core.maps.EnterInsurantDataPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class EnterInsurantDataSteps{



	private EnterInsurantDataPage enterInsurantDataPage;
	
	
	@Given("Estou na página Enter Insurante Data")
	public void estou_na_pagina_enter_insurance_data() {
		enterInsurantDataPage = new EnterInsurantDataPage();
		System.out.println("passei no passo 2");
		

	}
	
	@When("Preencho o campo First Name com {string}")
	public void preencho_o_campo_first_name(String t) throws InterruptedException, FileNotFoundException, IOException {
		enterInsurantDataPage.preencherFirstName(t);
	}
	
	@Then("Preencho o campo Last Name com {string}")
	public void preencho_o_campo_last_name(String t) {
		enterInsurantDataPage.preencherLastName(t);
	}
	
	@And("Preencho o campo Date of Birth com {string}")
	public void preencho_o_campo_date_of_birth(String t) {
		enterInsurantDataPage.preencherBirthDate(t);
	}
	
	@And("Seleciono Gender com {string}")
	public void seleciono_male_em_gender(String t) {
		enterInsurantDataPage.selecionarGender(t);
	}
	
	@And("Preencho o campo Street Address com {string}")
	public void preencho_o_campo_street_address(String t) {
		enterInsurantDataPage.preencherStreetAddress(t);
	}
	
	@And("Seleciono o país {string}")
	public void seleciono_o_pais(String t) {
		enterInsurantDataPage.selecionarCountry(t);
	}
	
	@And("Preencho o campo Zip Code com {string}")
	public void preencho_o_campo_zip_code(String t) {
		enterInsurantDataPage.preencherZipCode(t);
	}
	
	@And("Preencho o campo City com {string}")
	public void preencho_o_campo_city(String t) {
		enterInsurantDataPage.preencherCity(t);
	}
	
	@And("Seleciono a Occupation {string}")
	public void seleciono_occupation(String t) {
		enterInsurantDataPage.selecionarOccupation(t);
	}
	
	@And("Seleciono o Hobby {string}")
	public void seleciono_hobbies(String t) {
		enterInsurantDataPage.selecionarHobbies(t);
	}
	
	@And("Preencho o campo website com {string}")
	public void preencho_o_campo_website(String t) {
		enterInsurantDataPage.preencherWebSite(t);
	}
	@Then("Clico no botão Next Enter Insurant Data")
	public void clico_no_botao_next_enter_insurant_data() throws InterruptedException {
		enterInsurantDataPage.clicarBotaoNextEnterInsurantData();
	}
}