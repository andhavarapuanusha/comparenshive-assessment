package com.comprensive_assessment_hybrid_framework.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	
	
	public static Properties property() throws IOException
	{
		Properties p=new Properties();
		FileInputStream file=new FileInputStream("./config.properties");
		p.load(file);
		return p;
		
	}

}
