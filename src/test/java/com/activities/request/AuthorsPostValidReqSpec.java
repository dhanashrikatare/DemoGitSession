package com.activities.request;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import static com.utils.Utility.*;

public class AuthorsPostValidReqSpec {
	
	

	
	 @Test
	public void verifyPostWithValidReqSpec() {
		given().
		body(requestBody).
		header("Content-Type",content_typeValue).
		when().post(baseURL+authorUrl).
		then().log().all().statusCode(200).body("id", equalTo(randomNum))
		.body("idBook", equalTo(randomNum))
		.body("firstName", equalTo(randomString))
		.body("lastName", equalTo(randomString))
		
		;
		
		
	}


}
