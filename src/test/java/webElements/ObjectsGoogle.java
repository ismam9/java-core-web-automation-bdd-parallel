package webElements;

import config.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ObjectsGoogle extends WebDriver{
	
	 public ObjectsGoogle() {
	        PageFactory.initElements(driver, this);
	 }  
	 
	 // COOKIES GOOGLE.COM
	 @FindBy(xpath = "//input[@title = 'Buscar']")
	 public WebElement ES_MODAL_COOKIES;
	 @FindBy(xpath = "//div[text()='Aceptar todo']")
	 public WebElement ES_MODAL_BTN_ACEPTARTODO;
	 @FindBy(xpath = "//div[text()='Rechazar todo']")
	 public WebElement ES_MODAL_BTN_RECHAZARTODO;
	 @FindBy(xpath = "//button/div[contains(text(), 'todo')]")
	 public WebElement ES_MODAL_BTN_ACEPTARYRECHARTODO;
	 @FindBy(xpath = "//a[text()='Más opciones']")
	 public WebElement ES_MODAL_A_MOREOPTIONS;
	 
	 @FindBy(xpath = "//input[@title = 'Search']")
	 public WebElement EN_MODAL_COOKIES;
	 @FindBy(xpath = "//div[text()='Accept all']")
	 public WebElement EN_MODAL_BTN_ACEPTARTODO;
	 @FindBy(xpath = "//div[text()='Reject all']")
	 public WebElement EN_MODAL_BTN_RECHAZARTODO;
	 @FindBy(xpath = "//button/div[contains(text(), 'all')]")
	 public WebElement EN_MODAL_BTN_ACEPTARYRECHARTODO;
	 @FindBy(xpath = "//a[text()='More options']")
	 public WebElement EN_MODAL_A_MOREOPTIONS;
	 
	 // PRINCIPAL GOOGLE.COM
	 @FindBy(xpath = "//*[@title = 'Buscar']")
	 public WebElement ES_INPUT_GOOGLE;
	 @FindBy(xpath = "//*[@title = 'Search']")
	 public WebElement EN_INPUT_GOOGLE;
	 
	 //PRINCIPAL GOOGLE.COM > SEARCH subastas
	 @FindBy(xpath = "//h3[contains(text(), 'Subastas de Bienes Embargados')]")
	 public List<WebElement> SEG_SOCIAL_SEARCHED_LINKS;

	 @FindBy(xpath = "//div[@role='navigation']/div/div/div[@jscontroller]")
	 public WebElement NAV_RESULTS;

	 @FindBy(xpath = "//cite[@role='text']")
	 public List<WebElement> ALL_CITE_SITES;
	
}
