package Login;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Login {

    private AndroidDriver<MobileElement>driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:platformName", "Android");
        desiredCapabilities.setCapability("appium:appPackage", "br.com.payface.teste");
        desiredCapabilities.setCapability("appium:appActivity", "MainActivity");
        desiredCapabilities.setCapability("appium:deviceName", "R9XNA007VME");
        desiredCapabilities.setCapability("appium:platformVersion", "11.0");
        desiredCapabilities.setCapability("appium:automationName", "Uiautomator2");
        desiredCapabilities.setCapability("appium:autoGrantPermissions", "true");
        desiredCapabilities.setCapability("appium:newCommandTimeout", "50000");
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);

    }

    @Test
    public void Login_do_app_user() {
        MobileElement el1 = (MobileElement) driver.findElementById("br.com.payface.teste:id/main_spinner_environment");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[5]");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("br.com.payface.teste:id/start_button");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByXPath("hierarchy//android.view.View");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText");
        el5.sendKeys("09353414989");
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.Button");
        el6.click();

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

