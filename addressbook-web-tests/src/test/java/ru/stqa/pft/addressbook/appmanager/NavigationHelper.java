package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase  {
    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void goToGroupPage() {
     getClick(By.linkText("groups"));
    }
}
