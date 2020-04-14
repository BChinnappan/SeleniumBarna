package com.app.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageSize extends BasePage{
	
	//Include Page Factory
	        @FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")   
	        private WebElement Women;
	        
	        
			@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[1]/label")
			private WebElement SizeS;	
		        
			@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[2]/label")
			private WebElement SizeM;
	            
			@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[3]/label")
			private WebElement SizeL;
			

	public HomePageSize() {
		// TODO Auto-generated constructor stub
		 PageFactory.initElements(driver, this);
	}
  public WebElement getWomenTag() {
		return Women;
		
	}
	public WebElement getSizeS() {
		return SizeS;
	}
	public WebElement getSizeM(){
		return SizeL;
	}	
    public WebElement getSizeL(){
		return SizeL;
		
	}
	 

}
