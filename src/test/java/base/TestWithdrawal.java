package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

public class TestWithdrawal {
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
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a"));
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
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a"));
        click.click();
        driver.findElement(By.name("accountno")).sendKeys("");
        driver.findElement(By.name("ammount")).sendKeys("30000");
        driver.findElement(By.name("desc")).sendKeys("rut lan 1");
        driver.findElement(By.name("AccSubmit")).click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Please fill all fields");
        String error = driver.findElement(By.id("message2")).getText();
        AssertJUnit.assertEquals(error, "Account Number must not be blank");
        System.out.println("TC02: " + error);
    }
    public void TC03() {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a"));
        click.click();
        driver.findElement(By.name("accountno")).sendKeys("93563");
        driver.findElement(By.name("ammount")).sendKeys("30000");
        driver.findElement(By.name("desc")).sendKeys("");
        driver.findElement(By.name("AccSubmit")).click();
//        String result = driver.switchTo().alert().getText();
//        driver.switchTo().alert().accept();
//        AssertJUnit.assertEquals(result, "Please fill all fields");
        String error = driver.findElement(By.id("message17")).getText();
        AssertJUnit.assertEquals(error, "Description can not be blank");
        System.out.println("TC03: " + error);
    }
    public void TC04() {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a"));
        click.click();
        driver.findElement(By.name("accountno")).sendKeys("935636");
        driver.findElement(By.name("ammount")).sendKeys("30000");
        driver.findElement(By.name("desc")).sendKeys("rut tien");
        driver.findElement(By.name("AccSubmit")).click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Account does not exist");
        System.out.println("TC04: " + result);
    }
    public void TC05() {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a"));
        click.click();
        driver.findElement(By.name("accountno")).sendKeys("93563");
        driver.findElement(By.name("ammount")).sendKeys("51000000");
        driver.findElement(By.name("desc")).sendKeys("rut tien");
        driver.findElement(By.name("AccSubmit")).click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Transaction Failed. Account Balance Low!!!");
        System.out.println("TC05: " + result);
    }
    public void TC06() {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a"));
        click.click();
        driver.findElement(By.name("accountno")).sendKeys("93563@#");
        driver.findElement(By.name("ammount")).sendKeys("30000");
        driver.findElement(By.name("desc")).sendKeys("rut lan 1");
        driver.findElement(By.name("AccSubmit")).click();
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Please fill all fields");
        String error = driver.findElement(By.id("message2")).getText();
        AssertJUnit.assertEquals(error, "Special characters are not allowed");
        System.out.println("TC06: " + error);
    }
    public void TC07() {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a"));
        click.click();
        driver.findElement(By.name("accountno")).sendKeys("93563");
        driver.findElement(By.name("ammount")).sendKeys("300000");
        driver.findElement(By.name("desc")).sendKeys("rut lan 1");
        driver.findElement(By.name("AccSubmit")).click();
        System.out.println("TC06: Withdrawal successfull");
    }
    public void tearDown() {
        driver.quit();
    }
    public static void main(String[] arg) throws InterruptedException {
        TestWithdrawal test = new TestWithdrawal();
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
        test.TC06();
        Thread.sleep(1000);
        test.TC07();
        Thread.sleep(1000);
        test.tearDown();
//        test.deposit();
//        test.diposit02();
//        test.diposit03();
//        test.diposit04();
    }
}
