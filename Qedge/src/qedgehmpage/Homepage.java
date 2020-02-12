package qedgehmpage;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Homepage {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("E:\\shafi by java\\Qedge\\shafi.properties");
		Properties p=new Properties();
		p.load(fis);
		WebDriver driver= new FirefoxDriver();
		driver.get(p.getProperty("URl"));
		driver.findElement(By.id(p.getProperty("Uname.id"))).sendKeys(p.getProperty("Uname"));
		driver.findElement(By.id(p.getProperty("pwd.id"))).sendKeys(p.getProperty("pwd"));
		driver.findElement(By.id(p.getProperty("login.id"))).click();
		File pic=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pic, new File("E:/khan.jpg"));
         
        
        System.out.println("Screenshot taken");
	}

}
