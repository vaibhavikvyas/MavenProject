package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenURL {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver;

        WebDriverManager.edgedriver().setup();
        driver =new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.argos.co.uk/");
        Thread.sleep(3000);
        driver.close();

        WebDriverManager.edgedriver().setup();
        driver =new EdgeDriver();
        driver.get("https://www.next.co.uk/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();

        WebDriverManager.edgedriver().setup();
        driver =new EdgeDriver();
        driver.get("https://www.poundland.co.uk/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();

        WebDriverManager.edgedriver().setup();
        driver =new EdgeDriver();
        driver.get("https://www.bbc.co.uk/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();



    }
}
