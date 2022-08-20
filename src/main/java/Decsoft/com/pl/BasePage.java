package Decsoft.com.pl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;


public class BasePage {

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebDriver driver;
    public Actions actions;
    public WebDriverWait wait;

    //mini raport z testow, moge skopiowac i dac np do testu manualnego do weryfikacji
    //nie jest wymagany, pomaga
    public void click(WebElement element) {
        System.out.println("Klikam w element: " + element.getText());
        element.click();
    }

    //mini raport z testow, moge skopiowac i dac np do testu manualnego do weryfikacji
    //mozliwe do wykasowania
    public void sendKeys(WebElement element, String text) {
        System.out.println("Wpisuje tekst: " + text);
        element.sendKeys(text);
    }

    public WebElement getRandomElement(List<WebElement> elements){
        Random random = new Random();
        int randomNumber = random.nextInt(elements.size());
        return elements.get(randomNumber);
    }
}