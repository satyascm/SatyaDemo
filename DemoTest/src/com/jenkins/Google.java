package com.jenkins;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

 
public class&amp;nbsp; internetExplorer_Driver 
{

public void ieDriver() throws InterruptedException {
 
//set system property, so that we can access IE driver
System.setProperty("webdriver.ie.driver","E\\IEDriverServer.exe");


//set desiredcapabilites for calling ie driver
DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
capabilities.setCapability (InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
WebDriver driver = new InternetExplorerDriver(capabilities);
driver.get("https://www.google.com");
Thread.sleep(5000);
String title_Of_Page = driver.getTitle();

System.out.println(title_Of_Page);
}
}
