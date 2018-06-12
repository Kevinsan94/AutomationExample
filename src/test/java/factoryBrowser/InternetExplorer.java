package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer implements IBrowser {

    @Override
    public WebDriver create() {
        return new InternetExplorerDriver();
    }
}
