package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Desktops extends Base {


	public void DesktopsPage() {
		PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//a[text() ='Desktops']")	
private WebElement desktopTab;

@FindBy (xpath = "//a[text() ='Show All Desktops']")
private WebElement ShowAllDesktop;

@FindBy (tagName = "img")
private List<WebElement> items;

public void clickOnDesktopTab() {
	Actions action = new Actions(driver);
	action.moveToElement(desktopTab).build().perform();
}

public void clicOnShowAllDesktops() {
	ShowAllDesktop.click();
}

public List<WebElement> elements(){
	List<WebElement> DesktopsItems = items;
	return DesktopsItems;
}
	
	
}
