import browserManager.Browser;
import factoryBrowser.FactoryBrowser;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Example {

    @BeforeClass
    public static void openBrowser(){

    }

    @Test
    public void valid_UserCredential() throws InterruptedException {

        Browser.getInstance().driver.get("https://www.google.com");

        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).clear();
        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("Todo.ly");
        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).click();
        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a")).click();
        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img")).click();
        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]")).clear();
        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]")).sendKeys("kevinviscafe@gmail.com");
        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]")).clear();
        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]")).sendKeys("Kevinsanex94");
        Browser.getInstance().driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]")).click();

        Thread.sleep(4000);
    }


    @AfterClass
    public static void closeBrowser(){
        Browser.getInstance().closeBrowser();
    }
}