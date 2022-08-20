package Decsoft.com.pl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact extends BasePage {
    public Contact(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='gm-err-title']")
    private WebElement mesageErr;


    public String getErrorMessage(){
        return mesageErr.getText();
    }
}
