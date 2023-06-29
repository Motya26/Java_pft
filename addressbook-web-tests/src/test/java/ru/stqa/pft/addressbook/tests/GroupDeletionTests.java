package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests  extends TestBase {



  @Test
  public void testDeletionGroup() throws Exception {
   
    app.goToGroupPage();
    app.selectGroup();
    app.deleteSelectedGroups();
    app.returnToGroupPage();
  }

}
