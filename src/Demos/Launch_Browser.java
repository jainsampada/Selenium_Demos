package Demos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
WebDriver driver;
String path;
public void Launch()
{
	//Give path to chromedriver.exe by giving SetProperty 
	//method which is taking parameters in the form of key/value pair
	//Step 1
	//Dynamic path to chromedriver
	//user.dir will pick the path of root project
	path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
	
	//Static path of Chromedriver
	System.setProperty("webdriver.chrome.driver", path);
	
	//Step 2
	//Initialize the ChromeDriver
	driver=new ChromeDriver();
	
	//Step 3
	//Provide url of the application
	driver.get("https://opensource-demo.orangehrmlive.com/");
	ArrayList<WebElement> al=new ArrayList<WebElement>(driver.findElements(By.tagName("a")));
	System.out.println(al.size());
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i).getText());
		System.out.println(al.get(i).getAttribute("href"));
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch_Browser oo=new Launch_Browser();
		oo.Launch();
	}

}
