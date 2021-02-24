package org.adactin;

import java.io.IOException;

import org.maintest.MasterBase;
import org.openqa.selenium.WebElement;

public class AdactinMainUsingPom extends MasterBase {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	MasterBase base=new MasterBase();
	base.getDriver();
	base.loadurl("http://adactinhotelapp.com/");
	base.browserMax();
	
	Thread.sleep(3000);
	
	AdactinLoginPage page=new AdactinLoginPage();
	WebElement txtusername = page.getTxtusername();
	base.type(txtusername, base.excelRead("D:\\Eclipse Workspace\\MavenProjecct\\Excel\\Pom.xlsx", "Pom", 0, 0));
	WebElement txtpassword = page.getTxtpassword();
	base.type(txtpassword, base.excelRead("D:\\Eclipse Workspace\\MavenProjecct\\Excel\\Pom.xlsx", "Pom", 1, 0));
	WebElement btnlogin = page.getBtnlogin();
	base.click(btnlogin);
	}
}
