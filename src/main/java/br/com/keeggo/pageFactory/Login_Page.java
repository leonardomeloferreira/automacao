package br.com.keeggo.pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/*
 * Elementos da pagina de login
 */

public class Login_Page {

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input")
	private WebElement txtbx_UserName;
	
	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input")
	private WebElement txtbx_Password;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"sign_in_btnundefined\"]")
	private WebElement btn_Login;
	
	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")
	private WebElement btn_CreateAccount;
	
	public void username(String name) {
		txtbx_UserName.sendKeys(name);
	}
	public void password(String password) {
		txtbx_Password.sendKeys(password);
	}
	public void login() {
		btn_Login.click();
	}
	public void create_Account() {
	    
	    btn_CreateAccount.sendKeys(Keys.ENTER);
	}
	public void entraUsuario() throws InterruptedException {
		username("LEO333");
	}
	public void entraSenha() throws InterruptedException {
		password("Teste@1234");
	}
	public void clicaEntrar() throws InterruptedException {
		btn_Login.click();
	}
}
