package com.stepdefinitions;

import static io.restassured.RestAssured.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class ActivitiesGetReqStepsDefine {
	String getUrl;
	Response response;

	@Given("Base Url")
	public void set_base_url() {
		String url="https://fakerestapi.azurewebsites.net/api/v1/Activities";
		this.getUrl=url;

	}

	@When("i send the GET request for activities")
	public void performGetMethod() {
	response=given().
		when().get(getUrl)
		;

	}

	@Then("i should get the valid response code 200")
	public void validateStatusCode() {
		
	response.then().statusCode(200);

	}

	@And("i should get the valid response body for activities")
	public void validateResponseBody() {
		response.then().log().all().body("title[0]", equalTo("Activity 1"));
		response.then().log().all().body("dueDate[0]", notNullValue());
		
	}

}
