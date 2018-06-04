package com.zuora.test.exam.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.AssertJUnit;

import com.google.common.collect.ImmutableMap;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.BaseRequest;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequestWithBody;
import com.mashape.unirest.request.body.Body;
import com.mashape.unirest.request.body.RequestBodyEntity;

public class TestBase {
	/*here are four Http request method, please notice the test case name as: post, delete, update, create*/
	public static void executePostCommonCases(String postData, String url,String userName, String passWord,int responses) throws UnirestException
	{
			RequestBodyEntity request = Unirest.post(url).basicAuth(userName,passWord)
	              .headers(ImmutableMap.of("Content-Type", "application/json", "Accept", "application/json"))
	             .body(postData);

	    	System.out.println(request.getBody().toString());
	        HttpResponse<String> response = ((BaseRequest) request).asString();
	        System.out.println("Actual Response:"+response.getBody().toString());
	        AssertJUnit.assertEquals(response.getStatus(), responses);
	}

	public static void executeGetCommonCases(String getData, String userName, String passWord, String url,int responses) throws UnirestException
	{
		GetRequest request = Unirest.get(url).basicAuth(userName,passWord).headers(ImmutableMap.of("Accept", "application/json"));


	    	HttpResponse<String> response = ((BaseRequest) request).asString();
	        System.out.println("Actual Response:"+response.getBody().toString());
	        AssertJUnit.assertEquals(response.getStatus(), responses);
	}
	public static void executePutCommonCases(String putData, String userName, String passWord, String url,int responses) throws UnirestException
	{
		RequestBodyEntity request = Unirest.put(url).basicAuth(userName,passWord).headers(ImmutableMap.of("Content-Type", "application/json","Accept", "application/json")).body(putData);


	    	System.out.println(request.getBody().toString());
	        HttpResponse<String> response = request.asString();
	        System.out.println("Actual Response:"+response.getBody().toString());
	        AssertJUnit.assertEquals(response.getStatus(), responses);
	}
	public static void executeDeleteCommonCases(String deleteData, String userName, String passWord, String url,int responses) throws UnirestException
	{
		HttpRequestWithBody request = Unirest.delete(url).basicAuth(userName,passWord).headers(ImmutableMap.of("Content-Type", "application/json"));


	    	HttpResponse<String> response = ((BaseRequest) request).asString();
	        AssertJUnit.assertEquals(response.getStatus(), responses);
	}
		
}

