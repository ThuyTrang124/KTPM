package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;

import java.util.HashMap;
import java.util.Map;

public class TestDeposit {
    private WebDriver driver;
    public void Beforeclass() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");
        WebElement element = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        element.sendKeys("mngr331968");
        WebElement elements = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        elements.sendKeys("gurYtug");
        WebElement button = driver.findElement(By.name("btnLogin"));
        button.click();
    }
    public void TC01() {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a"));
        click.click();
        driver.findElement(By.name("accountno")).sendKeys("");
        driver.findElement(By.name("ammount")).sendKeys("");
        driver.findElement(By.name("desc")).sendKeys("");
        driver.findElement(By.name("AccSubmit")).click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Please fill all fields");
//        String error = driver.findElement(By.id("message3")).getText();
//        AssertJUnit.assertEquals(error, "First character can not have space");
        System.out.println("TC01: " + result);
    }
    public void TC02() {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a"));
        click.click();
        driver.findElement(By.name("accountno")).sendKeys("");
        driver.findElement(By.name("ammount")).sendKeys("300000");
        driver.findElement(By.name("desc")).sendKeys("chuyen");
        driver.findElement(By.name("AccSubmit")).click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Please fill all fields");
        String error = driver.findElement(By.id("message2")).getText();
        AssertJUnit.assertEquals(error, "Account Number must not be blank");
        System.out.println("TC02: " + error);

    }
    public void TC03() {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a"));
        click.click();
        driver.findElement(By.name("accountno")).sendKeys("93563");
        driver.findElement(By.name("ammount")).sendKeys("");
        driver.findElement(By.name("desc")).sendKeys("chuyen");
        driver.findElement(By.name("AccSubmit")).click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Please fill all fields");
        String error = driver.findElement(By.id("message1")).getText();
        AssertJUnit.assertEquals(error, "Amount field must not be blank");
        System.out.println("TC03: " + error);

    }
    public void TC04() {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a"));
        click.click();
        driver.findElement(By.name("accountno")).sendKeys("93563");
        driver.findElement(By.name("ammount")).sendKeys("300000");
        driver.findElement(By.name("desc")).sendKeys("");
        driver.findElement(By.name("AccSubmit")).click();
//        String result = driver.switchTo().alert().getText();
//        driver.switchTo().alert().accept();
//        AssertJUnit.assertEquals(result, "Please fill all fields");
        String error = driver.findElement(By.id("message17")).getText();
        AssertJUnit.assertEquals(error, "Description can not be blank");
        System.out.println("TC04: " + error);

    }
    public void TC05() {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a"));
        click.click();
        driver.findElement(By.name("accountno")).sendKeys("93563");
        driver.findElement(By.name("ammount")).sendKeys("300000");
        driver.findElement(By.name("desc")).sendKeys("chuyen");
        driver.findElement(By.name("AccSubmit")).click();
        System.out.println("TC05: Deposite Successful");
//        String result = driver.switchTo().alert().getText();
//        driver.switchTo().alert().accept();
//        AssertJUnit.assertEquals(result, "Please fill all fields");
//        String error = driver.findElement(By.id("message17")).getText();
//        AssertJUnit.assertEquals(error, "Description can not be blank");
//        System.out.println("TC04: " + error);

    }
    public void tearDown() {
        driver.quit();
    }
    public static void main(String[] arg) throws InterruptedException {
        TestDeposit test = new TestDeposit();
        test.Beforeclass();
        test.TC01();
        Thread.sleep(3000);
        test.TC02();
        Thread.sleep(3000);
        test.TC03();
        Thread.sleep(3000);
        test.TC04();
        Thread.sleep(1000);
        test.TC05();
        Thread.sleep(1000);
        test.tearDown();
//        test.deposit();
//        test.diposit02();
//        test.diposit03();
//        test.diposit04();
    }
}

