package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerceRegestration {

    WebDriver driver;
    String MyFirstName = "Vaibhavi";
    String MyLastName = "Vyas";
    double Num = Math.random();
    String MyEmail = (MyFirstName + MyLastName + Num + "@Gmail.com");
    String MyPassword="Password01";

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void registration(){
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys(MyFirstName);
        driver.findElement(By.id("LastName")).sendKeys(MyLastName);
        driver.findElement(By.name("DateOfBirthDay")).click();
        driver.findElement(By.xpath("//Option[@Value='3']")).click();
        driver.findElement(By.name("DateOfBirthMonth")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]/option[8]")).click();
        driver.findElement(By.name("DateOfBirthYear")).findElement(By.xpath("//Option[@Value='1986']")).click();
        driver.findElement(By.id("Email")).sendKeys(MyEmail);
        driver.findElement(By.id("Company")).sendKeys("Sumatra");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys(MyPassword);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(MyPassword);
        driver.findElement(By.id("register-button")).click();
        String text=driver.findElement(By.className("result")).getText();
        System.out.println(text);
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
}
}