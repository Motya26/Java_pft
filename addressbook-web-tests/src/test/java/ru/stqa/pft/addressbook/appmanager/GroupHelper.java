package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {
    public GroupHelper(WebDriver driver) {
        super(driver);
    }
    public void returnToGroupPage() {
        getClick(By.linkText("group page"));
    }
    public void submitGroupCreation() {
      getClick(By.name("submit"));
    }
    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.name());
        type(By.name("group_header"), groupData.header());
        type(By.name("group_footer"), groupData.footer());
    }

    public void initGroupCreation() {
        getClick(By.name("new"));
    }

    public void deleteSelectedGroups() {
        getClick(By.name("delete"));
    }

    public void selectGroup() {
        getClick(By.name("selected[]"));
    }

    public void initGroupModification() {
        getClick(By.name("edit"));
    }

    public void submitGroupModification() {
        getClick(By.name("update"));
    }
}
