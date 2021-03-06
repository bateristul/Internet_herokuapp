package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private BasePage basePage;
    private HomePage homePage;
    private BrokenImagesPage brokenImagesPage;
    private LoginPage loginPage;
    private SecureAreaPage secureAreaPage;
    private CheckboxPages checkboxPages;
    private AlertsPage alertsPage;
    private FramePage framePage;
    private DropdownPage dropdownPage;

    public PageObjectManager(WebDriver driver){
        basePage = new BasePage(driver);
    }

    public BrokenImagesPage getBrokenImagesPage(){
        return (brokenImagesPage == null) ? brokenImagesPage = new BrokenImagesPage(basePage) : brokenImagesPage;
    }

    public HomePage getHomePage() {

        return (homePage == null) ? homePage = new HomePage(basePage) : homePage;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(basePage) : loginPage;
    }

    public SecureAreaPage getSecureAreaPage() {
        return (secureAreaPage == null) ? secureAreaPage = new SecureAreaPage(basePage) : secureAreaPage;
    }

    public CheckboxPages getCheckboxPages(){
        return (checkboxPages == null) ? checkboxPages = new CheckboxPages(basePage) : checkboxPages;
    }

    public AlertsPage getAlertsPage(){
        return (alertsPage == null) ? alertsPage = new AlertsPage(basePage) : alertsPage;
    }

    public FramePage getIframePage(){
        return (framePage == null) ? framePage = new FramePage(basePage): framePage;
    }

    public DropdownPage getDropdownPage(){
        return (dropdownPage == null) ? dropdownPage = new DropdownPage(basePage): dropdownPage;
    }

}
