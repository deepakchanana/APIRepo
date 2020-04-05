package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFIleLoad;
import org.testing.utilities.ResponseDataParsingUsingJsonPath;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

// TC1----------Post Request
public class TC1 {
	
	static String idValue;
	
	@Test
	public void testcase1() throws IOException
	{
	
	String firstname=	RandomStringUtils.randomAlphabetic(10);
	
	System.out.println(firstname);
		System.out.println(i);
		
	JSONObject data=new JSONObject();
	data.put("firstname",firstname);
	data.put("lastname","kumar");
	data.put("id", i.toString());
	data.put("designation","QA Lead");
		
	Properties pr= PropertiesFIleLoad.propertiesFile("../APIFrameworkPart/Env.Properties");	
	HTTPMethods http=new HTTPMethods(pr);	
	Response res=http.PostRequest("QA_URI",data.toString());	
	ResponseValidation.responseStatusCodeValidate(201, res);
   idValue=ResponseDataParsingUsingJsonPath.response_parsing(res,"id");
   System.out.println("id value is "+idValue);
   
	}

}
