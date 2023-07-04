package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {
 private   FirefoxDriver driver;

    public NavigationHelper(FirefoxDriver driver) {
        this.driver = driver;
    }

    public void goToGroupPage() {
      driver.findElement(By.linkText("groups")).click();
    }
}
