package androids;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Samsungs {

	public static void main(String[] args) throws MalformedURLException {
		AppiumDriver<MobileElement> driver;
		DesiredCapabilities des = new DesiredCapabilities();
		des.setCapability(MobileCapabilityType.DEVICE_NAME, "RZCT3148FRV");
		des.setCapability(MobileCapabilityType.UDID, "RZCT3148FRV");
		des.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		des.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
//		des.setCapability(MobileCapabilityType.APP,
//				"C:\\Users\\Chgha\\Downloads\\mindspark_student_stglearn_4.25_build_19.apk");
		des.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		des.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.mindspark.edicine.MainActivity");
		des.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.mindspark.edicine");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), des);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@id='CustomTextInputLoginInput']")).sendKeys("hello");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.id("CustomTextInputLoginInput")).sendKeys("hello!");
	}
}
