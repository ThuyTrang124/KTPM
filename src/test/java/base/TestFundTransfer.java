package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;

public class TestFundTransfer {
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
//    public void TC01() {
//        driver.get("http://www.demo.guru99.com/V4/index.php");
//        WebElement nameElement = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
//        nameElement.sendKeys("mngr331968");
//        WebElement passElement = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
//        passElement.sendKeys("gurYtug");
//        WebElement button=driver.findElement(By.name("btnLogin"));
//        button.click();
//    }
    public void TC02() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a"));
        click.click();
        WebElement payersElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payersElement.sendKeys("");
        WebElement payeesElement = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payeesElement.sendKeys("93550");
        WebElement amountElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amountElement.sendKeys("10000");
        WebElement descriptionElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        descriptionElement.sendKeys("chuyen tien");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        if (driver.switchTo().alert()!=null){
            driver.switchTo().alert().accept();
        }
        String error = driver.findElement(By.id("message10")).getText();
        AssertJUnit.assertEquals(error, "Payers Account Number must not be blank");
        System.out.println("TC02: " + error);
    }
    public void TC03() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a"));
        click.click();
        WebElement payersElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payersElement.sendKeys("93552");
        WebElement payeesElement = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payeesElement.sendKeys("");
        WebElement amountElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amountElement.sendKeys("10000");
        WebElement descriptionElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        descriptionElement.sendKeys("chuyen tien");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        if (driver.switchTo().alert()!=null){
            driver.switchTo().alert().accept();
        }
        String error = driver.findElement(By.id("message11")).getText();
        AssertJUnit.assertEquals(error, "Payees Account Number must not be blank");
        System.out.println("TC03: " + error);
    }
    public void TC04() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a"));
        click.click();
        WebElement payersElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payersElement.sendKeys("93552");
        WebElement payeesElement = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payeesElement.sendKeys("93550");
        WebElement amountElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amountElement.sendKeys("");
        WebElement descriptionElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        descriptionElement.sendKeys("chuyen tien");
        Thread.sleep(1000);
        driver.findElement(By.name("AccSubmit")).click();
        if (driver.switchTo().alert()!=null){
            driver.switchTo().alert().accept();
        }
        String error = driver.findElement(By.id("message1")).getText();
        AssertJUnit.assertEquals(error, "Amount field must not be blank");
        System.out.println("TC04: " + error);
    }
    public void TC05() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a"));
        click.click();
        WebElement payersElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payersElement.sendKeys(" 93552");
        WebElement payeesElement = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payeesElement.sendKeys("93550");
        WebElement amountElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amountElement.sendKeys("10000");
        WebElement descriptionElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        descriptionElement.sendKeys("");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        if (driver.switchTo().alert()!=null){
            driver.switchTo().alert().accept();
        }
        String error = driver.findElement(By.id("message17")).getText();
        AssertJUnit.assertEquals(error, "Description can not be blank");
        System.out.println("TC05: " + error);
    }
    public void TC06() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a"));
        click.click();
        WebElement payersElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payersElement.sendKeys("%$93552");
        WebElement payeesElement = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payeesElement.sendKeys("93550");
        WebElement amountElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amountElement.sendKeys("10000");
        WebElement descriptionElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        descriptionElement.sendKeys("chuyen tien");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        if (driver.switchTo().alert()!=null){
            driver.switchTo().alert().accept();
        }
        String error = driver.findElement(By.id("message10")).getText();
        AssertJUnit.assertEquals(error, "Special characters are not allowed");
        System.out.println("TC06: " + error);
    }
    public void TC07() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a"));
        click.click();
        WebElement payersElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payersElement.sendKeys("93552");
        WebElement payeesElement = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payeesElement.sendKeys("$593550");
        WebElement amountElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amountElement.sendKeys("10000");
        WebElement descriptionElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        descriptionElement.sendKeys("chuyen tien");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        if (driver.switchTo().alert()!=null){
            driver.switchTo().alert().accept();
        }
        String error = driver.findElement(By.id("message11")).getText();
        AssertJUnit.assertEquals(error, "Special characters are not allowed");
        System.out.println("TC07: " + error);
    }
    public void TC08() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a"));
        click.click();
        WebElement payersElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payersElement.sendKeys("93552");
        WebElement payeesElement = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payeesElement.sendKeys("93550");
        WebElement amountElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amountElement.sendKeys("ahah");
        WebElement descriptionElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        descriptionElement.sendKeys("chuyen tien");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        if (driver.switchTo().alert()!=null){
            driver.switchTo().alert().accept();
        }
        String error = driver.findElement(By.id("message1")).getText();
        AssertJUnit.assertEquals(error, "Characters are not allowed");
        System.out.println("TC08: " + error);
    }
    public void TC09() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a"));
        click.click();
        WebElement payersElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payersElement.sendKeys("935636");
        WebElement payeesElement = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payeesElement.sendKeys("93550");
        WebElement amountElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amountElement.sendKeys("20000000");
        WebElement descriptionElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        descriptionElement.sendKeys("chuyen tien");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Account 935636does not exist!!!");
        System.out.println("TC09: " + result);
