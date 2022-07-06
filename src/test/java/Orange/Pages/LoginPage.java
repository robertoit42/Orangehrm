package Orange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Orange.Steps.ButtonPages;



public class LoginPage {
	
	private ButtonPages buttonPages;
	
	@FindBy(how = How.ID, using = "txtUsername")
    // nombre de la variable que guarda @FindBy
	private WebElement inputUserName;
	@FindBy(how = How.ID, using = "txtPassword")
    private WebElement inputContrasena;
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
	}
	//metodo
    public void diligenciarFormulario(String userName, String pass) {
        inputUserName.sendKeys(userName);
        inputContrasena.sendKeys(pass);
        buttonPages.botonLogin();
    }
}
