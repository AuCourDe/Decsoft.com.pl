import Decsoft.com.pl.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Collections;

public class LinksTest extends TestBase {
    AboutCompany aboutCompany;
    Contact contact;
    Cookies cookies;
    Customers customers;
    MainPage mainPage;
    News news;
    Offer offer;
    Shareholding shareholding;
    TopMenu topMenu;

    String dataToAssert = "www.decsoft.com.pl -> 'Kontakt' -> tu powinna być mapka";

    @BeforeMethod
    public void testSetUp() {
        aboutCompany = new AboutCompany(driver);
        contact = new Contact(driver);
        cookies = new Cookies(driver);
        customers = new Customers(driver);
        mainPage = new MainPage(driver);
        news = new News(driver);
        offer = new Offer(driver);
        shareholding = new Shareholding(driver);
        topMenu = new TopMenu(driver);

    }

    @Test
    public void ifLinksWorks()  {
        mainPage.goToInformation();
        mainPage.goToSystem();
        mainPage.goToCloud();
        mainPage.goToVirtualization();
        mainPage.goToSecurity();
        mainPage.goToRandomCertyficateAndConcesion();//the same website
        mainPage.goToPartners();
        mainPage.goToBasicInformation();
        mainPage.goToProfile();
        mainPage.goToCeryficates();//the same website
        mainPage.goToReferences();
        mainPage.goToJob();
        topMenu.goToOffer();
        offer.goToMassStorage();
        offer.goToIntegrationWebInterface();
        offer.goToBackupInterface();
        topMenu.goToOffer();
        offer.goToSecurityAudits();
        offer.goToSystemBuildAndSecuritysystems();
        offer.goToRiskAnalysis();
        offer.goToDataProtect();
        topMenu.goToOffer();
        offer.goToSoaArchitecture();
        offer.goToOracleDataBase();
        offer.goToDataPower();
        offer.goToDedicatedSolutions();
        topMenu.goToOffer();
        offer.goToCloudComputing();
        offer.goToStandardizationAndAutomation();
        offer.goToServicesManagement();
        offer.goToMonitoringOfServicesAndEnvironment();
        topMenu.goToOffer();
        offer.goToVirtualization();
        offer.goToVirtualizationOfWorkStation();
        offer.goToVirtualizationOfAplication();
        offer.goToVirtualizationOfMassStorage();
        topMenu.goToOffer();
        offer.goToSysAccountMangement();
        offer.goToSysOneTimeLogin();
        offer.goToSysIdentityManagement();
        offer.goToSysSiem();
        topMenu.goToCutomers();
        customers.goToPublicSector();
        customers.goToHealthCare();
        customers.goToIndustry();
        customers.goToBanking();
        customers.goToCustomersWithItServices();
        customers.goToHighAvailbility();
        customers.goToSensitiveData();
        topMenu.goToCookies();
        topMenu.goToNews();
        topMenu.goToShareholding();
        topMenu.goToContact();
        System.out.println(contact.getValidatorMessage() + " -> na stonie 'Kontakt' nie działa mapka.");
        Assert.assertEquals(contact.getValidatorMessage(), dataToAssert);
    }
}
