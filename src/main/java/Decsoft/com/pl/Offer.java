package Decsoft.com.pl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Offer extends BasePage{
    public Offer(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Integracja infrastruktury pamięci masowej')]")
    private WebElement massStorageBtn;

    public void goToMassStorage(){
        click(massStorageBtn);
    }

    @FindBy(xpath = "//div[@class='linki avenir']//a[normalize-space()='Integracja infrastruktury sieciowej']")
    private WebElement integrationWebInterfaceBtn;

    public void goToIntegrationWebInterface(){
        click(integrationWebInterfaceBtn);
    }

    @FindBy(xpath = "//div[@class='linki avenir']//a[normalize-space()='Integracja infrastruktury backup']")
    private WebElement backupInerfaceBtn;

    public void goToBackupInterface(){
        click(backupInerfaceBtn);
    }



    @FindBy(xpath = "//div[contains(@class,'drop_down_item')]//a[contains(text(),'Audyty bezpieczeństwa')]")
    private WebElement secuirityAuditsBtn;

    public void goToSecurityAudits(){
        click(secuirityAuditsBtn);
    }

    @FindBy(xpath = "//div[contains(@class,'linki avenir')]//a[contains(text(),'Budowa systemów i mechanizmów bezpieczeństwa infor')]")
    private WebElement systemBuildsAndSecuritySystemsBtn;

    public void goToSystemBuildAndSecuritysystems(){
        click(systemBuildsAndSecuritySystemsBtn);
    }

    @FindBy(xpath = "//div[contains(@class,'linki avenir')]//a[normalize-space()='Analiza ryzyka']")
    private WebElement riskAnalysisBtn;

    public void goToRiskAnalysis(){
        click(riskAnalysisBtn);
    }

    @FindBy(xpath = "//div[@class='linki avenir']//a[normalize-space()='Ochrona danych i systemów']")
    private WebElement dataProtectBtn;

    public void goToDataProtect(){
        click(dataProtectBtn);
    }

    @FindBy(xpath = "//div[@class='drop_down_item']//a[contains(text(),'Architektura usług - SOA')]")
    private WebElement SoaArchitectureBtn;

    public void goToSoaArchitecture(){
        click(SoaArchitectureBtn);
    }

    @FindBy(xpath = "//div[contains(@class,'linki avenir')]//a[normalize-space()='Bazy Danych ORACLE']")
    private WebElement oracleDataBaseBtn;

    public void goToOracleDataBase(){
        click(oracleDataBaseBtn);
    }

    @FindBy(xpath = "//div[contains(@class,'linki avenir')]//a[normalize-space()='Data Power - Platforma integracyjna']")
    private WebElement dataPowerBtn;

    public void goToDataPower(){
        click(dataPowerBtn);
    }

    @FindBy(xpath = "//div[contains(@class,'linki avenir')]//a[contains(text(),'Tworzenie rozwiązań dedykowanych')]")
    private WebElement dedicatedSolutionsBtn;

    public void goToDedicatedSolutions(){
        click(dedicatedSolutionsBtn);
    }

    @FindBy(xpath = "//div[@class='drop_down_item']//a[normalize-space()='Cloud computing']")
    private WebElement cloudComputingBtn;

    public void goToCloudComputing(){
        click(cloudComputingBtn);
    }

    @FindBy(xpath = "//div[@class='linki avenir']//a[normalize-space()='Standaryzacja i automatyzacja']")
    private WebElement standardizationAndAutomationBtn;

    public void goToStandardizationAndAutomation(){
        click(standardizationAndAutomationBtn);
    }

    @FindBy(xpath = "//div[@class='linki avenir']//a[contains(text(),'Zarządzanie usługami informatycznymi')]")
    private WebElement servicesManagmementBtn;

    public void goToServicesManagement(){
        click(servicesManagmementBtn);
    }

    @FindBy(xpath = "//div[@class='linki avenir']//a[contains(text(),'Monitorowanie usług i środowiska IT')]")
    private WebElement monitoringOfServiecesAndEnvironmentBtn;

    public void goToMonitoringOfServicesAndEnvironment(){
        click(monitoringOfServiecesAndEnvironmentBtn);
    }

    @FindBy(xpath = "//div[@class='drop_down_item']//a[normalize-space()='Wirtualizacja zasobów']")
    private WebElement virtualizationBtn;

    public void goToVirtualization(){
        click(virtualizationBtn);
    }

    @FindBy(xpath = "//div[@class='linki avenir']//a[normalize-space()='Wirtualizacja stacji roboczych']")
    private WebElement virtualizationOfWorkStationBtn;

    public void goToVirtualizationOfWorkStation(){
        click(virtualizationOfWorkStationBtn);
    }

    @FindBy(xpath = "//div[@class='linki avenir']//a[normalize-space()='Wirtualizacja aplikacji']")
    private WebElement virtualizationOfAplicationBtn;

    public void goToVirtualizationOfAplication(){
        click(virtualizationOfAplicationBtn);
    }

    @FindBy(xpath = "//div[@class='linki avenir']//a[contains(text(),'Wirtualizacja pamięci masowej')]")
    private WebElement virtualizationOfMassStorageBtn;

    public void goToVirtualizationOfMassStorage(){
        click(virtualizationOfMassStorageBtn);
    }

    @FindBy(xpath = "//a[contains(text(),'Systemy zarządzania kontami uprzywilejowanymi')]")
    private WebElement sysAccountManagementBtn;

    public void goToSysAccountMangement(){
        click(sysAccountManagementBtn);
    }

    @FindBy(xpath = "//div[contains(@class,'linki avenir')]//a[normalize-space()='Systemy jednokrotnego logowania']")
    private WebElement sysOneTimeLoginBtn;

    public void goToSysOneTimeLogin(){
        click(sysOneTimeLoginBtn);
    }

    @FindBy(xpath = "//div[contains(@class,'linki avenir')]//a[contains(text(),'Systemy zarządzania tożsamością')]")
    private WebElement sysIdentityManagementBtn;

    public void goToSysIdentityManagement(){
        click(sysIdentityManagementBtn);
    }

    @FindBy(xpath = "//div[contains(@class,'linki avenir')]//a[normalize-space()='Systemy klasy SIEM']")
    private WebElement sysSiemBtn;

    public void goToSysSiem(){
        click(sysSiemBtn);
    }






}
