package com.scrolltest.api.tests;

import org.testng.annotations.Test;


import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class Tests_GET1 {
	@Test
	public void test_01() {
		given().get("https://reqres.in/api/users?page=2").
		then().statusCode(200).
		body("data.id[1]", equalTo(8)).body("data.first_name", hasItems("Michael","Lindsay"));
		
		
	}

	
}
