package stepDefnition;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NowkaripageHomePage;
import setup.DriverFactory;
import util.ElementUtil;
import util.SoftAssert;

public class NowkariProfileUpdate extends DriverFactory {

    SoftAssert softassert = new SoftAssert();
    private NowkaripageHomePage nowkariPage = new NowkaripageHomePage(getDriver());

    @Given("I navigate to nowkari website")
    public void i_navigate_to_nowkari_website() {
    	
    	ElementUtil.fluentWaitForVisibility(nowkariPage.getlogo_nowkari());
        Assert.assertTrue(ElementUtil.checkIfElementIsPresent(nowkariPage.getlogo_nowkari()), "Nowkari home page successfully displayed");
    }

    @And("I enter email id {string}")
    public void i_enter_email_id(String email) {
        ElementUtil.clearAndFillValue(nowkariPage.getTxt_EmailInputLocator(), email, "email");
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
        ElementUtil.clearAndFillValue(nowkariPage.getTxt_passwordInputLocator(), password, "password");
    }

    @And("I clicked on login button")
    public void i_clicked_on_login_button() {
        ElementUtil.click(nowkariPage.getBtn_loginButton(), "login button");
    }

    @And("I clicked on view profile")
    public void I_clicked_on_view_profile() {
    	
    	   ElementUtil.click(nowkariPage.getIcon_viewprofile(), "view profile");
    }

    @Then("I clicked on key skill edit button")
    public void i_clicked_on_KeySkill_editbutton() {   
       
    	ElementUtil.scrollElementToView(nowkariPage.getBtnKeySkilledit(),"down");
    	 ElementUtil.click(nowkariPage.getBtnKeySkilledit(), "edit button");
    }

    @And("I deleted SQL keySkill")
    public void I_deleted_SQL_keySkill() {
   	 ElementUtil.click(nowkariPage.getTxtKeySql(), "key skill button");
    }
    
    @And("I save and verified sucess message")
    public void I_save_and_verified_sucess_message() {
   	 ElementUtil.click(nowkariPage.getBtnSave(), "save button");
     Assert.assertTrue(ElementUtil.checkIfElementIsPresent(nowkariPage.getMsgSucess()), "After updating sucess message successfully displayed");
    }
    
    @And("I add keySkill {string}")
    public void I_add_keySkill(String keyskill) {

    	ElementUtil.searchAndSelect(nowkariPage.getSearchbox(), nowkariPage.getValuesearchbox(), keyskill, "key skill", false);
    }
    
    @Then("I clicked on logout button")
    public void I_clicked_on_logout_button() {
      	 ElementUtil.click(nowkariPage.getprofileContextMenu(), "context menu");
      	 ElementUtil.click(nowkariPage.getBtnlogout(), "logout button");
      	 
    }
    
    @And("I verified sucessfully logout")
    public void I_verified_sucessfully_logout() {

      softassert.assertTrue(ElementUtil.checkIfElementIsPresent(nowkariPage.getTxthomepage()), "Verified log out sucessfully");	 
      	 
    }
    
    @AfterMethod
    public void assertAll() {
    	softassert.assertAll();
    }
    
}
