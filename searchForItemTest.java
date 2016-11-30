package test.jCode.tests;

import org.junit.Test;

import main.jCode.pageElements.*;
import main.jCode.pageObWebControls.*;
import main.jCode.pageObjects.*;

public class searchForItemTest {
	
	PageBrowser browser = new PageBrowser("FF");
	String url = "https://mijn.apexBasedApplication/apex/myAcceptanceEnvironment/f?p=111";
	
	@Test
	public void test() throws InterruptedException 
	{
		browser.toFPage(url);
		Login loginPage = new Login(PageBrowser.getDriver());
		MainPage fPage = loginPage.doLogin("gebruikersnaam","wachtwoord");
		Thread.sleep(2000);
		fPage.initiate();
		SearchPage zPage = new SearchPage(PageBrowser.getDriver());
		zPage = (SearchPage) fPage.openMainMenuItem("Zoeken", PageTypes.SEARCH);
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		zPage.initiate();
		zPage.searchForItem("mySearchTerm");
	
		ClientPage cPage = zPage.click_ClientRow("clientrowIdentifier");
		cPage.initiate();
		FramePage ifPage = cPage.clickButton("SomeThing1_Button");

		
		ifPage.initiate();
		ifPage.closeFrame(cPage);
		//
		cPage.clickButton("SomeThing2_Button");
		Flog.writeLLine("SomeThing2 clicked");
		cPage.initiate();
		cPage.clickButton("SomeThing3_Button");
		Flog.writeLLine("SomeThing3 clicked");
		cPage.initiate();
		cPage.clickButton("SomeThing4_Button");
		Flog.writeLLine("SomeThing4 clicked");
		cPage.initiate();
		cPage.clickButton("SomeThing5_Button");
		Flog.writeLLine("SomeThing5 clicked");
		cPage.initiate();
		cPage.clickButton("SomeThing6_Button");
		Flog.writeLLine("SomeThing6 clicked");
		cPage.initiate();
		cPage.clickButton("SomeThing7_Button");
		Flog.writeLLine("SomeThing7 clicked");
		cPage.initiate();
		cPage.clickButton("SomeThing8_Button");
		Flog.writeLLine("SomeThing8 clicked");
		cPage.initiate();
		cPage.clickButton("SomeThing9_Button");
		Flog.writeLLine("SomeThing9 clicked");
		cPage.initiate();
		cPage.clickButton("SomeThing10_Button");
		Flog.writeLLine("SomeThing10 clicked");
		cPage.initiate();

	}
}
