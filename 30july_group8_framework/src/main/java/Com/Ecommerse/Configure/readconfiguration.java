package Com.Ecommerse.Configure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.google.j2objc.annotations.Property;

public class readconfiguration {
	Properties pro;
	
	public readconfiguration() {
		File src=new File("C:\\Users\\LENOVO\\eclipse-workspace\\30july_group8_framework\\src\\main\\java\\Com\\Ecommerse\\Configure\\config.properties");
        FileInputStream fis;
        try {
			fis=new FileInputStream(src);
			pro=new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
        
	}
	public String appurl() {
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String appmail() {
		String mailid=pro.getProperty("mail");
		return mailid;
	}
	public String apppass() {
		String pass=pro.getProperty("passwords");
		return pass;
	}
	public String appchromepath() {
		String path=pro.getProperty("chromepath");
		return path;
	}
	
	
  
}
