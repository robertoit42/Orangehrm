package Orange.Pages;

import org.openqa.selenium.WebDriver;

import Orange.Steps.ButtonPages;

public class TimePage {
	
	private ButtonPages buttonPages;

	public TimePage(WebDriver driver) {
		this.buttonPages = new ButtonPages(driver);
		
	}
	public void estimationsemployee() {
		buttonPages.btnTime();
	}

}


