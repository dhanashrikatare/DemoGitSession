package com.authors.request;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class AuthorsPostValidReq {

	@Test
	public void validPostReq() {
		given().body("{\r\n" + "  \"id\": 1,\r\n" + "  \"idBook\": 144,\r\n" + "  \"firstName\": \"MyDear\",\r\n"
				+ "  \"lastName\": \"MY\"\r\n" + "}").contentType("application/json").when()
				.post("https://fakerestapi.azurewebsites.net/api/v1/Authors").then().statusCode(200)
				.body("id", equalTo(1)).body("idBook", equalTo(144)).body("firstName", equalTo("MyDear")).body("lastName", equalTo("MY"))
				.header("Content-Type",equalTo( "application/json"))
				.log().all();

	}

}
