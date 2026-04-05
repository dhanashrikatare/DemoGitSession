
package com.books.request;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;



public class ValidPostBooksReq {
	@Test
	public void  ValidPostBooksReq() {
		
		
		
		given()
		.body("{\r\n"
				+ "  \"id\": 2,\r\n"
				+ "  \"title\": \"mylove\",\r\n"
				+ "  \"description\": \"hello dear\",\r\n"
				+ "  \"pageCount\": 200,\r\n"
				+ "  \"excerpt\": \"eyjfhje\",\r\n"
				+ "  \"publishDate\": \"2026-03-28T17:41:47.378Z\"\r\n"
				+ "}")
		.header("Content-type","application/json")
		.when().pathParam("path", "api/v1/Books")
		.post("https://fakerestapi.azurewebsites.net/{path}")
		.then()
		.statusCode(200)
		.body("id", equalTo(2))
		.body("title",equalTo("mylove"))
		.body("description",equalTo("hello dear"))
		.body("pageCount",equalTo(200))
		.body("excerpt",equalTo("eyjfhje"))
		.body("publishDate", notNullValue())
		.header("Content-type", equalTo("application/json; charset=utf-8; v=1.0"))
		.log().all();
	}
	
	
	

}
