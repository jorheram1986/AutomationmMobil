package com.jorge.automationmobil.login;

import com.jorge.automationmobil.utils.AccionesObjetos;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject extends PageObject {
	public LoginPageObject(WebDriver driver){super(driver);}
	
	AccionesObjetos accionesObjetos;
	
    /**
     * @return Logueo app VodQA
     */

	@AndroidFindBy(className = "android.widget.EditText")
	WebElement labelCampoUser;

	@AndroidFindBy(id = "username")
	WebElement txtUsuario;

	@AndroidFindBy(id = "password")
	WebElement txtContrasena;

	@AndroidFindBy(className = "android.widget.Button")
	WebElement btnContinuar;

	@AndroidFindBy(className = "android.widget.TextView")
	WebElement lblMensaje;

	@AndroidFindBy(id = "carousel")
	WebElement lblMensajeCarousel;

	@AndroidFindBy(className = "android.widget.TextView")
	WebElement lblMensajeValidacion;

	public void gotoWPLoginPage(){
	}

	public void DarClickCampoUser()	{
	accionesObjetos.ClickObjeto(labelCampoUser, "");
	}
	public void IngresarUsuario(String usu)	{
		accionesObjetos.SetInputText(txtUsuario, usu);
	}
	public void IngresarContrasena(String pass){
		accionesObjetos.SetInputText(txtContrasena, pass);
	}
	public void DarClickBotonLoginIn()	{
		accionesObjetos.ClickObjeto(btnContinuar, "");
	}

	public String ObtenerMensajeLabel()	{
		return lblMensaje.getText();	}

	public String ObtenerMensajeCarousel()	{
		return lblMensajeCarousel.getText();
	}
	public String ObtenerMensajeValidacion() {
		return lblMensajeValidacion.getText();
	}

}
