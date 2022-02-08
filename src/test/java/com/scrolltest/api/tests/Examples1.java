package com.scrolltest.api.tests;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class Examples1 {
	@Test
	public void test_get() {
		
			baseURI = "http://localhost:3000/";
			
			given().
			param("name","Automation").
			get("/subjects").
			then().
			statusCode(200).log().all();
	}
	public void test_post() {
		JSONObject request = new JSONObject();
		request.put("firstName", "Tom");
		request.put("lasttName", "Cooper");
		request.put("subjectId", 1);
		
		baseURI ="http://localhost:3000/";
		
	given().
	contentType(ContentType.JSON).
	accept(ContentType.JSON).
	header("Content-Type","application/json").
	body(request.toJSONString()).
	when().
	post("/users").
	then().
	statusCode(201).log().all();
	}
}
