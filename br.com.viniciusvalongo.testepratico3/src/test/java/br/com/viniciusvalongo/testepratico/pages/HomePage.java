package br.com.viniciusvalongo.testepratico.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.viniciusvalongo.testepratico.attributes.HomeAttributes;

public class HomePage {
	
	HomeAttributes hp = new HomeAttributes();
	
	private WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, hp);
	}
	
		
	public void specialOffer() {
		hp.getSpecialOffer().click();
		
	}
	
	public void seeOffer() {
		hp.getBtnSeeOffer().click();
	}
	
	public void menuSeach() {
		hp.getMenuSearch().click();;
		hp.getAutoComplete().sendKeys("HP PAVILION 15Z TOUCH LAPTOP");
				
	}
	
	public void selecionandoProduto() {
		hp.getSelecionandoProduto().click();
	}

	
	
}
