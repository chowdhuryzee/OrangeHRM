package Pageaction;

import Pagelocator.Loginpagelocator;
import Util.testbase;


public class Loginpageaction extends testbase{
	Loginpagelocator loginpagelocator = new Loginpagelocator();

	public void UserNamePassword(String u, String p) {

		loginpagelocator.email.sendKeys(u);

		loginpagelocator.password.sendKeys(p);

		loginpagelocator.login.click();

	}

	public void Clickonrecruitment() {
		loginpagelocator.recruitment.click();
	}

	public void Clickonadd() {
		loginpagelocator.ClickAdd.click();

	}

	public void firstname() {
		loginpagelocator.fname.sendKeys("Mohammad");
	}

	public void lastname() {
		loginpagelocator.lname.sendKeys("Hossain");

	}

	public void emailid() {
		loginpagelocator.emailid.sendKeys("hossainmd07054@gmail.com");
	}

	public void ContactNo() {
		loginpagelocator.con.sendKeys("9734521641");
	}

	public void ClickonCheckbox() {
		loginpagelocator.clic.click();
	}

}
