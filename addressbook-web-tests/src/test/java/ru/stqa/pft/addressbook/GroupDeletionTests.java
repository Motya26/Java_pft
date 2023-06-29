package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests  extends TestBase {



  @Test
  public void testDeletionGroup() throws Exception {
   
    goToGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
