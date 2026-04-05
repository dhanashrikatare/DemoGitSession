package com.stepdefinitions;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class ActivitiesPostRequestSpec {
	
	
	String GetUrl;
	Response response;
	
	@Given("Base Url is given for activities")
	public void setBaseUrl() {
		String url="https://fakerestapi.azurewebsites.net/api/v1/Activities";
		this.GetUrl=url;
	}
	@When("i send the POST request for activities")
	public void performPostMethod() {
		response=given().header("Content-Type","application/json").body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"title\": \"string\",\r\n"
				+ "  \"dueDate\": \"2024-06-17T12:44:21.827Z\",\r\n"
				+ "  \"completed\": true\r\n"
				+ "}").when().post(GetUrl);
		
	}
	@Then("i should get the valid response status code 200")
	public void validateStatusCode() {
		response.then().statusCode(200);
	}
	@And("i should get the valid response body for post activities")
	public void validateResponseBody() {
		response.then().log().all().body("title", equalTo("string"));
		response.then().log().all().body("dueDate", notNullValue());
	}
	
	
	
	
	
	
	

}
