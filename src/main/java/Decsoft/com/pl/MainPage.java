package Decsoft.com.pl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='animatingLogo']")
    private WebElement goToMainPageBtn;

    @FindBy(xpath = "//td[@class='bl br bt one b1']//div[@class='buttonBrighten resizeAnimation']")
    private WebElement goToSystemBtn;

    @FindBy(xpath = "//td[@class='bl br bt one b2']//div[@class='buttonBrighten resizeAnimation']")
    private WebElement goToInformationBtn;

    @FindBy(xpath = "//td[@class='bl br bt one b3']//div[@class='buttonBrighten resizeAnimation']")
    private WebElement goToServicesBtn;

    @FindBy(xpath = "//td[@class='bl br one b4']//div[@class='buttonBrighten resizeAnimation']")
    private WebElement goToCloudBtn;

    @FindBy(xpath = "//td[@class='bl br one b5']//div[@class='buttonBrighten resizeAnimation']")
    private WebElement goToVirtualizationBtn;

    @FindBy(xpath = "//td[@class='bl br one b6']//div[@class='buttonBrighten resizeAnimation']")
    private WebElement goToSecurityBtn;

    @FindBy(xpath = "//div[@id='Koncesje']")
    private List<WebElement> goToCertyficatesAndConcesionsBtn;

    @FindBy(xpath = "//a[contains(@class,'first')]")
    private  WebElement goToPartnersBtn;

    @FindBy(xpath = "//div[contains(@class,'ofirmie_menu')]//a[normalize-space()='Podstawowe informacje']")
    private WebElement goToBasicInfromationBtn;

    @FindBy(xpath = "//div[contains(@class,'ofirmie_menu')]//a[contains(text(),'Profil działalności')]")
    private WebElement goToProfileBtn;

    @FindBy(xpath = "//div[@class='ofirmie_menu ']//a[normalize-space()='Certyfikaty i koncesje']")
    private WebElement goToCertyficatesBtn;

    @FindBy(xpath = "//div[@class='ofirmie_menu ']//a[normalize-space()='Referencje']")
    private WebElement goToReferencesBtn;

    @FindBy(xpath = "//div[contains(@class,'ofirmie_menu')]//a[normalize-space()='Praca']")// moze lepiej lista gdyby zmienial sie jezyk?
    private WebElement goToJobBtn;

    public void goToMainPage(){
        click(goToMainPageBtn);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='animatingLogo']")));
    }

    public void goToSystem() {
        click(goToSystemBtn);
    }

    public void goToInformation() {
        click(goToInformationBtn);
    }

    public void goToServices() {
        click(goToServicesBtn);
    }

    public void goToCloud() {
        click(goToCloudBtn);
    }

    public void goToVirtualization() {
        click(goToVirtualizationBtn);
    }

    public void goToSecurity() {
        click(goToSecurityBtn);
    }

    public void goToRandomCertyficateAndConcesion() {
        WebElement randomCertyficate = getRandomElement(goToCertyficatesAndConcesionsBtn);
        click(randomCertyficate);
    }

    public void goToPartners(){
        click(goToPartnersBtn);
    }

    public void goToBasicInformation() {
        click(goToBasicInfromationBtn);
    }

    public void goToProfile() {
        click(goToProfileBtn);
    }

    public void goToCeryficates() {
        click(goToCertyficatesBtn);
    }
    public void goToReferences() {
        click(goToReferencesBtn);
    }

    public void goToJob() {
        click(goToJobBtn);
    }
}
