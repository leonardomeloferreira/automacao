package br.com.keeggo.managers;

import org.openqa.selenium.WebDriver;

import br.com.keeggo.pageFactory.Home_Page;
import br.com.keeggo.pageFactory.Login_Page;
import br.com.keeggo.pageFactory.Register_Page;


/*
 * Criador do objeto da pagina
 */

public class PageObjectManager {

	private Home_Page homePage;
	private Login_Page loginPage;
	private Register_Page registerPage;
	private WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	
	/*
	 * Cria o objeto da classe de pagina apenas se o objeto for nulo
	 */
	
	public Home_Page getHomePage() {
		return (homePage == null) ? homePage = new Home_Page(driver) : homePage;
	}
	public Login_Page getLoginPage() {
		return (loginPage == null) ? loginPage = new Login_Page(driver) : loginPage;
	}
	public Register_Page getRegisterPage() {
		return (registerPage == null) ? registerPage = new Register_Page(driver) : registerPage;
	}
}
