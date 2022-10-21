package drivers;

import drivers.ChromeDriver;
import drivers.FirefoxDriver;

public class InterfaceChecker {
    public static void main(String[] args) throws NoValidBrowserName {
        WebDriver driver = getDriver("firefox");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

        //System.out.println();

//        FirefoxDriver firefox = new FirefoxDriver();
//        firefox.get();
//        chrome.findElementBy();
//        chrome.findElementBy();
//        chrome.findElementBy();
//        chrome.findElementBy();
//        chrome.findElementBy();

    }

    private static WebDriver getDriver(String name)  {
        if(name.equals("chrome")){
            return new ChromeDriver();
        }else if(name.equals("firefox")){
            return new FirefoxDriver();
        }
        try {
            throw new NoValidBrowserName("No valid browser name!");
        } catch (NoValidBrowserName e) {
            throw new RuntimeException(e);
        }

    }
}
