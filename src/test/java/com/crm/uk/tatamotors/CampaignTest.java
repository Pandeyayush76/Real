package com.crm.uk.tatamotors;

import org.testng.annotations.Test;

public class CampaignTest {
 @Test(groups="smoke")
 public void campaign()
 {
	 System.out.println("camapign created successfuly");
 }
 
 @Test(groups={"regression","smoke"})
 public void contact()
 {
	 System.out.println("Contact failed successfully");
 }

}
