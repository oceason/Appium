package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class AndroidSetup {
    protected AndroidDriver driver;

    protected void prepareAndroidForAppium1() throws MalformedURLException {
        //   File classpathRoot = new File(System.getProperty("user.dir"));
//   System.out.println(classpathRoot);
//     File appDir = new File(classpathRoot, "D:/AppiumDemo-master/apps/");
//        File app = new File(appDir, "ContactManager.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "D:/AppiumTestApp/app-shengji-debug.apk");
        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("noReset", true);
        // 8ddd012
        capabilities.setCapability("deviceName", "oppo-oppo_r9sk-8ddd012");
        capabilities.setCapability("platformVersion", "6.0.1");
//        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage",
                "aiqianjin.yueguangxia");
        capabilities.setCapability("appActivity", ".activity.customer.LaunchActivity");
        capabilities.setCapability("unicodeKeyboard", "True");
        capabilities.setCapability("resetKeyboard", "True");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),
                capabilities);
    }
}
