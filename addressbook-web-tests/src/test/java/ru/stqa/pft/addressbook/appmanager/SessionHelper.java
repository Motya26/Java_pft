package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase {
    public SessionHelper(FirefoxDriver driver) {
        super(driver);
    }
    public void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"), password);
        getClick (By.xpath("//input[@value='Login']"));
    }
}
