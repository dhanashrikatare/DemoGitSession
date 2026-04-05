package com.activities.requests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class ValidatePostMethod {

	@Test
	public void verifyPostWithValidReqSpec() {
		
		given().
	header("Content-type","application/json").
	body("{\r\n"
			+ "  \"id\": 12,\r\n"
			+ "  \"title\": \"myDear\",\r\n"
			+ "  \"dueDate\": \"2026-04-03T09:00:28.215Z\",\r\n"
			+ "  \"completed\": true\r\n"
			+ "}")
	.when()
	.post("https://fakerestapi.azurewebsites.net/api/v1/Activities")
	.then()
	.statusCode(200)
	.log().all();
	

}
	
	@Test
	public void verifyPostWithInvalidReqSpec() {
		
		given().
		header("Content-type","application/json").
		body("{\r\n"
				+ "  \"id\": \"12\",\r\n"
				+ "  \"title\": \"myDear\",\r\n"
				+ "  \"dueDate\": \"2026-04-03T09:00:28.215Z\",\r\n"
				+ "  \"completed\": true\r\n"
				+ "}").when()
		.post("https://fakerestapi.azurewebsites.net/api/v1/Activities")
		.then().log().all().statusCode(200);
	
}
}