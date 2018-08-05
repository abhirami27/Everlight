package testingautomation;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class testauto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
//Navigate to http://computer-database.gatling.io/computers
driver.get("http://computer-database.gatling.io/computers");
WebDriverWait mywait= new WebDriverWait(driver,30);
//Add a new computer
driver.findElement(By.id("add")).click();
driver.findElement(By.name("name")).sendKeys("Abhi's computer");
driver.findElement(By.name("introduced")).sendKeys("2018-03-02");
driver.findElement(By.name("discontinued")).sendKeys("2018-11-02");
Select dropdown = new Select(driver.findElement(By.name("company")));
dropdown.selectByValue("13");
driver.findElement(By.cssSelector("input.btn.primary")).click();
//Filter by value
driver.findElement(By.name("f")).sendKeys("Abhi's computer");
driver.findElement(By.id("searchsubmit")).click();
WebDriverWait mywait1= new WebDriverWait(driver,30);
//Click on a computer and verify the update functionality
List<WebElement> allLinks = driver.findElements(By.tagName("a"));
allLinks.get(1).click();
driver.findElement(By.name("name")).sendKeys("Abhi's computer-update");
driver.findElement(By.cssSelector("input.btn.primary")).click();
driver.findElement(By.name("f")).sendKeys("Abhi");
driver.findElement(By.id("searchsubmit")).click();
//Select a computer and check delete functionality
List<WebElement> allLinks1 = driver.findElements(By.tagName("a"));
allLinks1.get(7).click();
driver.findElement(By.cssSelector("input.btn.danger")).click();
	}

}

