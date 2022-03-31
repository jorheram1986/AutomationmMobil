package com.jorge.automationmobil.login;

import com.jorge.automationmobil.utils.AccionesObjetos;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginSteps {
	
	LoginPageObject loginPageObject;
	AccionesObjetos accionesObjetos;


	@Step	
	public void iniciar_app() {
		// TODO Auto-generated method stub
		loginPageObject.gotoWPLoginPage();
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