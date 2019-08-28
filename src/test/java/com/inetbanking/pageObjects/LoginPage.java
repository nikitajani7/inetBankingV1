package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		WebDriver ldriver;
		
		public LoginPage(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
			
		}
		@FindBy(name="uid")
		WebElement textUserName;
		@FindBy(name="password")
		WebElement textPassword;
		@FindBy(name="btnLogin")
		WebElement btnLogin;
		
		@FindBy(xpath="//ul[@class='menusubnav']/li[15]/a")
		@CacheLookup
		WebElement lnkLogout;
		
		public void setUserName(String uname)
		{
			textUserName.sendKeys(uname);
		}
		public void setPassword(String pwd)
		{
			textPassword.sendKeys(pwd);
		}
		public void clickSubmit()
		{
			btnLogin.click();
		}
		
		public void clickLogout()
		{
			lnkLogout.click();
		}
}
