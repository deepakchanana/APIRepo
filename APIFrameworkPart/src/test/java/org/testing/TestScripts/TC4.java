package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFIleLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC4 {
	@Test
	public void testcase4() throws IOException
	{
		 Properties pr=PropertiesFIleLoad.propertiesFile("../APIFrameworkPart/Env.Properties");
		   HTTPMethods http=new HTTPMethods(pr);
		 Response res=  http.deleteRequest("QA_URI",TC1.idValue);
		  ResponseValidation.responseStatusCodeValidate(201, res);	
	}

}
