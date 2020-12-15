package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.HomeWikiPage;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.homeAutomationPractice;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;

public class compararPrendas {

	@Managed(driver = "chrome")
	public WebDriver driver;
	
	private homeAutomationPractice page;
	Actor carito = Actor.named("caro");
	
	@Before
	public void SetUp() {
		carito.can(BrowseTheWeb.with(driver));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
    @Given("^que el usuario seleccionó una prenda para comparar\.$")
    public void que_el_usuario_seleccion_una_prenda_para_comparar() throws Throwable {
        throw new PendingException();
    }

    @When("^ingreso al comparador\.$")
    public void ingreso_al_comparador() throws Throwable {
        throw new PendingException();
    }

    @Then("^se visualiza un cartel advirtiendo que falta otra prenda\.$")
    public void se_visualiza_un_cartel_advirtiendo_que_falta_otra_prenda() throws Throwable {
        throw new PendingException();
    }
}
