package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFIleLoad
{
  public static Properties propertiesFile(String filePath) throws IOException
  {
	  File f=new File(filePath);
	  FileInputStream fi=new FileInputStream(f);
	  Properties pr=new Properties();
	  pr.load(fi);
	  
	  return pr;
  }
	
}
