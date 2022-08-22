@run
Feature: Teste

	@tag_scenario
  Scenario: Teste Um
    Given Estou no site Tricentis
    When Seleciono a página Enter Vehicle Data
    Then Seleciono o campo Make com "Ford"
    And Preencho o campo Engine Performance com "2000"
    And Preencher Date of Manufacture com "01/02/2020"
    And Seleciono Number of Seats com "1"
    And Seleciono Fuel Type com "Gas"
    And Preencho o campo List Price com "1000"
    And Preencho o campo License Plate Number com "ACC2022"
    And Preencho o campo Anual Mileage com "1000"
    Then Clico no botão Next Enter Vehicle Data
    
    Given Estou na página Enter Insurante Data
    When Preencho o campo First Name com "Igor"
    Then Preencho o campo Last Name com "Batista"
    And Preencho o campo Date of Birth com "02/13/2000"
    And Seleciono Gender com "Male" 
    And Preencho o campo Street Address com "Test St"
    And Seleciono o país "Brazil"
    And Preencho o campo Zip Code com "05360130" 
    And Preencho o campo City com "São Paulo"
    And Seleciono a Occupation "Employee"
    And Seleciono o Hobby "Speeding"
    And Seleciono o Hobby "Cliff Diving"
    And Preencho o campo website com "www.accenture.com/br-pt"
    Then Clico no botão Next Enter Insurant Data
    
    Given Estou na página Enter Product Data
		When Preencho o campo Start Date com "09/30/2022"
		Then Seleciono Insurance Sum "5.000.000,00"
		And Seleciono Merit Rating "Bonus 1"
		And Seleciono Damage Insurance "Full Coverage"
		And Seleciono Optional Products "Euro Protection"
		And Seleciono Optional Products "Legal Defense Insurance"
		And Seleciono Courtesy Car "Yes"
		Then Clico no botão Next Enter Product Data
		
		Given Estou na página Select Price Option
		When Seleciono Price Option "Gold"
		Then Clico no botão Next Select Price Option
		
		Given Estou na página Send Quote
		When Preencho o campo Email com "teste@teste.teste.br"
		And Preencho o campo Phone com "5511999999999"
		And Preencho o campo Username com "igorbatista"
		And Preencho o campo Password e Confirm password "Senhadeteste08@."
		And Preencho o campo Comments "Olá, este é um teste."
		And Clico no botão Send
		Then Clico no botão OK dentro do modal de sucesso.
		
		Then Finalizo


