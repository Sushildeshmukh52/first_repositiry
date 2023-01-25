 package Com.Ecommerse.Pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerse.Baseclass.ecommerse_baseclass;

public class ecommerse_loginpage extends ecommerse_baseclass {
	
	public ecommerse_loginpage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="Email")
    public WebElement username;
	@FindBy(id="Password")
	public WebElement password;
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")
	public WebElement button;
	
	public void login(String uname) {
		username.sendKeys(uname);
	}
	public void pass(String pass) {
		password.sendKeys(pass);
	}
	public void click() {
		button.click();
	}
}
