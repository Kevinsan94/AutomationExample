package factoryBrowser;

public class FactoryBrowser {

    public static final String  CHROME = "chrome";
    public static final String  FIREFOX = "firefox";
    public static final String  IE = "ie";
    public static final String  SAFARI = "safari";

    /**
     *
     * @param typeBrowser
     * @return
     */
    public static IBrowser crear(String typeBrowser){

        IBrowser ibrowser;

        switch (typeBrowser) {

            case CHROME:
                ibrowser = new Chrome();
                break;
            case FIREFOX:
                ibrowser = new Firefox();
                break;
            case IE:
                ibrowser = new InternetExplorer();
                break;
            case SAFARI:
                ibrowser = new Safari();
                break;
            default:
                ibrowser = new Chrome();
                break;
        }
        return ibrowser;
    }
}
