import browserManager.Browser;
import factoryBrowser.FactoryBrowser;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Dashboard;
import pages.LeftMenu;
import pages.Login;


public class Example {

    public static Login loginPage;
    public static Dashboard dashboardPage;
    public static LeftMenu leftMenuPage;

    @BeforeClass
    public static void openBrowser(){
        loginPage = new Login();
        dashboardPage = new Dashboard();
        leftMenuPage = new LeftMenu();
    }

    @Test
    public void valid_UserCredential() throws InterruptedException {

        Browser.getInstance().driver.get("https://todo.ly");
        dashboardPage.loginLink.click();
        loginPage.userTextBox.set("kevinviscafe@gmail.com");
        loginPage.passwordTextBox.set("Kevinsanex94");
        loginPage.loginButton.click();
        //leftMenuPage.addProjectLink.click();
       // leftMenuPage.projectNameTextBox.set("Prueba Automatizacion");
       // leftMenuPage.addProjectButton.click();

        //Verifications
        Assert.assertTrue("ERROR no se pudo ingresar al sistema", leftMenuPage.logoutLink.isDisplayed());
        Assert.assertEquals("ERROR el texto no es igual","Logout", leftMenuPage.logoutLink.getTextValue());
        Thread.sleep(4000);
    }


    @AfterClass
    public static void closeBrowser(){
        Browser.getInstance().closeBrowser();
    }
}