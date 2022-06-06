package backEnd.pages;

import backEnd.Utiliteis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(linkText = "Careers")
    public WebElement Careers;

    @FindBy(linkText = "Meet our teams")
    public  WebElement ourTeam;

    @FindBy(xpath = "//h1")
    public WebElement Header;







    public void ourTeamPage(){
        Careers.click();
        ourTeam.click();



    }
}
