package br.com.keeggo.stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import br.com.keeggo.cucumber.TestContext;
import br.com.keeggo.managers.PageObjectManager;
import br.com.keeggo.managers.WebDriverManager;
import br.com.keeggo.pageFactory.Home_Page;
import br.com.keeggo.pageFactory.Login_Page;
import br.com.keeggo.pageFactory.Register_Page;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterPageSteps {
  
	
	WebDriver driver;
	TestContext testContext;
	Register_Page registerPage;
	PageObjectManager pageObjectManager;
	WebDriverManager manager; 
	
	public RegisterPageSteps(TestContext context) {
		 
		 testContext = context;
		 registerPage = testContext.getPageObjectManager().getRegisterPage();
		 manager = testContext.getWebDriverManager();
		 driver = manager.getDriver();
		 }
	
	//valido
	@When("^Usuario peencher os campos com dados validos$")
	public void usuario_peencher_os_campos_com_dados_validos() throws Throwable {
		Reporter.addStepLog("Preenchendo os campos");
		registerPage.registro();
	}
	
	@Then("^Usuario sera registrado com sucesso$")
	public void usuario_sera_registrado_com_sucesso() throws Throwable {
		registerPage.validaRegisto();
		System.out.println("usuario registrado");
	}
	


}
