package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		// check back,forward, alert, fileupload,get,navigate to
		
		WebDriver driver = new ChromeDriver();
		
		
		/*driver.get("https://www.flipkart.com/");
		  Thread.sleep(5000);
		WebElement source=driver.findElement(By.xpath("//span[contains(text(),'Baby & Kids')]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(source).build().perform();
		driver.findElement(By.xpath("//a[@title=\"Educational Toys\"]")).click();
		
		*/
		
		/*driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement contextclick=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions action = new Actions(driver);
		action.contextClick(contextclick).build().perform();
		driver.findElement(By.xpath("//li/span[contains(text(),\"Copy\")]")).click();
		*/
		/*
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		
		
		driver.findElement(By.xpath("//input[@value=\"radio2\"]")).click();
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hello World");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Option2");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		driver.findElement(By.id("openwindow")).click();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it = set.iterator(); 
		String parentwindow=it.next();
		String childwindow=it.next();	
		System.out.println(driver.switchTo().window(childwindow).getTitle());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		driver.close();	
		System.out.println(driver.switchTo().window(parentwindow).getTitle());
		
		
		driver.findElement(By.id("opentab")).click();;
		Set<String> set1=driver.getWindowHandles();
		Iterator<String> it1 = set1.iterator(); 
		String parentwindow1=it1.next();
		String childwindow1=it1.next();	
		System.out.println(driver.switchTo().window(childwindow1).getTitle());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		driver.close();	
		System.out.println(driver.switchTo().window(parentwindow1).getTitle());
		
		
		driver.findElement(By.id("name")).sendKeys("Hello Sheeba");;
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();	
		
		
		driver.findElement(By.id("name")).sendKeys("Hello Preetham");
		driver.findElement(By.id("confirmbtn")).click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();	
		
		//*[@id="product"]/tbody/tr[2]
		//*[@id="product"]/tbody/tr[2]/td[1]
		//*[@id="product"]/tbody/tr[3]/td[1]
		
		//*[@id="product"]/tbody/tr[2]/td[1]
		
		int rowCount=driver.findElements(By.xpath("//table[@id='product']//tr")).size()-1;
		
		
		String beforeXpath="//*[@id='product']/tbody/tr[";
		String afterXPath="]/td[1]";
		
		
		for (int rowNum=2 ;rowNum<=rowCount;rowNum++) {	
			String actualXpath=beforeXpath+rowNum+afterXPath;
			
			String value=driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(value);
		}
	*//////	
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		List<WebElement> li=driver.findElements(By.xpath("//div[@class=\"comboTreeDropDownContainer\"]//ul/li//span[@class='comboTreeItemTitle']"));
		System.out.println(li.size());
		for(int i=0;i<li.size();i++) {
	     if(li.get(i).getText().equals("choice 6 2 1")){
	    	 li.get(i).click();
	     }
	    
	      }
		
		System.out.println("Hello");
		System.out.println("Hello Next Day");
		System.out.println("Hello after PR Request and merge");
	}

}
