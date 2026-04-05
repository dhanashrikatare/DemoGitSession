package com.activities.request;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class ValidGetMethod {
	
	@Test
	public void verifyGetWithValidReqSpec() {
		
		given().
		baseUri("https://fakerestapi.azurewebsites.net/api/v1").
		when().
		get("/Activities").
		then().
		log().all().
		statusCode(200);
		
	}
	
	@Test
	public void verifyPostWithValidReqSpec() {
		given().
		header("Content-type","application/json").
		pathParam("path", "api/v1/Activities").
		
		body("{\r\n"
				+ "  \"id\": 1,\r\n"
				+ "  \"title\": \"Rest\",\r\n"
				+ "  \"dueDate\": \"2026-03-21T06:40:25.861Z\",\r\n"
				+ "  \"completed\": true\r\n"
				+ "}").when().post("https://fakerestapi.azurewebsites.net/{path}").then().statusCode(200).log().all();
		
	}
	
	
	
	

}
