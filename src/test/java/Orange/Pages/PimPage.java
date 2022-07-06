package Orange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Orange.Steps.ButtonPages;

public class PimPage {
	
	
	private ButtonPages buttonPages;
	
	@FindBy(how = How.ID,using = "firstName")
	private WebElement txtFirstName;
	
	@FindBy(how = How.ID,using = "lastName")
	private WebElement txtlastName;
	
	//constructor
	public PimPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		this.buttonPages = new ButtonPages(driver);
	}
	
	public void llegarAddEmployee() {
		buttonPages.btnPim();
		buttonPages.btnAdd();
		
	}
	
	public void AddEmployee(String firstName,String lastName) {
		txtFirstName.sendKeys(firstName);
		txtlastName.sendKeys(lastName);
		buttonPages.btnSave();
		
	}

	
	
	}
	
	

