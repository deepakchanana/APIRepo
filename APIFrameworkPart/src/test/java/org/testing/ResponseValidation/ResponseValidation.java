package org.testing.ResponseValidation;
// status Code Validate
// data validate


import com.jayway.restassured.response.Response;

public class ResponseValidation 
{
  public static void responseStatusCodeValidate(int expectedStatusCode,Response res)
  {
	  if(expectedStatusCode==res.getStatusCode())
	  {
		  System.out.println("Test Case pass with status code "+res.statusCode());
	  }
	  else
	  {
		  System.out.println("Test Case failed with status code "+res.statusCode());
	  }
  }
}