//        String error = driver.findElement(By.id("message10")).getText();
//        AssertJUnit.assertEquals(error, "Payers Account Number must not be blank");
//        System.out.println("TC02: " + error);
    }
    public void TC10() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a"));
        click.click();
        WebElement payersElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payersElement.sendKeys("93563");
        WebElement payeesElement = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payeesElement.sendKeys("935503");
        WebElement amountElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amountElement.sendKeys("20000000");
        WebElement descriptionElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        descriptionElement.sendKeys("chuyen tien");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        String result = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        AssertJUnit.assertEquals(result, "Account 935503does not exist!!!");
        System.out.println("TC10: " + result);
//        String error = driver.findElement(By.id("message10")).getText();
//        AssertJUnit.assertEquals(error, "Payers Account Number must not be blank");
//        System.out.println("TC02: " + error);
    }
    public void TC11() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a"));
        click.click();
        WebElement payersElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payersElement.sendKeys("93552");
        WebElement payeesElement = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payeesElement.sendKeys("10225");
        WebElement amountElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amountElement.sendKeys("@#10000");
        WebElement descriptionElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        descriptionElement.sendKeys("chuyen tien");
        driver.findElement(By.name("AccSubmit")).click();
        Thread.sleep(1000);
        if (driver.switchTo().alert()!=null){
            driver.switchTo().alert().accept();
        }
        String error = driver.findElement(By.id("message1")).getText();
        AssertJUnit.assertEquals(error, "Special characters are not allowed");
        System.out.println("TC11: " + error);
    }
    public void TC12() throws InterruptedException {
        WebElement click = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a"));
        click.click();
        WebElement payersElement = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        payersElement.sendKeys("93552");
        WebElement payeesElement = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]"));
        payeesElement.sendKeys("93550");
        WebElement amountElement = driver.findElement(By.xpath("//tbody/tr[6]/td[2]/input[1]"));
        amountElement.sendKeys("10000");
        WebElement descriptionElement = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        descriptionElement.sendKeys("chuyen tien");
        driver.findElement(By.name("AccSubmit")).click();
//        Thread.sleep(1000);
//        if (driver.switchTo().alert()!=null){
//            driver.switchTo().alert().accept();
//        }
//        String error = driver.findElement(By.id("message10")).getText();
//        AssertJUnit.assertEquals(error, "Payers Account Number must not be blank");
        System.out.println("TC12: FundTransfer Successful " );
    }
    public void tearDown() {
        driver.quit();
    }
    public static void main(String[] arg) throws InterruptedException {
        TestFundTransfer test = new TestFundTransfer();
        test.BeforeClass();
//        test.TC01();
        test.TC02();
        test.TC03();
        test.TC04();
        test.TC05();
        test.TC06();
        test.TC07();
        test.TC08();
        test.TC09();
        test.TC10();
        test.TC11();
        test.TC12();
        Thread.sleep(1000);
        test.tearDown();
    }
}
