package Pagelocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Util.testbase;

public class Loginpagelocator extends testbase {
	public Loginpagelocator() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.NAME, using = "txtUsername")
	public WebElement email;

	@FindBy(how = How.ID, using = "txtPassword")
	public WebElement password;

	@FindBy(how = How.NAME, using = "Submit")
	public WebElement login;

	@FindBy(how = How.XPATH, using = "//b[text()='Recruitment']")
	public WebElement recruitment;

	@FindBy(how = How.ID, using = "btnAdd")
	public WebElement ClickAdd;

	@FindBy(how = How.NAME, using = "addCandidate[firstName]")
	public WebElement fname;

	@FindBy(how = How.NAME, using = "addCandidate[lastName]")
	public WebElement lname;

	@FindBy(how = How.ID, using = "addCandidate_email")
	public WebElement emailid;

	@FindBy(how = How.XPATH, using = "//input[@name='addCandidate[contactNo]']")
	public WebElement con;

	@FindBy(how = How.NAME, using = "addCandidate[consentToKeepData]")
	public WebElement clic;

}
