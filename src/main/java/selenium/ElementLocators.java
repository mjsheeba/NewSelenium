	package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementLocators {

	public static WebDriver driver;
	
	public static By justAnotherInputBox=By.id("justAnotherInputBox");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				By justAnInputBox=By.id("justAnInputBox");
				By choice=By.xpath("//span[@class='comboTreeItemTitle']");
				By popup=By.xpath("//a[contains(text(),'Come & Go Test')]");
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
		//////////////////////////////////////////////////////////
				/*
				driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
				
				
				driver.findElement(justAnInputBox).click();
				List<WebElement> ls=driver.findElements(choice);
				System.out.println(ls.size());
				for (int i =0;i<ls.size();i++) {
					
					System.out.println(ls.get(i).getText());
					
				}
				*/
		///////////////////////////////////////////////////////////////////
				
			driver.get("http://www.popuptest.com/");
				
				driver.findElement(popup).click();
				
				Set<String> wh= driver.getWindowHandles();
				
				Iterator<String> i = wh.iterator();
				
				String pwid=i.next();
				
				System.out.println("parent window id is:"+ pwid);
				
				String chwid=i.next();
				driver.switchTo().window(chwid);
				
				System.out.println("child window handle is :"+chwid);///If oi skip this line its not working
				
				System.out.println(driver.getTitle());
				
				driver.close();
				driver.switchTo().window(pwid);
				
				
////////////////////////////////////////////////////////////////////////////				
	}

}
