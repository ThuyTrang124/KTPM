package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;

public class TestLogin {
    private WebDriver driver;
    public void BeforeClass() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");
    }
    public void TC01(){
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        driver =new ChromeDriver();
//        driver.get("http://www.demo.guru99.com/V4/");
        WebElement element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        element.sendKeys("mngr331968");
        WebElement elements = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        elements.sendKeys("gurYtug");
        WebElement button=driver.findElement(By.name("btnLogin"));
        button.click();
//        String result = driver.switchTo().alert().getText();
        System.out.println("TC01: Login Successful ");
    }
    public void TC02() {
        WebElement element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        element.clear();
        WebElement elements=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        element.clear();
        WebElement user = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        user.sendKeys("mngr331968");
        WebElement pass =driver.findElement(By.name("password"));
        pass.sendKeys("");
        WebElement button=driver.findElement(By.name("btnLogin"));
        button.click();
//        String result = driver.switchTo().alert().getText();

//        AssertJUnit.assertEquals(result, "User or Password is not valid");
        String error = driver.findElement(By.id("message18")).getText();
        AssertJUnit.assertEquals(error, "Password must not be blank");
        System.out.println("TC02: " + error);
    }
    public void TC03() {
        WebElement element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        element.clear();
//        WebElement elements=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
//        element.clear();
        WebElement user = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        user.sendKeys("mngr3319");
        WebElement pass = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        pass.sendKeys("gurYtug");
        WebElement button=driver.findElement(By.name("btnLogin"));
        button.click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "User or Password is not valid");
        System.out.println("TC03: " + result);
    }
    public void TC04() {
        WebElement element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        element.clear();
        WebElement elements=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        element.clear();
        WebElement user = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        user.sendKeys("mngr331968");
        WebElement pass =driver.findElement(By.name("password"));
        pass.sendKeys("gurYtug5");
        WebElement button=driver.findElement(By.name("btnLogin"));
        button.click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "User or Password is not valid");
        System.out.println("TC04: " + result);
    }
    public void TC05() {
        WebElement element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        element.clear();
//        WebElement elements=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
//        element.clear();
        WebElement user = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        user.sendKeys("");
        WebElement pass = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        pass.sendKeys("");
        WebElement button=driver.findElement(By.name("btnLogin"));
        button.click();
//        String result = driver.switchTo().alert().getText();
//        driver.switchTo().alert().accept();
//        AssertJUnit.assertEquals(result, "User or Password is not valid");
//        System.out.println("TC05: " + result);
        String error = driver.findElement(By.id("message23")).getText();
        AssertJUnit.assertEquals(error, "User-ID must not be blank");
//        String errors = driver.findElement(By.id("message23")).getText();
//        AssertJUnit.assertEquals(errors, "Password must not be blank");
        System.out.println("TC05: " + error );
    }
    public static void main(String[] arg) throws InterruptedException {
        TestLogin test = new TestLogin();
        test.BeforeClass();
        Thread.sleep(1000);
        test.TC02();
        Thread.sleep(5000);
        test.TC03();
        Thread.sleep(5000);
        test.TC04();
        Thread.sleep(5000);
        test.TC05();
        Thread.sleep(5000);
        test.TC01();
        test.AfterClass();

}
    public void AfterClass() {
       driver.quit();
    }
}