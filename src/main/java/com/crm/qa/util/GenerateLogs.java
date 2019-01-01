package com.crm.qa.util;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenerateLogs {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubx
		
		Logger log=Logger.getLogger(GenerateLogs.class);
		WebDriver driver=new FirefoxDriver();
		log.info("launching Browser");
		driver.get("https://www.freecrm.com");
		log.info("FreeCrm url has been launched");
		String title=driver.getTitle();
		System.out.println("Title is :-"+title);
		

}
}