package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFIleLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC3
{
	@Test
  public void testcase3() throws IOException
  {
	  JSONObject data=new JSONObject();
		data.put("firstname","updatedfirstname");
		data.put("lastname","updatedlastname");
		data.put("id", TC1.idValue);
		data.put("designation","QA Lead");

	  Properties pr=PropertiesFIleLoad.propertiesFile("../APIFrameworkPart/Env.Properties");
	   HTTPMethods http=new HTTPMethods(pr);
	  Response res= http.putRequest("QA_URI",TC1.idValue, data.toString());
	  
	  ResponseValidation.responseStatusCodeValidate(201, res);
  }
	
}
