package com.crm.uk.tatamotors;

import org.testng.annotations.Test;

public class ContactTest {

	@Test(groups="smoke")
	public void createContact()
	{
		System.out.println("Contact is created");
	}
	@Test(groups="regression")
	public void createCollege()
	{
		System.out.println("College os created");
	}
	
}
