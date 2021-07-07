package br.com.keeggo.cucumber;

import br.com.keeggo.managers.PageObjectManager;
import br.com.keeggo.managers.WebDriverManager;

public class TestContext {

	 private WebDriverManager webDriverManager;
	 private PageObjectManager pageObjectManager;
	 
	 public TestContext(){
	 webDriverManager = new WebDriverManager();
	 pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	 }
	 
	 public WebDriverManager getWebDriverManager() {
	 return webDriverManager;
	 }
	 
	 public PageObjectManager getPageObjectManager() {
	 return pageObjectManager;
	 }
}
