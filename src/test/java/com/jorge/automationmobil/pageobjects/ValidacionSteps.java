package com.jorge.automationmobil.pageobjects;

import com.jorge.automationmobil.login.LoginPageObject;
import com.jorge.automationmobil.utils.AccionesObjetos;
import net.thucydides.core.annotations.Step;
import org.hamcrest.MatcherAssert;

public class ValidacionSteps {
	AccionesObjetos accionesObjetos;
	static LoginPageObject loginPageObject;


	@Step("Validar numero uno en la opcion de Carousel")
	public void verficarNumeroUno(String validacion) {
		accionesObjetos.EsperarObtenerObjetos("class","android.widget.TextView");
		MatcherAssert.assertThat(loginPageObject.ObtenerMensajeValidacion(),loginPageObject.ObtenerMensajeValidacion().contains(validacion));
	}
}
