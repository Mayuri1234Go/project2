package com.scrolltest.api.tests;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.AbstractDocument.Content;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
@Test
public class Tests_POST1 {

	public void test_1_post() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Raghav");
		map.put("job", "Teacher");
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users/2").
		then.
		statusCode(200);
	}

	private Object given() {
		// TODO Auto-generated method stub
		return null;
	}
}