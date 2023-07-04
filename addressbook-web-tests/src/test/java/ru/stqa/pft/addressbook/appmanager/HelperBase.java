package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperBase {
    protected FirefoxDriver driver;

    public HelperBase(FirefoxDriver driver) {
        this.driver = driver;
    }

    protected void getClick(By locator) {
        driver.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        getClick(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
