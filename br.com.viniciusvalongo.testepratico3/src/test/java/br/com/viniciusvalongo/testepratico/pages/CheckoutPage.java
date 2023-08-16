package br.com.viniciusvalongo.testepratico.pages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.viniciusvalongo.testepratico.attributes.CheckoutAttributes;
import br.com.viniciusvalongo.testepratico.db.DB;

public class CheckoutPage {
	
	CheckoutAttributes cp = new CheckoutAttributes();
	
	private WebDriver driver;
	
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, cp);
	}


	public void validarCorSelecionada() {
		cp.getValidarProdutoCorSelecionada().getText();
	}
	
	public void validandoSoma() {
		cp.getValidarSomaValorProduto().getText();
		cp.getValidarSomaValorTotal().getText();
		Assert.assertEquals(cp.getValidarSomaValorProduto().getText(),cp.getValidarSomaValorTotal().getText());
	}
	
	public void realizarUpdate() {
		Connection conn = null;
		PreparedStatement st = null;		
		try{
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"UPDATE massas "
					+ "SET COLOR = ? "
					+ "WHERE "
					+ "(COLOR = ?)");
			
			st.setObject(1, cp.getValidarProdutoCorSelecionada().getAttribute("title"));
			st.setObject(2, "GRAY");
					
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally{
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
