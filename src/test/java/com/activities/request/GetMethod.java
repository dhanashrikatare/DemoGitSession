package com.activities.request;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.*;

public class GetMethod {
	
	//given-define the request and initialize the request details ---start yahase hoga
	//requestBody,parameters,authentication,headers,contentType,queryParameters,pathParameters
	
	//when-send the request with method and endpoint
	//then-it is use to validate the response 

	@Test
	public void verifyGetMethodWithvalidReqRes() {

		given().when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities").then().log().all()
				.statusCode(200);

	}

	@Test
	public void verifyGetMethodWithInvalidReqRes() {

		given().when().get("https://fakerestapi.azurewebsites.net/api/v1/Activitie").then().statusCode(404).log().all();

	}
	
	@Test
	public void verifyGetMethodithValidReqResWithPathParameter() {
		given().when().pathParam("path","api/v1/Activities").get("https://fakerestapi.azurewebsites.net/{path}")
		.then().statusCode(200).log().all();
	}
	
	//simple one to one response body validation-it's too lengthy
	@Test
	public void verifyGetMethowithResponseBodyValidation() {
		
		given().
		when().get("https://fakerestapi.azurewebsites.net/api/v1/Activities").then().body("[0].id", equalTo(1)).body("[0].title", equalTo("Activity 1"))
		;
		
	}
	
	//NotNullValue matcher
	
	
	
	
	

}
