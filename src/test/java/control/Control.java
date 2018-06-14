package control;

import browserManager.Browser;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Control {
    public By locator;
    public WebElement myControl;

    public Control(){

    }

    public void findControl(){

        WebDriverWait wait = new WebDriverWait(Browser.getInstance().driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.locator));
        wait.until(ExpectedConditions.elementToBeClickable(this.locator));
        this.myControl = Browser.getInstance().driver.findElement(this.locator);

    }

    public Boolean isDisplayed(){
        try {
            Browser.getInstance().driver.findElement(locator).isDisplayed();
            return true;
        } catch (Exception e){
            return  false;
        }
    }

    public String getTextValue(){
        this.findControl();
        return myControl.getText();
    }

    public String getTextValue(String attribute){
        this.findControl();
        return myControl.getAttribute(attribute);
    }

    public void click(){
        findControl();
        myControl.click();
    }

    public void set(String value){
        findControl();
        myControl.sendKeys(value);
    }
}
