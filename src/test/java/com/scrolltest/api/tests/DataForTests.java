package com.scrolltest.api.tests;

import org.testng.annotations.DataProvider;

public class DataForTests 
{
	@DataProvider(name="DataForPost")
	public Object[][] dataForPost() {
	
	return new Object[][] {
	{"Graham","Bell",1},
	{"Henry","Ford",2}
	};
	
	}
	@DataProvider(name = "DeleteData")
	public Object[] dataforDelete(){
		
		return new Object[] {
				4,5,6.7
		};
	}	
}


