package br.com.viniciusvalongo.testepratico;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PageObject {
	
	 private final WebDriver driver;

	    public PageObject(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    public void esperar() {
	    	driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MILLISECONDS);
	    }

	    public void acessarSite(String url) {
	    	esperar();
	        driver.get(url);
	        esperar();
	    }

	    
	    public void clicarBotaoSeeOffer() {
	    	esperar();
	    	driver.findElement(By.xpath("//*[@id=\"div-special-offer\"]/div/span")).click();
	    	driver.navigate().to("https://advantageonlineshopping.com/#/product/3");
	    	esperar();
	      
		}
	    
	    public void enter() {
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ENTER).build().perform();
	    }
	    



		
		
}