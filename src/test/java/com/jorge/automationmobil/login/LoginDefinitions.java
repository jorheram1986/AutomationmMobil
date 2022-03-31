package com.jorge.automationmobil.login;

import com.jorge.automationmobil.pageobjects.ValidacionSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinitions {
	@Steps
	LoginSteps loginSteps;
	ValidacionSteps validacionSteps;

    /**
     * @return Logueo sin registro de equipo
     */

	@Given("^Inicio sesion exitosa dentro de la  App VodQA \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void inicioSesionExitosaDentroDeLaAppVodQA(String usuario, String password, String mensaje) throws Throwable {
		loginSteps.iniciar_app();
		loginSteps.logueoAppVodQA(usuario, password);
		loginSteps.VerificarAccesoApp(mensaje);
	}
	@When("^Elijo la opcion Carousel dentro de la app VodQA \"([^\"]*)\"$")
	public void elijoLaOpcionCarouselDentroDeLaAppVodQA(String mensajeCarousel) throws Throwable {
		CarouselSteps.elijoLaOpcionCarousel(mensajeCarousel);
	}
	@Then("^Validar que el primer elemento mostrado se el numero uno \"([^\"]*)\"$")
	public void validarQueElPrimerElementoMostradoSeElNumeroUno(String validacion) throws Throwable {
		validacionSteps.verficarNumeroUno(validacion);
	}
}

