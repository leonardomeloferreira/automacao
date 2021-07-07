package br.com.rsinet.hub_bdd.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import br.com.rsinet.hub_bdd.cucumber.TestContext;
import br.com.rsinet.hub_bdd.managers.WebDriverManager;
import br.com.rsinet.hub_bdd.pageFactory.Home_Page;
import br.com.rsinet.hub_bdd.util.Constant;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
	WebDriver driver;
	TestContext testContext;
	Home_Page homePage;
	WebDriverManager manager;

	public HomePageSteps(TestContext context) throws Exception {

		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		manager = testContext.getWebDriverManager();
		driver = manager.getDriver();

	}

	@Given("^Usuario esteja na pagina inicial$")
	public void usuario_esteja_na_pagina_inicial() {
		Reporter.addStepLog("Navegando para a pagina inicial");
		homePage.navigateTo_HomePage();

	}
	
	
	@When("^Usuario navegar para a pagina de Login$")
	public void usuario_navegar_para_a_pagina_de_Login() throws Throwable {
		Reporter.addStepLog("Navegando para a pagina de Login");
		homePage.my_Account();

	}

	@Then("^login sera efetuado com sucesso$")
	public void login_sera_efetuado_com_sucesso() throws Throwable {
		Reporter.addStepLog("login sera efetuado com sucesso");
		homePage.validaRegisto();
		
	}

	

}