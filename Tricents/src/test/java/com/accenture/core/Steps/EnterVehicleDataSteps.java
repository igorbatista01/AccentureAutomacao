package com.accenture.core.Steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.accenture.core.maps.EnterVehicleDataPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class EnterVehicleDataSteps{


	private EnterVehicleDataPage enterVehicleDataPage;
	
	
	@Given("Estou no site Tricentis")
	public void estou_no_site_tricents() {
		enterVehicleDataPage = new EnterVehicleDataPage();
	}
	
	@When("Seleciono a página Enter Vehicle Data")
	public void seleciono_a_pagina_enter_vehicle_data() throws InterruptedException, FileNotFoundException, IOException {
		enterVehicleDataPage.clicarAutomobileMenu();
	}
	
	@Then("Seleciono o campo Make com {string}")
	public void seleciono_o_campo_make(String t) {
		enterVehicleDataPage.selecionarMake(t);
	}
	
	@And("Preencho o campo Engine Performance com {string}")
	public void preencho_o_campo_engine_performance(String t) {
		enterVehicleDataPage.preencherEnginePerformance(t);
	}
	
	@And("Preencher Date of Manufacture com {string}")
	public void preencher_date_of_manufacture(String t) {
		enterVehicleDataPage.preencherDateOfManufacture(t);
	}
	
	@And("Seleciono Number of Seats com {string}")
	public void seleciono_number_of_seats(String t) {
		enterVehicleDataPage.selecionarNumberOfSeats(t);
	}
	
	@And("Seleciono Fuel Type com {string}")
	public void seleciono_fuel_type(String t) {
		enterVehicleDataPage.selecionarFuelType(t);
	}
	
	@And("Preencho o campo List Price com {string}")
	public void preencho_o_campo_list_price(String t) {
		enterVehicleDataPage.preencherListPrice(t);
	}
	
	@And("Preencho o campo License Plate Number com {string}")
	public void preencho_o_campo_license_plate_number(String t) {
		enterVehicleDataPage.preencherLicensePlateNumber(t);
	}
	
	@And("Preencho o campo Anual Mileage com {string}")
	public void preencho_o_campo_anual_mileage(String t) {
		enterVehicleDataPage.preencherAnnualMileage(t);
	}

	@Then("Clico no botão Next Enter Vehicle Data")
	public void clico_no_botao_next_enter_vehicle_data() throws InterruptedException {
		enterVehicleDataPage.clicarBotaoNextEnterVehicleData();
	}	
}