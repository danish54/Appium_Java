package com.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Phone {
	@Test
	public static void Appinfo2() throws MalformedURLException, InterruptedException {

		DesiredCapabilities Cap = new DesiredCapabilities();
		Cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		Cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		Cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		Cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		//Cap.setCapability(MobileCapabilityType.TIMEOUTS, "500000");
		
		//for dialer app
		Cap.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
		Cap.setCapability("appPackage", "com.google.android.dialer");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), Cap);
		System.out.println("App Started");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"key pad\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"8,TUV\"]")).click();
		Thread.sleep(2000);
		driver.quit();

	}
}
