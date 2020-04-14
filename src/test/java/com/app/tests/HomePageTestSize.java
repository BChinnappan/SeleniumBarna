package com.app.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.pages.BasePage;
import com.app.pages.HomePageObjects;
import com.app.pages.HomePageSize;

public class HomePageTestSize {
	HomePageObjects hp;
	HomePageSize Hps;
	BasePage Bp;

	public HomePageTestSize() {
		// TODO Auto-generated constructor stub
		 hp= new HomePageObjects();
		Hps = new HomePageSize();
		Bp = new BasePage();
		
	}
	@Test
	public void VerifySizeWomen() {
		hp.getWomenTag().click();
		Assert.assertTrue(Bp.elementFound(Hps.getSizeS()), "Failed");
		Assert.assertTrue(Bp.elementFound(Hps.getSizeM()), "Failed");
	 	Assert.assertTrue(Bp.elementFound(Hps.getSizeL()), "Failed");
	}
	@Test
	public void VerifySizeDress() {		
		hp.getDressTag().click();
		Assert.assertTrue(Bp.elementFound(Hps.getSizeS()), "Failed");
		Assert.assertTrue(Bp.elementFound(Hps.getSizeM()), "Failed");
	 	Assert.assertTrue(Bp.elementFound(Hps.getSizeL()), "Failed");
	}
	@Test
	public void VerifySizeTshirt() {
		hp.getTshirtTag().click();
		Assert.assertTrue(Bp.elementFound(Hps.getSizeS()), "Failed");
		Assert.assertTrue(Bp.elementFound(Hps.getSizeM()), "Failed");
	 	Assert.assertTrue(Bp.elementFound(Hps.getSizeL()), "Failed");
    }
}

