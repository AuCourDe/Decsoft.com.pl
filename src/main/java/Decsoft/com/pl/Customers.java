package Decsoft.com.pl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customers extends BasePage{
    public Customers(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,'dropDownInner')]//a[normalize-space()='Sektor publiczny']")
    private WebElement publicSectorBtn;

    public void goToPublicSector(){
        click(publicSectorBtn);
    }

    @FindBy(xpath = "//div[contains(@class,'branze_submenu')]//div//a[normalize-space()='Ochrona zdrowia']")
    private WebElement healthCareBtn;

    public void goToHealthCare(){
        click(healthCareBtn);
    }

    @FindBy(xpath = "//div[contains(@class,'branze_submenu')]//div//a[contains(text(),'Przemysł')]")
    private WebElement industryBtn;

    public void goToIndustry(){
        click(industryBtn);
    }

    @FindBy(xpath = "//div[contains(@class,'branze_submenu')]//div//a[contains(text(),'Bankowość i ubezpieczenia')]")
    private WebElement bankingBtn;

    public void goToBanking(){
        click(bankingBtn);
    }

    @FindBy(xpath = "//div[contains(@class,'branze_submenu')]//div//a[contains(text(),'Klienci świadczący usługi z wykorzystaniem IT')]")
    private WebElement custumersWithItServicesBtn;

    public void goToCustomersWithItServices(){
        click(custumersWithItServicesBtn);
    }

    @FindBy(xpath = "//div[contains(@class,'branze_submenu')]//div//a[contains(text(),'Klienci przetwarzający dane wrażliwe')]")
    private WebElement sensitviveDataBtn;

    public void goToSensitiveData(){
        click(sensitviveDataBtn);
    }

    @FindBy(xpath = "//div[contains(@class,'branze_submenu')]//div//a[contains(text(),'Klienci rozwiązań wysokiej dostępności')]")
    private WebElement highAvailbilityBtn;

    public void goToHighAvailbility(){
        click(highAvailbilityBtn);
    }

}
