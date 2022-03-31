package com.jorge.automationmobil.login;

import com.jorge.automationmobil.utils.AccionesObjetos;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import static org.hamcrest.MatcherAssert.assertThat;

public class CarouselSteps {
	
	static LoginPageObject loginPageObject;
	static AccionesObjetos accionesObjetos;

	public static void elijoLaOpcionCarousel(String mensajeCarousel) {
		accionesObjetos.Swipe(500, 1300, 500, 300);
		WebElement a = accionesObjetos.EsperarObtenerObjetos("class","android.widget.TextView");
		assertThat(loginPageObject.ObtenerMensajeCarousel(),loginPageObject.ObtenerMensajeLabel().contains(mensajeCarousel));
	}


	public void logueoAppVodQA(String usu, String pass) {
		accionesObjetos.EsperarObtenerObjetos("class","android.widget.ImageView");
		loginPageObject.DarClickCampoUser();
		loginPageObject.IngresarUsuario(usu);
		loginPageObject.IngresarContrasena(pass);
		loginPageObject.DarClickBotonLoginIn();
	}
	
	@Step("Verificar Acceso App")
	public void VerificarAccesoApp(String mensaje){
		accionesObjetos.EsperarObtenerObjetos("class","android.widget.TextView");
		assertThat(loginPageObject.ObtenerMensajeLabel(),loginPageObject.ObtenerMensajeLabel().contains(mensaje));
	}
}