package browserManager;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

/**
 *
 */
public class Browser {

    private static Browser ourInstance = new Browser();
    public WebDriver driver;

    /**
     *
     * @return ourInstance
     */
    public static Browser getInstance() {

        if(ourInstance==null){
            ourInstance = new Browser();
        }
        return ourInstance;
    }

    private Browser() {
        driver = FactoryBrowser.crear(FactoryBrowser.CHROME).create();
    }

    public void closeBrowser(){
        driver.quit();
        ourInstance = null;
    }


}
