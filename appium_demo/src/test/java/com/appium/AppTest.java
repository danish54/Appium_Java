package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AppTest {

	@Test
	public static void Appinfo1() throws MalformedURLException, InterruptedException {

		DesiredCapabilities Cap = new DesiredCapabilities();
		Cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		Cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		Cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		Cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		Cap.setCapability(MobileCapabilityType.TIMEOUTS, "500000");
		Cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\v-danishali\\Downloads\\apkinfo.apk");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), Cap);
		System.out.println("App Started");
		Thread.sleep(1000);
		driver.quit();

	}

}
