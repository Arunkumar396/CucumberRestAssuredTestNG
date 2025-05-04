package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ElementUtil;

public class NowkaripageHomePage {

	private WebDriver driver;

    // Locators
    private By emailInputLocator = ElementUtil.getElementIdentifierFromJson("email", "ID");
    private By passwordInputLocator = ElementUtil.getElementIdentifierFromJson("password", "ID"); 
    private By loginButtonLocator = ElementUtil.getElementIdentifierFromJson("login_Btn", "xpath");
    private By logo_nowkari = ElementUtil.getElementIdentifierFromJson("nowkari_logo", "xpath");
    private By icon_viewprofile = ElementUtil.getElementIdentifierFromJson("viewprofile_icon", "xpath");
    private By txt_KeySql = ElementUtil.getElementIdentifierFromJson("KeySql", "xpath");
    private By btnKeySkilledit = ElementUtil.getElementIdentifierFromJson("KeySkill_edit", "xpath");
    private By btnSave = ElementUtil.getElementIdentifierFromJson("Savebutton", "xpath");
    private By msgSucess = ElementUtil.getElementIdentifierFromJson("SucessMsg", "xpath");
    private By searchbox = ElementUtil.getElementIdentifierFromJson("searchbox", "ID");
    private By valuesearchbox = ElementUtil.getElementIdentifierFromJson("searchboxlist", "xpath");
    private By profileContextMenu = ElementUtil.getElementIdentifierFromJson("profileContextMenu", "xpath");
    private By btnlogout = ElementUtil.getElementIdentifierFromJson("logoutButton", "xpath");
    private By homepageTxt = ElementUtil.getElementIdentifierFromJson("homepageTxt", "xpath");

    
    
              
    // Constructor
    public NowkaripageHomePage(WebDriver driver) {
        this.driver = driver;
    }

    
    //Setter and getter 
    
	public By getTxt_EmailInputLocator() {
		return emailInputLocator;
	}	
	
	public By getTxt_passwordInputLocator() {
		return passwordInputLocator;
	}	
	public By getBtn_loginButton() {
		return loginButtonLocator;
	}
	
	public By getlogo_nowkari() {
		return logo_nowkari;
	}
	
	public By getIcon_viewprofile() {
		return icon_viewprofile;
	}
	
	public By getTxtKeySql() {
		return txt_KeySql;
	}
	
	public By getBtnKeySkilledit() {
		return btnKeySkilledit;
	}
	
	public By getBtnSave() {
		return btnSave;
	}
	
	public By getMsgSucess() {
		return msgSucess;
	}
	
	public By getSearchbox() {
		return searchbox;
	}
	
	public By getValuesearchbox() {
		return valuesearchbox;
	}
	
	public By getprofileContextMenu() {
		return profileContextMenu;
	}
	
	public By getBtnlogout() {
		return btnlogout;
	}
	
	public By getTxthomepage() {
		return homepageTxt;
	}
	
}
