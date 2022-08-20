package Decsoft.com.pl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenu extends BasePage{
    public TopMenu(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[normalize-space()='O firmie']")
    private WebElement aboutCompanyBtn;

    public void goToAboutCompany() {
        click(aboutCompanyBtn);
    }

    @FindBy(xpath = "//span[normalize-space()='Oferta']")
    private WebElement offerBtn;

    public void goToOffer() {
        click(offerBtn);
    }

    @FindBy(xpath = "//span[normalize-space()='Klienci']")
    private WebElement customersBtn;

    public void goToCutomers() {
        click(customersBtn);
    }

    @FindBy(xpath = "//span[normalize-space()='Cookies']")
    private WebElement cookiesBtn;

    public void goToCookies() {
        click(cookiesBtn);
    }

    @FindBy(xpath = "//span[contains(text(),'Aktualności')]")
    private WebElement newsBtn;

    public void goToNews() {
        click(newsBtn);
    }

    @FindBy(xpath = "//span[normalize-space()='Akcjonariat']")
    private WebElement shareholdingBtn;

    public void goToShareholding() {
        click(shareholdingBtn);
    }

    @FindBy(xpath = "//span[normalize-space()='Kontakt']")
    private WebElement contactBtn;

    public void goToContact() {
        click(contactBtn);
    }

}
