package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {
    /* By userId = By.id("mobileNo");
     By password = By.id("et_password");
     By login_Button = By.id("btn_mlogin");
     By existingUser_login = By.id("btn_mlogin");
     public LoginPage invalidLogin() {
         waitForVisibilityOf(existingUser_login);
         driver.findElement(existingUser_login).click();
         driver.findElement(userId).clear();
         driver.findElement(userId).sendKeys("someone@testvagrant.com");
         driver.findElement(password).sendKeys("testvagrant123");
         driver.findElement(login_Button).click();
         Assert.assertTrue(driver.findElement(By.id("pageLevelError")).getText().equalsIgnoreCase("Account does not exist"));
         return new LoginPage(driver);
     }*/
//MiniAppium
    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    public void addContact() {

        WebElement el = driver.findElement(By.name("Add Contact"));
        el.click();
        List<WebElement> textFieldsList = driver
                .findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("Some Name");
        textFieldsList.get(1).sendKeys("10086");
        textFieldsList.get(2).sendKeys("Some@example.com");
        driver.swipe(100, 500, 100, 100, 2);
        driver.findElementByName("Save").click();
    }

    //aiqianjin.yueguangxia:id/applynow_btn
    public void swiptoleft() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement guide = driver.findElementById("aiqianjin.yueguangxia:id/guide_iv");
        swipeToLeft(driver, 1000, 2);
        WebElement textview = driver.findElementById("aiqianjin.yueguangxia:id/guide_inter_rl");
        textview.click();


    }


    public void applyNow() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement apply = driver.findElementById("aiqianjin.yueguangxia:id/applynow_btn");
        apply.click();
        WebElement mobile = driver.findElementById("aiqianjin.yueguangxia:id/mobile_et");
        mobile.sendKeys("17600551874");
        WebElement pwd = driver.findElementById("aiqianjin.yueguangxia:id/pwd_et");
        pwd.sendKeys("1qa2ws");
        WebElement login_btn = driver.findElementById("aiqianjin.yueguangxia:id/login_btn");
        login_btn.click();
        Thread.sleep(3000);


    }


}
