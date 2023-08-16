package br.com.viniciusvalongo.testepratico.attributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeAttributes {



	@FindBy(linkText = "SPECIAL OFFER")
	private WebElement specialOffer;
	
	@FindBy(id = "see_offer_btn")
	private WebElement btnSeeOffer;
	

	@FindBy(id = "menuSearch")
	private WebElement menuSearch;

	@FindBy(id = "autoComplete")
	private WebElement autoComplete;
	
	@FindBy(id = "menuSeacrch")
	private WebElement clicandoNovamenteMenuSearch;
	
	@FindBy(css = "a.productName.ng-binding")
	private WebElement selecionandoProduto;



	
	
	//
	public WebElement getSpecialOffer() {
		return specialOffer;
	}

	public void setSpecialOffer(WebElement specialOffer) {
		this.specialOffer = specialOffer;
	}

	public WebElement getBtnSeeOffer() {
		return btnSeeOffer;
	}

	public void setBtnSeeOffer(WebElement btnSeeOffer) {
		this.btnSeeOffer = btnSeeOffer;
	}

	public WebElement getMenuSearch() {
		return menuSearch;
	}

	public void setMenuSearch(WebElement menuSearch) {
		this.menuSearch = menuSearch;
	}

	public WebElement getAutoComplete() {
		return autoComplete;
	}

	public void setAutoComplete(WebElement autoComplete) {
		this.autoComplete = autoComplete;
	}

	public WebElement getClicandoNovamenteMenuSearch() {
		return clicandoNovamenteMenuSearch;
	}

	public void setClicandoNovamenteMenuSearch(WebElement clicandoNovamenteMenuSearch) {
		this.clicandoNovamenteMenuSearch = clicandoNovamenteMenuSearch;
	}

	public WebElement getSelecionandoProduto() {
		return selecionandoProduto;
	}

	public void setSelecionandoProduto(WebElement selecionandoProduto) {
		this.selecionandoProduto = selecionandoProduto;
	}

	



}
