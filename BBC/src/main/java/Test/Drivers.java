package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
protected static WebDriver driver;
private boolean acceptNextAlert = true;
protected StringBuffer verificationErrors = new StringBuffer();

protected WebDriver getDriver() {
	if (driver == null) {
		
		driver = new FirefoxDriver();
	}
	return driver;
}

protected void resetDriver() {
	driver = null;
}

protected String closeAlertAndGetItsText() {
  try {
    Alert alert = driver.switchTo().alert();
    String alertText = alert.getText();
    if (acceptNextAlert) {
      alert.accept();
    } else {
      alert.dismiss();
    }
    return alertText;
  } finally {
    acceptNextAlert = true;
  }
}
}
