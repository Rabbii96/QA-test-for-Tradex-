package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.DriverSetup;

public class SQA_Task extends DriverSetup {
	@Test
	public void Signup() throws InterruptedException {
		driver.get("https://exchange-tradex.nftarttoken.xyz/sign-up");
		WebElement Email_field = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password_field = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement Confrim_password_field = driver.findElement(By.xpath("//input[@id='password_confirm']"));
		
		Email_field.sendKeys("fazlayrabby1996@gmail.com");
		password_field.sendKeys("Fazlay1122");
		Confrim_password_field.sendKeys("Fazlay1122");
		
		
		WebElement signup_button = driver.findElement(By.xpath("//form[@class='Form_form__jRBFR']"));
		signup_button.click();
		
		
	}
	
	
	
	@Test
	public void login() throws InterruptedException {
		driver.get("https://exchange-tradex.nftarttoken.xyz/login");
		WebElement Email_field = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password_field = driver.findElement(By.xpath("//input[@id='password']"));
		
		Email_field.sendKeys("fazlayrabby1996@gmail.com");
		password_field.sendKeys("Fazlay1122");
		
		
		WebElement login_button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		Thread.sleep(6000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",login_button);
		
		Thread.sleep(6000);
		
	}
	
	@Test
	public void Logout() throws InterruptedException {
		driver.get("https://exchange-tradex.nftarttoken.xyz/login");
		WebElement Email_field = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password_field = driver.findElement(By.xpath("//input[@id='password']"));
		
		Email_field.sendKeys("fazlayrabby1996@gmail.com");
		password_field.sendKeys("Fazlay1122");
		
		
		WebElement login_button = driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]"));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",login_button);
		Thread.sleep(6000);
		
		WebElement dashboard = driver.findElement(By.xpath("//img[@alt='User Avatar']"));
		dashboard.click();
		Thread.sleep(6000);
		
