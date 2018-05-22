package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import configuration.ShareDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.HomePage;
import page.VuelosPage;

public class BusquedaSteps {

	WebDriver driver;
	HomePage homePage;
	VuelosPage vuelosPage;

	public BusquedaSteps(HomePage homePage, ShareDriver shareDriver, VuelosPage vuelosPage) {
		driver = shareDriver;
		this.homePage = homePage;
		this.vuelosPage = vuelosPage;
	}

	@Given("el usuario esta en la pagina de despegar")
	public void usuarioIngresaPaginaDespegar() throws InterruptedException {

		driver.get("https://www.despegar.com.co");

		Thread.sleep(2000);
//		if (driver.findElements(By.xpath("/html/body/div/div/div/span[@class=\"as-login-close as-login-icon-close-circled\"]")).size() != 0) {
//			driver.findElement(By.xpath("/html/body/div/div/div/span[@class=\"as-login-close as-login-icon-close-circled\"]")).click();
//		}

		try {
			if (driver.findElements(By.xpath("/html/body/div/div/div/span[@class=\"as-login-close as-login-icon-close-circled\"]")).size() != 0) {
				driver.findElement(By.xpath("/html/body/div/div/div/span[@class=\"as-login-close as-login-icon-close-circled\"]")).click();
				//driver.findElement(By.xpath("/html/body/div[16]/div/div[1]/span")).click();
				//driver.findElement(By.xpath("/html/body/div/div/div/span[@class=\\\"as-login-close as-login-icon-close-circled\\\"]")).click(); // Cierro la ventana modal
				//startpage.opcionVuelo();
			}
		} catch (ElementNotVisibleException e) {
			//NoSuchElementException
			//startpage.opcionVuelo();
			//ElementNotVisibleException
		}

	}

	@When("elige la opcion vuelos")
	public void eligeOpcionVuelos() throws InterruptedException {
		homePage.eligeOpcionVuelos();
	}

	@And("elige ida y vuelta")
	public void eligeIdaVuelta() throws InterruptedException {
		homePage.eligeIdaVuelta();
	}

	@And("ingresa ciudad origen (.*)")
	public void ingresaCiudadOrigen(String ciudadOrigen) throws InterruptedException {
		homePage.ingresaCiudadOrigen(ciudadOrigen);
	}

	@And("ingresa ciudad destino (.*)")
	public void ingresaCuidadDestino(String ciudadDestino) throws InterruptedException {
		homePage.ingresaCuidadDestino(ciudadDestino);
	}

	@And("ingresa fecha de partida")
	public void ingresaFechaPartida() throws InterruptedException {
		homePage.ingresaFechaPartida();
	}

	@And("ingresa fecha de regreso")
	public void ingresaFechaRegreso() throws InterruptedException {
		homePage.ingresaFechaRegreso();
	}

	@And("ingresa numero de pasajeros")
	public void ingresaNumeroPasajeros() throws InterruptedException {
		homePage.ingresaNumeroPasajeros();
	}

	@And("elige la opcion buscar")
	public void eligeOpcionBuscar() {
		homePage.eligeOpcionBuscar();
	}

	@Then("se muestra la lista de vuelos disponibles")
	public void muestraVuelosDisponibles() throws InterruptedException {
		String resultado = vuelosPage.muestraVuelosDisponibles();
		assertEquals("Despegar.com . Resultados de Vuelos", resultado);
	}

	@And("se ordena por criterio (.*)")
	public void ordenarPorCriterio(String ordenarPor) {
		vuelosPage.ordenarPorCriterio(ordenarPor);
	}

	@And("almacena resultado en excel")
	public void almacenaResultado() throws IOException, InterruptedException {
		vuelosPage.almacenaResultado();
	}

	@Then("se muestra mensaje de error en las fechas")
	public void muestraMensajeErrorFechas() {
		String resultado = homePage.muestraMensajeErrorFechas();
		assertEquals("Ingresa una fecha de regreso", resultado);
	}

	@Then("se muestra mensaje para ingresar el destino")
	public void muestraMensajeErrorDestino() {
		String resultado = homePage.muestraMensajeErrorDestino();
		assertEquals("Ingresa un destino", resultado);
	}
}
