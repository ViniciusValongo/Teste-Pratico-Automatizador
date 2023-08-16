package br.com.viniciusvalongo.testepratico.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.viniciusvalongo.testepratico.attributes.CartAttributes;

public class CartPage {
	
	CartAttributes cp = new CartAttributes();
	
	private WebDriver driver;
	
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, cp);
	}
	
	
	public void remover() {
		cp.getRemoverProduto().click();;
	}
	
	public void carrinhoVazio() {
		String empyt = cp.getCarrinhoazio().getText();
		Assert.assertEquals("Your shopping cart is empty",empyt);
	}

}
