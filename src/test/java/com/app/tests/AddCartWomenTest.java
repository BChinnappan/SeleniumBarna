package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.HomePageObjects;
import com.app.pages.HomePageWomen;

public class AddCartWomenTest {
	HomePageObjects Hp;
	BasePage Bp;
	HomePageWomen Wp;
	
	public AddCartWomenTest() {
		// TODO Auto-generated constructor stub
		Hp = new HomePageObjects();
		Bp = new BasePage();
		Wp = new HomePageWomen();
		
	}
	@Test
	public void Womentag() {
		Hp.getWomenTag().click();
		Bp.mouseOver(Wp.getFadeshirt());
		Wp.getAddcart().click();
		Wp.getproceed().click();
		Assert.assertTrue(Wp.getProduct().getText().contains("roduct"),"Failed");
	}
		@Test
	    public void VerifyTshirtTag() {
	    	Assert.assertTrue(Bp.elementFound(Hp.getTshirtTag()), "Failed");
	    }  
						
	 		
	}


