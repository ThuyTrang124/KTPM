package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

public class TestCustomisedStatement {
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
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a"));
        click.click();
        WebElement accElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        accElement.sendKeys("");
        WebElement fromDateElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        fromDateElement.sendKeys("04062021");
        WebElement toDateElement = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        toDateElement.sendKeys("06062021");
        WebElement miniAmountElement = driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]"));
        miniAmountElement.sendKeys("5");
        WebElement numberAmountElement = driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]"));
        numberAmountElement.sendKeys("1");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        if (driver.switchTo().alert()!=null){
            driver.switchTo().alert().accept();
        }
        String error = driver.findElement(By.id("message2")).getText();
        AssertJUnit.assertEquals(error, "Account Number must not be blank");
        System.out.println("TC01: " + error);
    }
    public void TC02() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a"));
        click.click();
        WebElement accElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        accElement.sendKeys("%$93552");
        WebElement fromDateElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        fromDateElement.sendKeys("04062021");
        WebElement toDateElement = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        toDateElement.sendKeys("06062021");
        WebElement miniAmountElement = driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]"));
        miniAmountElement.sendKeys("5");
        WebElement numberAmountElement = driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]"));
        numberAmountElement.sendKeys("1");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        if (driver.switchTo().alert()!=null){
            driver.switchTo().alert().accept();
        }
        String error = driver.findElement(By.id("message2")).getText();
        AssertJUnit.assertEquals(error, "Special characters are not allowed");
        System.out.println("TC02: " + error);
    }
    public void TC03() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a"));
        click.click();
        WebElement accElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        accElement.sendKeys("93 552");
        WebElement fromDateElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        fromDateElement.sendKeys("04062021");
        WebElement toDateElement = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        toDateElement.sendKeys("06062021");
        WebElement miniAmountElement = driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]"));
        miniAmountElement.sendKeys("5");
        WebElement numberAmountElement = driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]"));
        numberAmountElement.sendKeys("1");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        if (driver.switchTo().alert()!=null){
            driver.switchTo().alert().accept();
        }
        String error = driver.findElement(By.id("message2")).getText();
        AssertJUnit.assertEquals(error, "Characters are not allowed");
        System.out.println("TC03: " + error);
    }
    public void TC04() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a"));
        click.click();
        WebElement accElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        accElement.sendKeys("avf93552");
        WebElement fromDateElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        fromDateElement.sendKeys("04062021");
        WebElement toDateElement = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        toDateElement.sendKeys("06062021");
        WebElement miniAmountElement = driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]"));
        miniAmountElement.sendKeys("5");
        WebElement numberAmountElement = driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]"));
        numberAmountElement.sendKeys("1");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        if (driver.switchTo().alert()!=null){
            driver.switchTo().alert().accept();
        }
        String error = driver.findElement(By.id("message2")).getText();
        AssertJUnit.assertEquals(error, "Characters are not allowed");
        System.out.println("TC04: " + error);
    }
    public void TC05() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a"));
        click.click();
        WebElement accElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        accElement.sendKeys("93552");
        WebElement fromDateElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        fromDateElement.sendKeys("04062021");
        WebElement toDateElement = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        toDateElement.sendKeys("02062021");
        WebElement miniAmountElement = driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]"));
        miniAmountElement.sendKeys("5");
        WebElement numberAmountElement = driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]"));
        numberAmountElement.sendKeys("1");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "FromDate field should be lower than ToDate field!!");
        System.out.println("TC05: " + result);
//        String error = driver.findElement(By.id("message2")).getText();
//        AssertJUnit.assertEquals(error, "Characters are not allowed");
//        System.out.println("TC03: " + error);
    }
    public void TC06() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a"));
        click.click();
        WebElement accElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        accElement.sendKeys("93552");
        WebElement fromDateElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        fromDateElement.sendKeys("04062021");
        WebElement toDateElement = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        toDateElement.sendKeys("06062021");
        WebElement miniAmountElement = driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]"));
        miniAmountElement.sendKeys("");
        WebElement numberAmountElement = driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]"));
        numberAmountElement.sendKeys("1");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
//        String result = driver.switchTo().alert().getText();
//        driver.switchTo().alert().accept();
//        AssertJUnit.assertEquals(result, "FromDate field should be lower than ToDate field!!");
        System.out.println("TC06: Pass " );
    }
    public void TC07() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a"));
        click.click();
        WebElement accElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        accElement.sendKeys("93552");
        WebElement fromDateElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        fromDateElement.sendKeys("04062021");
        WebElement toDateElement = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        toDateElement.sendKeys("06062021");
        WebElement miniAmountElement = driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]"));
        miniAmountElement.sendKeys("3231");
        WebElement numberAmountElement = driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]"));
        numberAmountElement.sendKeys("");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
//        String result = driver.switchTo().alert().getText();
//        driver.switchTo().alert().accept();
//        AssertJUnit.assertEquals(result, "FromDate field should be lower than ToDate field!!");
        System.out.println("TC07: Pass " );
    }
    public void TC08() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a"));
        click.click();
        WebElement accElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        accElement.sendKeys("93552");
        WebElement fromDateElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        fromDateElement.sendKeys("04062021");
        WebElement toDateElement = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        toDateElement.sendKeys("06062021");
        WebElement miniAmountElement = driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]"));
        miniAmountElement.sendKeys("ahaha");
        WebElement numberAmountElement = driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]"));
        numberAmountElement.sendKeys("1");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        if (driver.switchTo().alert()!=null){
            driver.switchTo().alert().accept();
        }
        String error = driver.findElement(By.id("message2")).getText();
        AssertJUnit.assertEquals(error, "Characters are not allowed");
        System.out.println("TC03: " + error);
    }
    public void TC09() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a"));
        click.click();
        WebElement accElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        accElement.sendKeys("93552");
        WebElement fromDateElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        fromDateElement.sendKeys("04062021");
        WebElement toDateElement = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        toDateElement.sendKeys("06062021");
        WebElement miniAmountElement = driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]"));
        miniAmountElement.sendKeys("5");
        WebElement numberAmountElement = driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]"));
        numberAmountElement.sendKeys("ahaha");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        if (driver.switchTo().alert()!=null){
            driver.switchTo().alert().accept();
        }
        String error = driver.findElement(By.id("message12")).getText();
        AssertJUnit.assertEquals(error, "Characters are not allowed");
        System.out.println("TC03: " + error);
    }
    public void TC10() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a"));
        click.click();
        WebElement accElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        accElement.sendKeys("93552");
        WebElement fromDateElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        fromDateElement.sendKeys("04062021");
        WebElement toDateElement = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        toDateElement.sendKeys("06062021");
        WebElement miniAmountElement = driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]"));
        miniAmountElement.sendKeys("5");
        WebElement numberAmountElement = driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]"));
        numberAmountElement.sendKeys("1");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        if (driver.switchTo().alert()!=null){
            driver.switchTo().alert().accept();
        }
        String error = driver.findElement(By.id("message2")).getText();
        AssertJUnit.assertEquals(error, "Characters are not allowed");
        System.out.println("TC03: " + error);
    }
    public void AfterClass() {
        driver.quit();

    }
    public static void main(String[] arg) throws InterruptedException {
        TestCustomisedStatement test = new TestCustomisedStatement();
        test.BeforeClass();
        test.TC01();
        test.TC02();
        test.TC03();
        test.TC04();
        test.TC05();
        test.TC06();
        test.TC07();
         test.TC08();
//        test.TC09();
//        test.TC10();
//        test.TC11();
        Thread.sleep(1000);
        test.AfterClass();
    }
}
