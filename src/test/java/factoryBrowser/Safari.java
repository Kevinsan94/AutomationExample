package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari implements IBrowser {
    @Override
    public WebDriver create() {
        return  new SafariDriver();
    }
}
