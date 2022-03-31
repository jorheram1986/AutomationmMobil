package com.jorge.automationmobil.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccionesObjetos extends PageObject {
	@SuppressWarnings("unchecked")
	 AppiumDriver<MobileElement> conexionAppium = ((AppiumDriver<MobileElement>) ((WebDriverFacade) getDriver())
	   .getProxiedDriver());
	 public AccionesObjetos(WebDriver driver) {
	  super(driver);
	  PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);}
	 
	 public AppiumDriver<MobileElement>  getconexionAppium(){return this.conexionAppium;}
	 private int tiempoEspera = 30;
	 public void setTiempoEspera(int newTime) {this.tiempoEspera = newTime;}
	 
	 public void hideKeyboard() throws Exception {
		 try {
			 conexionAppium.hideKeyboard();
		 } catch (Exception e) {
			 System.out.println("Error al esconder el teclado");
		 }
	}
	 
	public void SetInputText(WebElement el, String dato)
	{
		if(dato.equals("[IGNORE]")) return;
		
		//Serenity.takeScreenshot();
		el.sendKeys(dato);
		try {hideKeyboard();} catch (Exception e) {e.printStackTrace();}
		Serenity.takeScreenshot();
	}
	
	public void ClickObjeto(WebElement el, String dato)
	{
		if(dato.equals("[IGNORE]")) return;
		
		//Serenity.takeScreenshot();
		el.click();
		Serenity.takeScreenshot();
	}
	
	/***
	 * 
	 * @param pro propiedad por el cual será buscado id, class, xpath
	 * @param prop valor de la propiedad 
	 * @return
	 */
	public WebElement EsperarObtenerObjetos(String pro, String prop)
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), tiempoEspera);
		WebElement element = null;
		
		try{
		switch(pro)
		{
			case "id":
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop)));
				element = getDriver().findElement(By.id(prop));
			break;
			case "xpath":
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop)));
				element = getDriver().findElement(By.xpath(prop));
			break;
			case "class":
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(prop)));
				element = getDriver().findElement(By.className(prop));
			break;
		}
		}catch(Exception ex) {}
		
		return element;
	}
	
	public void Swipe (int inicialx, int inicialy, int finx, int finy) {
		new TouchAction((PerformsTouchActions) conexionAppium).longPress(inicialx,inicialy).
		moveTo(finx,finy).release().perform();
	}

}
