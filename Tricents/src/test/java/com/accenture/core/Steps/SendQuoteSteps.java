package com.accenture.core.Steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.accenture.core.maps.EnterVehicleDataPage;
import com.accenture.core.maps.SendQuotePage;

import drivers.DriverWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class SendQuoteSteps{



	private SendQuotePage sendQuotePage;
	
	
	@Given("Estou na página Send Quote")
	public void estou_na_pagina_select_price_option() throws Throwable {
		sendQuotePage = new SendQuotePage();
		System.out.println("passei no passo 2");
		

	}
	
	@When("Preencho o campo Email com {string}")
	public void seleciono_price_option(String t) throws InterruptedException, FileNotFoundException, IOException{
		sendQuotePage.preencherEmail(t);
	}
	
	@And("Preencho o campo Phone com {string}")
	public void preencho_o_campo_phone(String t) {
		sendQuotePage.preencherPhone(t);
	}
	
	@And("Preencho o campo Username com {string}")
	public void preencho_o_campo_username(String t) {
		sendQuotePage.preencherUserName(t);
	}
	
	@And("Preencho o campo Password e Confirm password {string}")
	public void preencho_o_campo_password_e_confirm_password(String t) {
		sendQuotePage.preencherPassword(t);
	}
	
	@And("Preencho o campo Comments {string}")
	public void preencho_o_campo_comments(String t) {
		sendQuotePage.preencherComments(t);
	}
	
	
	@And("Clico no botão Send")
	public void clico_no_botao_send() throws InterruptedException {
		sendQuotePage.clicarBotaoSend();		
	}

	@Then("Clico no botão OK dentro do modal de sucesso.")
	public void clico_no_botao_ok_dentro_do_modal_de_sucesso() {
		sendQuotePage.aguardarLoading();
		sendQuotePage.clicarBotaoOkModalSucesso();		
	}	
	
	@Then("Finalizo")
	public void finalizo() throws InterruptedException {
		sendQuotePage.finalizar();	
	}	
	
	
	
}