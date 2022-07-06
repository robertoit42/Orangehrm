package Orange.Pages;

import org.openqa.selenium.WebDriver;

import Orange.Steps.ButtonPages;

public class LeavePage {
	
	private ButtonPages buttonPages;

	public LeavePage(WebDriver driver) {
		this.buttonPages = new ButtonPages(driver);
		
	}
	public void searchEmployee() {
		buttonPages.btnLeave();
	}

}
