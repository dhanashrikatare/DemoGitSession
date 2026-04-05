package com.activities.requests;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class ValidateGetMethodWithSpecific {
	
	@Test
	public void verifyGetWithValidReqSpec() {
		
		given().
		pathParam("path", "api/v1/Activities/1").
		when().
		get("https://fakerestapi.azurewebsites.net/{path}").
		then().
		log().all().
		body("id",equalTo(1)).
		body("title",equalTo("Activity 1")).
		body("dueDate",notNullValue()).
		body("completed",equalTo(false)).
		statusCode(200).
		header("Content-Type", "application/json; charset=utf-8; v=1.0");
		
		
		
	}
	

}
