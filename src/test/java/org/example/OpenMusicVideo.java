package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMusicVideo {

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void openYouTube() throws InterruptedException {


        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("/html/body/ytd-app/ytd-consent-bump-v2-lightbox/tp-yt-paper-dialog/div[4]/div/div[6]/div[1]/ytd-button-renderer[2]/a/tp-yt-paper-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='search-input']/input")).sendKeys("Feeling Good");
        driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@title='Michael Bublé - Feeling Good [Official Music Video]']")).click();

        //driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a/yt-formatted-string")).click();
        //driver.findElement(By.xpath("//*[@href='/watch?v=Edwsf-8F3sI']")).click();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        //driver.close();
    }

}


