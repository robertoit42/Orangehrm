package Orange.Definitions;

import org.openqa.selenium.WebDriver;

import Orange.Pages.LeavePage;
import Orange.Pages.LoginPage;
import Orange.Pages.PimPage;
import Orange.Pages.TimePage;
import Orange.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private PimPage pimPage = new PimPage(driver);
	LeavePage leavePage = new LeavePage(driver);
	TimePage timePage = new TimePage(driver);
	
	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	@And("^llenar campo de usuario (.*) y contraseña (.*)$")
	public void diligenciarFormulario(String userName, String pass) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.diligenciarFormulario(userName, pass);
	}
	
	
	@And("^llegar a la opcion agregar empleado$")
	public void llegarAddEEmployee() {
		this.pimPage= new PimPage(driver);
		this.pimPage.llegarAddEmployee();
	}
	
	@When("^al diligencial first name (.*) y last name (.*)$")
	public void AddEmployee(String firstName, String lastName) {
		this.pimPage = new PimPage(driver);
		this.pimPage.AddEmployee(firstName, lastName);
	}
	
	@And("^buscar empleado$")
	public void searchEmployee() {
		this.leavePage= new LeavePage(driver);
		this.leavePage.searchEmployee();
	}
	
	@And("^estimation employee$")
	public void estimationsemployee() {
		this.timePage= new TimePage(driver);
		this.timePage.estimationsemployee();
		
	}
}