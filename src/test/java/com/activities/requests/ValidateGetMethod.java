package com.activities.requests;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class ValidateGetMethod {
	
	
	@Test
	public void verifyGetWithValidReqSpec() {
		
		given().
		when().
		get("https://fakerestapi.azurewebsites.net/api/v1/Activities").
		then().
		log().all().
		statusCode(200);
		
		
		
	}
	
	@Test
	public void verifyGetWithInvalidReqSpec() {
		
		given().
		when().
		get("https://fakerestapi.azurewebsites.net/api/v1/Activitie").
		then().
		log().all().
		statusCode(404);
		
		
		
	}

}
