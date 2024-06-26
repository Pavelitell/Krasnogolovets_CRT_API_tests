package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInfo extends BasePage {
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span" ) private WebElement yourInfoTitle;
    @FindBy(xpath = "//*[@id=\"first-name\"]") private WebElement firstTextBox;
    @FindBy(xpath = "//*[@id=\"last-name\"]") private WebElement secondTextBox;
    @FindBy(xpath = "//*[@id=\"postal-code\"]") private WebElement postalCodeTextBox;
   @FindBy(xpath = "//*[@id=\"continue\"]") private WebElement continueButton;
   @FindBy(xpath = "//*[@id=\"cancel\"]")private WebElement cancelButton;
   @FindBy(xpath = "//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3/text()") private WebElement yourInfoError;


   public YourInfo (){
       PageFactory.initElements(driver,this);
   }

   public  String getYourInfoTitle(){
       return  yourInfoTitle.getText();
   }
    public  String getYourInfoTitleError(){
        return  yourInfoError.getText();
    }

    public YourInfo addTicket (String firstName,String lastName, String zip){
       firstTextBox.sendKeys(firstName);
       secondTextBox.sendKeys(lastName);
       postalCodeTextBox.sendKeys(zip);
       continueButton.click();
       return this;
    }



}
