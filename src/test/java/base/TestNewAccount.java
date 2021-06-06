package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

public class TestNewAccount {
    private WebDriver driver;
    public void BeforeClass() {
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
    public void TC01() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a"));
        button.click();
        WebElement cusid = driver.findElement(By.name("cusid"));
        cusid.sendKeys("92573");
        Select type = new Select(driver.findElement(By.name("selaccount")));
        type.selectByValue("Savings");
        WebElement money = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
        money.sendKeys("50000000");
        WebElement sub = driver.findElement(By.name("button2"));
        sub.click();
        System.out.println("TC01: New Account Successful" );

    }
    public void TC02() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a"));
        button.click();
        WebElement cusid = driver.findElement(By.name("cusid"));
        cusid.sendKeys("");
        Select type = new Select(driver.findElement(By.name("selaccount")));
        type.selectByValue("Savings");
        WebElement money = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
        money.sendKeys("50000000");
        WebElement sub = driver.findElement(By.name("button2"));
        sub.click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Please fill all fields");
        String error = driver.findElement(By.id("message14")).getText();
        AssertJUnit.assertEquals(error, "Customer ID is required");
        System.out.println("TC02: " + error);

    }
    public void TC03() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a"));
        button.click();
        WebElement cusid = driver.findElement(By.name("cusid"));
        cusid.sendKeys("abc92573");
        Select type = new Select(driver.findElement(By.name("selaccount")));
        type.selectByValue("Savings");
        WebElement money = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
        money.sendKeys("50000000");
        WebElement sub = driver.findElement(By.name("button2"));
        sub.click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Please fill all fields");
        String error = driver.findElement(By.id("message14")).getText();
        AssertJUnit.assertEquals(error, "Characters are not allowed");
        System.out.println("TC03: " + error);

    }
    public void TC04() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a"));
        button.click();
        WebElement cusid = driver.findElement(By.name("cusid"));
        cusid.sendKeys("92 573");
        Select type = new Select(driver.findElement(By.name("selaccount")));
        type.selectByValue("Savings");
        WebElement money = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
        money.sendKeys("50000000");
        WebElement sub = driver.findElement(By.name("button2"));
        sub.click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Please fill all fields");
        String error = driver.findElement(By.id("message14")).getText();
        AssertJUnit.assertEquals(error, "Characters are not allowed");
        System.out.println("TC04: " + error);

    }
    public void TC05() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a"));
        button.click();
        WebElement cusid = driver.findElement(By.name("cusid"));
        cusid.sendKeys("92573@#$%");
        Select type = new Select(driver.findElement(By.name("selaccount")));
        type.selectByValue("Savings");
        WebElement money = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
        money.sendKeys("50000000");
        WebElement sub = driver.findElement(By.name("button2"));
        sub.click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Please fill all fields");
        String error = driver.findElement(By.id("message14")).getText();
        AssertJUnit.assertEquals(error, "Special characters are not allowed");
        System.out.println("TC05: " + error);

    }
    public void TC06() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a"));
        button.click();
        WebElement cusid = driver.findElement(By.name("cusid"));
        cusid.sendKeys("92573");
        Select type = new Select(driver.findElement(By.name("selaccount")));
        type.selectByValue("Savings");
        WebElement money = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
        money.sendKeys("");
        WebElement sub = driver.findElement(By.name("button2"));
        sub.click();
//        String result = driver.switchTo().alert().getText();
//        driver.switchTo().alert().accept();
//        AssertJUnit.assertEquals(result, "Please fill all fields");
        String error = driver.findElement(By.id("message19")).getText();
        AssertJUnit.assertEquals(error, "Initial Deposit must not be blank");
        System.out.println("TC06: " + error);

    }
    public void TC07() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a"));
        button.click();
        WebElement cusid = driver.findElement(By.name("cusid"));
        cusid.sendKeys("92573");
        Select type = new Select(driver.findElement(By.name("selaccount")));
        type.selectByValue("Savings");
        WebElement money = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
        money.sendKeys("500000bc");
        WebElement sub = driver.findElement(By.name("button2"));
        sub.click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Please fill all fields");
        String error = driver.findElement(By.id("message19")).getText();
        AssertJUnit.assertEquals(error, "Characters are not allowed");
        System.out.println("TC07: " + error);

    }
    public void TC08() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a"));
        button.click();
        WebElement cusid = driver.findElement(By.name("cusid"));
        cusid.sendKeys("92573");
        Select type = new Select(driver.findElement(By.name("selaccount")));
        type.selectByValue("Savings");
        WebElement money = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
        money.sendKeys("5000000@");
        WebElement sub = driver.findElement(By.name("button2"));
        sub.click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Please fill all fields");
        String error = driver.findElement(By.id("message19")).getText();
        AssertJUnit.assertEquals(error, "Special characters are not allowed");
        System.out.println("TC08: " + error);

    }
    public void TC09() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a"));
        button.click();
        WebElement cusid = driver.findElement(By.name("cusid"));
        cusid.sendKeys("92573@#$%");
        Select type = new Select(driver.findElement(By.name("selaccount")));
        type.selectByValue("Savings");
        WebElement money = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
        money.sendKeys("50000000");
        WebElement sub = driver.findElement(By.name("button2"));
        sub.click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Please fill all fields");
        String error = driver.findElement(By.id("message14")).getText();
        AssertJUnit.assertEquals(error, "Special characters are not allowed");
        System.out.println("TC05: " + error);

    }
    public void TC10() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a"));
        button.click();
        WebElement cusid = driver.findElement(By.name("cusid"));
        cusid.sendKeys("92573@#$%");
        Select type = new Select(driver.findElement(By.name("selaccount")));
        type.selectByValue("Savings");
        WebElement money = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
        money.sendKeys("50000000");
        WebElement sub = driver.findElement(By.name("button2"));
        sub.click();
//        String result = driver.switchTo().alert().getText();
//        driver.switchTo().alert().accept();
//        AssertJUnit.assertEquals(result, "Please fill all fields");
        String error = driver.findElement(By.id("message14")).getText();
        AssertJUnit.assertEquals(error, "Special characters are not allowed");
        System.out.println("TC05: " + error);

    }


    public static void main(String[] arg) throws InterruptedException {
        TestNewAccount test = new TestNewAccount();
        test.BeforeClass();
        test.TC02();
        Thread.sleep(5000);
        test.TC03();
        Thread.sleep(5000);
        test.TC04();
        Thread.sleep(5000);
        test.TC05();
        Thread.sleep(5000);
        test.TC06();
        Thread.sleep(1000);
        test.TC07();
        Thread.sleep(1000);
        test.TC08();
        Thread.sleep(5000);
        test.TC01();
//        test.AfterClass();

    }
}
