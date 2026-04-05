package com.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class Utility {
	
	public static int randomNum = (int)(Math.random()*1000);
	public	static String randomString = "user" + RandomStringUtils.randomNumeric(4) + "@gmail.com";
	public static String baseURL = "https://fakerestapi.azurewebsites.net";
	public static String authorUrl="/api/v1/Authors";
	public static String content_typeValue="application/json";
	public static String requestBody="{\r\n"
			+ "  \"id\": "+randomNum+",\r\n"
			+ "  \"idBook\": "+randomNum+",\r\n"
			+ "  \"firstName\": \""+randomString+"\",\r\n"
			+ "  \"lastName\":\""+randomString+"\"\r\n"
			+ "}";
	

}
