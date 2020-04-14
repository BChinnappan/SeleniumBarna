package com.app.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {

			//Include Page Factory
		@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
		private WebElement Women;	
	        
		@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
		private WebElement Dresses;
            
		@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
		private WebElement tshirts;
		
		public HomePageObjects() {
			PageFactory.initElements(driver, this);
		}
		    
		public WebElement getWomenTag(){
			return Women;
		}
		public WebElement getDressTag(){
			return Dresses;
		}
		public WebElement getTshirtTag(){
			return tshirts;
		}
		public WebElement MouseOver() {
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[@title = 'Women']"))).build().perform();
		ac.doubleClick().build().perform();
		ac.contextClick().build().perform();
		return Dresses;
		}
			
}
				
		
		
	

