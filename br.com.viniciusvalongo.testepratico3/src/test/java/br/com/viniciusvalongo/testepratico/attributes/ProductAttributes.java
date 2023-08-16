package br.com.viniciusvalongo.testepratico.attributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductAttributes {
	

	
	@FindBy(css = "h1.roboto-regular.screen768.ng-binding")
	private WebElement validandoProduto;
	
	@FindBy(css ="span#bunny[title='GRAY']")
	private WebElement salvandoCor;
	
	@FindBy(css = "span#bunny[title='GRAY']")
	private WebElement alterandoCor;
	
	@FindBy(css = "button.roboto-medium.ng-scope[name='save_to_cart']")
	private WebElement AddToCart;
	
	@FindBy(id = "checkOutPopUp")
	private WebElement popUp;
		
	@FindBy(css = "span#bunny.bunny.productColor.ng-scope.RED")
	private WebElement salvandoCorDiferenteDoBD;
	
	@FindBy(css = "span#bunny.bunny.productColor.ng-scope.RED")
	private WebElement corDiferenteDoBD;
	
	@FindBy(css = "div.plus[increment-value-attr='+']")
	private WebElement alteraQuantidade;
	
	@FindBy(id = "checkOutPopUp")
	private WebElement checkout;
	
	@FindBy(id = "shoppingCartLink")
	private WebElement carrinhoCompras;
	
	


	public WebElement getValidandoProduto() {
		return validandoProduto;
	}

	public void setValidandoProduto(WebElement validandoProduto) {
		this.validandoProduto = validandoProduto;
	}

	public WebElement getSalvandoCor() {
		return salvandoCor;
	}

	public void setSalvandoCor(WebElement salvandoCor) {
		this.salvandoCor = salvandoCor;
	}

	public WebElement getAlterandoCor() {
		return alterandoCor;
	}

	public void setAlterandoCor(WebElement alterandoCor) {
		this.alterandoCor = alterandoCor;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}

	public void setAddToCart(WebElement addToCart) {
		AddToCart = addToCart;
	}

	public WebElement getPopUp() {
		return popUp;
	}

	public void setPopUp(WebElement popUp) {
		this.popUp = popUp;
	}


	public WebElement getSalvandoCorDiferenteDoBD() {
		return salvandoCorDiferenteDoBD;
	}

	public void setSalvandoCorDiferenteDoBD(WebElement salvandoCorDiferenteDoBD) {
		this.salvandoCorDiferenteDoBD = salvandoCorDiferenteDoBD;
	}

	public WebElement getCorDiferenteDoBD() {
		return corDiferenteDoBD;
	}

	public void setCorDiferenteDoBD(WebElement corDiferenteDoBD) {
		this.corDiferenteDoBD = corDiferenteDoBD;
	}

	public WebElement getAlteraQuantidade() {
		return alteraQuantidade;
	}

	public void setAlteraQuantidade(WebElement alteraQuantidade) {
		this.alteraQuantidade = alteraQuantidade;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}

	public WebElement getCarrinhoCompras() {
		return carrinhoCompras;
	}

	public void setCarrinhoCompras(WebElement carrinhoCompras) {
		this.carrinhoCompras = carrinhoCompras;
	}
	
	
	//
	

}
