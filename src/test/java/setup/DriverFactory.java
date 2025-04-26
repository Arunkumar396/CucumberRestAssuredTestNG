package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.ElementUtil;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {

    public WebDriver driver;

    // ThreadLocal for WebDriver
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    /**
     * This method is used to initialize the thread-local driver based on the given
     * browser and its view type (mobile/web).
     * 
     * @param browser     - The name of the browser (chrome, firefox, safari).
     * @param browserview - The view type, either "mobileview" or "web".
     * @return WebDriver instance for the selected browser.
     */
    public WebDriver init_driver(String browser, String browserview) {
        System.out.println("Initializing browser: " + browser + " with view: " + browserview);

        switch (browser.toLowerCase()) {
            case "chrome":
                initializeChromeDriver(browserview);
                break;
            case "firefox":
                initializeFirefoxDriver();
                break;
            case "safari":
                initializeSafariDriver();
                break;
            default:
                System.out.println("Invalid browser type provided: " + browser);
                break;
        }

        // Common setup for all browsers
        WebDriver driver = getDriver();
        driver.manage().deleteAllCookies();
        driver.get(ElementUtil.getProperty("URL"));
        driver.manage().window().maximize();  // Might be overridden for mobile view

        return driver;
    }

    /**
     * Initializes Chrome driver with options for web or mobile view.
     * @param browserview - View type: "mobileview" or "web".
     */
    private void initializeChromeDriver(String browserview) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        // Set Chrome to headless mode for CI environments
        options.addArguments("--headless");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("disable-gpu");

        // Set unique user data directory to avoid conflicts
        String userDataDir = "/tmp/chrome-user-data/" + System.currentTimeMillis(); // Use temp directory for CI
        options.addArguments("user-data-dir=" + userDataDir);  // Unique user data directory

        if (browserview.equalsIgnoreCase("mobileview")) {
            setMobileEmulation(options);
        }

        tlDriver.set(new ChromeDriver(options));
    }

    /**
     * Sets up ChromeOptions for mobile emulation.
     * @param options - ChromeOptions to set the mobile emulation.
     */
    private void setMobileEmulation(ChromeOptions options) {
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "iPad Air");  // Change device as needed
        options.setExperimentalOption("mobileEmulation", mobileEmulation);
    }

    /**
     * Initializes Firefox driver with basic options.
     */
    private void initializeFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        // Add Firefox-specific options here if necessary
        tlDriver.set(new FirefoxDriver(options));
    }

    /**
     * Initializes Safari driver.
     */
    private void initializeSafariDriver() {
        tlDriver.set(new SafariDriver());
    }

    /**
     * This is used to get the driver with ThreadLocal.
     * 
     * @return WebDriver instance.
     */
    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }

    /**
     * Properly quit the WebDriver instance at the end of the test.
     */
    public void quitDriver() {
        if (tlDriver.get() != null) {
            tlDriver.get().quit();
        }
    }
}
