package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyBlueBackgroundPage {
	
	WebDriver driver;
	
	public SkyBlueBackgroundPage()
	{
		this.driver = driver;
	}
	
	//Element 
	@FindBy(how = How.XPATH,using = "//button[text() = 'Set SkyBlue Background']")
	WebElement skyBlueButton;
	
	@FindBy(how = How.XPATH,using = "//body[@style = 'background-color: skyblue;']")
	WebElement skyBlueColorValidation;
	
	@FindBy(how = How.XPATH,using = "//button[text() = 'Set White Background']")
	WebElement WhiteButton;
	
	@FindBy(how = How.XPATH,using = "//body[@style = 'background-color: white;']")
	WebElement whiteColorValidation;
	
	
	public String skyBlueButton()
	{
		String actualSkyButton = skyBlueButton.getText();
		return actualSkyButton;
	}

	public void clickSkyBlueButton()
	{
		skyBlueButton.click();
	}
	
	public String colorValidation()
	{
		String actualColor = skyBlueColorValidation.getCssValue("background-color");
		return actualColor;
		
	}
	
	public String whiteButton()
	{
		String actual = WhiteButton.getText();
		return actual;
	}

	public void clickWhiteButton()
	{
		WhiteButton.click();
	}

	public String colorWhiteValidation()
	{
		String actualColor1 = whiteColorValidation.getCssValue("background-color");
		System.out.println("Color code = "+actualColor1);
		return actualColor1;
		
	}
}
