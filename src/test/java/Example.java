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
        leftMenuPage.addProjectLink.click();
        leftMenuPage.projectNameTextBox.set("Prueba Automatizacion");
        leftMenuPage.addProjectButton.click();






//        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).clear();
//        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("todo.ly");
//        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
//        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).clear();
//        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("123456789Kevins1");
//        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
//        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\":ir\"]/div/div")).click();
//        Browser.getInstance().driver.findElement(By.xpath("<textarea rows=\"1\" id=\":li\" class=\"vO\" name=\"to\" spellcheck=\"false\" autocomplete=\"false\" autocapitalize=\"off\" autocorrect=\"off\" tabindex=\"1\" dir=\"ltr\" aria-label=\"To\" role=\"combobox\" aria-autocomplete=\"list\" style=\"width: 393px;\"></textarea>")).sendKeys("enrique.bayron.paz@gmail.com");
//        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\":m0\"]")).sendKeys("Prueba");
//        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\":kv\"]")).sendKeys("Prueba");
//        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\":ma\"]")).click();
//        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]")).sendKeys("Kevinsanex94");
//        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]")).click();

        Thread.sleep(4000);
    }


    @AfterClass
    public static void closeBrowser(){
        Browser.getInstance().closeBrowser();
    }
}