package br.com.viniciusvalongo.testepratico.attributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutAttributes {
	

	
	@FindBy(css = "span.ng-binding")
	private WebElement validarProdutoCorSelecionada;
	
	
	@FindBy(css = "p.price.roboto-regular.ng-binding")
	private WebElement validarSomaValorProduto;
	
	@FindBy(css = "span.roboto-medium.totalValue.ng-binding")
	private WebElement validarSomaValorTotal;
	


	//
	public WebElement getValidarProdutoCorSelecionada() {
		return validarProdutoCorSelecionada;
	}

	public void setValidarProdutoCorSelecionada(WebElement validarProdutoCorSelecionada) {
		this.validarProdutoCorSelecionada = validarProdutoCorSelecionada;
	}

	public WebElement getValidarSomaValorProduto() {
		return validarSomaValorProduto;
	}

	public void setValidarSomaValorProduto(WebElement validarSomaValorProduto) {
		this.validarSomaValorProduto = validarSomaValorProduto;
	}

	public WebElement getValidarSomaValorTotal() {
		return validarSomaValorTotal;
	}

	public void setValidarSomaValorTotal(WebElement validarSomaValorTotal) {
		this.validarSomaValorTotal = validarSomaValorTotal;
	}
	
	

}