		WebElement logout = driver.findElement(By.xpath("//div[contains(text(),'Log Out')]"));
		logout.click();
		Thread.sleep(6000);
		
		
	}

	@Test
	public void Forgot_Password() throws InterruptedException {
		driver.get("https://exchange-tradex.nftarttoken.xyz/login");
		WebElement Forgot_password = driver.findElement(By.xpath("//button[normalize-space()='Forgot password?']"));
		Thread.sleep(6000);
		Forgot_password.click();
		Thread.sleep(6000);
		
		WebElement confirmElement = driver.findElement(By.xpath("//button[normalize-space()='Confirm']"));
		confirmElement.click();
		Thread.sleep(6000);
		
		WebElement Email_field = driver.findElement(By.xpath("//input[@id='email']"));
		
		
		Email_field.sendKeys("fazlayrabby1996@gmail.com");
		Thread.sleep(6000);
		
		
		
		WebElement continue_button = driver.findElement(By.xpath("//button[normalize-space()='Continue']"));
		continue_button.click();
		Thread.sleep(6000);
		
		WebElement VERFIICATION_CODE = driver.findElement(By.xpath("//input[@placeholder='Code Here..']"));
		WebElement NEW_PASSWORD = driver.findElement(By.xpath("//input[@placeholder='New Password']"));
		WebElement CONFIRM_PASSWORD = driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
		
		VERFIICATION_CODE.sendKeys("829299");
		NEW_PASSWORD.sendKeys("Razlay1122");
		CONFIRM_PASSWORD.sendKeys("Razlay1122");
		Thread.sleep(6000);
		
		
		
		WebElement Continue_button = driver.findElement(By.xpath("//button[@type='submit']"));
		Continue_button.click();
		
		
	}
	@Test
	public void Reset_Password() throws InterruptedException {
		driver.get("https://exchange-tradex.nftarttoken.xyz/forgot-password?step=2");
		
		WebElement VERFIICATION_CODE = driver.findElement(By.xpath("//input[@placeholder='Code Here..']"));
		WebElement NEW_PASSWORD = driver.findElement(By.xpath("//input[@placeholder='New Password']"));
		WebElement CONFIRM_PASSWORD = driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
		
		VERFIICATION_CODE.sendKeys("829299");
		NEW_PASSWORD.sendKeys("Razlay1122");
		CONFIRM_PASSWORD.sendKeys("Razlay1122");
		Thread.sleep(6000);
		
		
		
		WebElement Continue_button = driver.findElement(By.xpath("//button[@type='submit']"));
		Continue_button.click();
		
	}
	
	
	@Test
	public void TwoFA_Security_Method () throws InterruptedException {
		driver.get("https://exchange-tradex.nftarttoken.xyz/login");
		WebElement Email_field = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password_field = driver.findElement(By.xpath("//input[@id='password']"));
		
		Email_field.sendKeys("fazlayrabby1996@gmail.com");
		password_field.sendKeys("Fazlay1122");
		
		
		WebElement login_button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		Thread.sleep(6000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",login_button);
		Thread.sleep(10000);
		
		WebElement get_code = driver.findElement(By.xpath("//button[@type='button']"));
		get_code.click();
		Thread.sleep(10000);
		
		
		WebElement enter_code = driver.findElement(By.xpath("//input[@placeholder='Enter Code..']"));
		enter_code.sendKeys("346512");
		
		WebElement verify_code = driver.findElement(By.xpath("//button[@type='submit']"));
		verify_code.click();
		
		Thread.sleep(10000);
		
	}
	
	
	

	@Test
	public void twoFA_Security_Method_Unavailable() throws InterruptedException {
		driver.get("https://exchange-tradex.nftarttoken.xyz/login");
		WebElement Email_field = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password_field = driver.findElement(By.xpath("//input[@id='password']"));
		
		Email_field.sendKeys("frabbif96@gmail.com");
		password_field.sendKeys("Fazlay1122");
		
		
		WebElement login_button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		Thread.sleep(6000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",login_button);
		Thread.sleep(10000);
		
		
		
		WebElement security = driver.findElement(By.xpath("//div[@class='Profile_sidebar__ODMY2']//a[2]"));
		security.click();
		Thread.sleep(10000);
		
		WebElement login2fa = driver.findElement(By.xpath("//div[@class='MyAccount_component_sectionWrapper__yZdSK']//div[4]//div[2]//button[1]"));
		login2fa.click();
		
		WebElement Security_Method_Unavailable = driver.findElement(By.xpath("//a[normalize-space()='Security method unavailable?']"));
		Security_Method_Unavailable.click();
		
		WebElement Click = driver.findElement(By.xpath("//span[@class='Checkbox_tick__UL5OD']"));
		Click.click();
		Thread.sleep(10000);
		
		WebElement Continue = driver.findElement(By.xpath("//button[@type='submit']"));
		Continue.click();
		Thread.sleep(10000);
		
		WebElement New_Email = driver.findElement(By.xpath("//input[@id='email']"));
		New_Email.sendKeys("frabbi@gmail.com");
		
		WebElement reset = driver.findElement(By.xpath("//button[@type='submit']"));
		reset.click();
		
		
	}

	
	
	
	@Test
	public void Security_Settings() throws InterruptedException {
		driver.get("https://exchange-tradex.nftarttoken.xyz/login");
		WebElement Email_field = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password_field = driver.findElement(By.xpath("//input[@id='password']"));
		
		Email_field.sendKeys("frabbif96@gmail.com");
		password_field.sendKeys("Fazlay1122");
		
		
		WebElement login_button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		Thread.sleep(6000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",login_button);
		Thread.sleep(10000);
		
		
		
		WebElement security = driver.findElement(By.xpath("//div[@class='Profile_sidebar__ODMY2']//a[2]"));
		security.click();
		Thread.sleep(10000);
		
		WebElement Anti_Phishing_Code = driver.findElement(By.xpath("//button[@class='button-small button-stroke px-4'][normalize-space()='Create']"));
		Anti_Phishing_Code.click();
		Thread.sleep(50000);
		WebElement enter_new_code = driver.findElement(By.xpath("//input[@placeholder='Enter new code']"));
		enter_new_code.sendKeys("346512");
		WebElement get_code = driver.findElement(By.xpath("//button[normalize-space()='Get Code']"));
		get_code.click();
		WebElement enter_gmail_code = driver.findElement(By.xpath("//input[@placeholder='Enter new code']"));
		enter_gmail_code.sendKeys("346512");
		WebElement continuee = driver.findElement(By.xpath("//button[@type='submit']"));
		continuee.click();
		Thread.sleep(10000);
		
		WebElement Device_Verification = driver.findElement(By.xpath("//div[@class='MyAccount_component_sectionWrapper__yZdSK']//div[4]//div[2]//button[1]"));
		Device_Verification.click();
		WebElement get_Verrification_code = driver.findElement(By.xpath("//button[normalize-space()='Get Code']"));
		get_Verrification_code.click();
		WebElement enter_gmail_vcode = driver.findElement(By.xpath("//input[@placeholder='Enter Code..']"));
		enter_gmail_vcode.sendKeys("346512");
		WebElement Continuee = driver.findElement(By.xpath("//button[@type='submit']"));
		Continuee.click();
		Thread.sleep(10000);
		
		
		WebElement login_twofa = driver.findElement(By.xpath("//div[@class='MyAccount_component_sectionWrapper__yZdSK']//div[4]//div[2]//button[1]"));
		login_twofa.click();
		WebElement get_V_code = driver.findElement(By.xpath("//button[normalize-space()='Get Code']"));
		get_V_code.click();
		WebElement enter_gm_code = driver.findElement(By.xpath("//input[@placeholder='Enter Code..']"));
		enter_gm_code.sendKeys("346512");
		WebElement Contin = driver.findElement(By.xpath("//button[@type='submit']"));
		Contin.click();
		Thread.sleep(10000);
		
		
		WebElement security_qus = driver.findElement(By.xpath("//button[@class='button-small button-stroke'][normalize-space()='Create']"));
		security_qus.click();
		WebElement qus_add = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
		qus_add.click();
		Thread.sleep(5000);
		WebElement qus = driver.findElement(By.xpath("//div[@class='custom-select__input-container css-ackcql']"));
		qus.click();
		WebElement sele = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M4.516 7.5')]"));
		sele.click();
		WebElement ans = driver.findElement(By.xpath("//input[@id='answer_key0']"));
		ans.sendKeys("runu");
		WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
		save.click();
		
	}

}
