package Stepdeff;

import Pageaction.Loginpageaction;
import Util.testbase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginpagestepdeff extends testbase {
	Loginpageaction loginpageaction = new Loginpageaction();

	@Given("^Open Application url \"([^\"]*)\"$")
	public void open_Application_url(String URL) throws Throwable {
		launchhh(URL);
	}

	@When("^Enter User Name,Password and Click on Login(\\d+)$")
	public void enter_User_Name_Password_and_Click_on_Login(int arg) throws Throwable {
		// homepageaction.UserNamePassword(prop.getProperty("username"),prop.getProperty("password"));

		loginpageaction.UserNamePassword(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^Click on recruitment$")
	public void click_on_recruitment() throws Throwable {
		loginpageaction.Clickonrecruitment();
	}

	@Then("^Click on Add button$")
	public void click_on_Add_button() throws Throwable {
		loginpageaction.Clickonadd();

	}

	// @Then("^Enter First Name,Last Name,Email,Contact No,Click on Checkbox$")
	// public void enter_First_Name_Last_Name_Email_Contact_No_Click_on_Checkbox()
	// throws Throwable {

	@Then("^Enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter(String fname, String lname, String emailid, String con, String clic) throws Throwable {
		loginpageaction.firstname();
	}

	@When("^Click on Save button$")
	public void click_on_Save_button() throws Throwable {
		loginpageaction.lastname();
	}

	@Then("^verify Add a valid candidate successfully$")
	public void verify_Add_a_valid_candidate_successfully() throws Throwable {
		loginpageaction.emailid();
	}

	@When("^Enter User Name, Password and Click on Login$")
	public void enter_User_Name_Password_and_Click_on_Login() throws Throwable {
		loginpageaction.ContactNo();
	}

	@Then("^Click on Candidate Name Field$")
	public void click_on_Candidate_Name_Field() throws Throwable {
		loginpageaction.ClickonCheckbox();
	}

	@Then("^Enter Candidate Name in the Field$")
	public void enter_Candidate_Name_in_the_Field() throws Throwable {

	}

	@When("^Click on Search button$")
	public void click_on_Search_button() throws Throwable {

	}

	@Then("^Click on Candidate$")
	public void click_on_Candidate() throws Throwable {

	}

	@And("^Click on Edit$")
	public void click_on_Edit() throws Throwable {

	}

	@Then("^Click on Choose File$")
	public void click_on_Choose_File() throws Throwable {

	}

	@When("^Choose the File$")
	public void choose_the_File() throws Throwable {

	}

	@Then("^Click on Save$")
	public void click_on_Save() throws Throwable {

	}

	@And("^verify Download a candidate resume$")
	public void verify_Download_a_candidate_resume() throws Throwable {

	}

}
