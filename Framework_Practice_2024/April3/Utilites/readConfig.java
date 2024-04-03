package Utilites;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class readConfig {
	
	Properties properties;
	
	public readConfig()
	{
		try {
			
			Path floc = Paths.get(System.getProperty("user.dir"),"April3", "Utilites", "config.properties");
			File fpath = floc.toFile();
			FileInputStream fis = new FileInputStream(fpath);
			
			properties = new Properties();
			properties.load(fis);			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public String getbaseURL()
	{
		String burl = properties.getProperty("BaseURL");
		return burl;
	}
	public String getUserName()
	{
		String uname = properties.getProperty("UserName");
		return uname;
	}
	public String getPassWord()
	{
		String pwd = properties.getProperty("PassWord");
		return pwd;
	}
	public String getBrowser()
	{
		String browserName = properties.getProperty("BrowserName");
		return browserName;
	}

}
