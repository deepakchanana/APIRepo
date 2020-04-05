package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFIleLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

// TC2-------------Get Request
// we will take id value from TC1

public class TC2 
{
	@Test
   public void testcase2() throws IOException
   {
	   Properties pr=PropertiesFIleLoad.propertiesFile("../APIFrameworkPart/Env.Properties");
	   HTTPMethods http=new HTTPMethods(pr);
	  Response res= http.GetRequest("QA_URI",TC1.idValue);
	  
	  System.out.println("Second TestCase");
	  
	  System.out.println(res.asString());
	  System.out.println(res.statusCode());
   }
}
