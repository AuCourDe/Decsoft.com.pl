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

    String dataToAssert = "Ups... Coś poszło nie tak.";

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
        mainPage.goToRandomCertyficateAndConcesion();//to samo
        mainPage.goToPartners();
        mainPage.goToBasicInformation();
        mainPage.goToProfile();
        mainPage.goToCeryficates();//to samo
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
        customers.goToBanking();
        customers.goToHighAvailbility();
        customers.goToHealthCare();
        customers.goToCustomersWithItServices();
        customers.goToIndustry();
        customers.goToSensitiveData();
        topMenu.goToCookies();
        topMenu.goToNews();
        topMenu.goToShareholding();
        topMenu.goToContact();
        System.out.println(contact.getErrorMessage());
        Assert.assertEquals(contact.getErrorMessage(), dataToAssert);
    }
}
