package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageWomen extends BasePage {
	//Include Page Factory
	@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[1]")
	private WebElement Fadeshirt;
		
	@FindBy(xpath="(//a[@title='Add to cart'])[1]")
	private WebElement AddCart;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[1]")
	private WebElement Proceed;
	
	@FindBy(xpath="(//*[@id='summary_products_quantity']")
	private WebElement product;
	
	
	public HomePageWomen() {
		PageFactory.initElements(driver, this);
	}
	    

	public WebElement getProduct(){
		return product;
	}	
	public WebElement getFadeshirt(){
	   return Fadeshirt;
	}
	public WebElement getAddcart(){
		return AddCart;
    }
	public WebElement getproceed(){
		return product;
	}

}
