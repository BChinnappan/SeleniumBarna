package com.app.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.pages.BasePage;
import com.app.pages.HomePageObjects;


public class HomePageTest {
	HomePageObjects Hp;
	BasePage Bp;
	
	public HomePageTest() {
		// TODO Auto-generated constructor stub
		Hp = new HomePageObjects();
		Bp = new BasePage();
	}
    @Test
   public void VerifyWomenTag() {
    	Assert.assertTrue(Bp.elementFound(Hp.getWomenTag()), "Failed");
    }
    @Test
    public void VerifyDressTag() {
    	Assert.assertTrue(Bp.elementFound(Hp.getDressTag()), "Failed");
     }
    @Test
    public void VerifyTshirtTag() {
    	Assert.assertTrue(Bp.elementFound(Hp.getTshirtTag()), "Failed");
    }  
      
}
