package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenURLwithJUnit {

    WebDriver driver;
@Before
public void setup(){
    WebDriverManager.edgedriver().setup();
    driver =new EdgeDriver();
    driver.manage().window().maximize();
}
@Test
public void openArgos(){driver.get("https://www.argos.co.uk/");}
@Test
public void openNext(){
    driver.get("https://www.next.co.uk/");
}
@Test
public void openPoundLand(){driver.get("https://www.poundland.co.uk/");}
@Test
public void openBBC(){ driver.get("https://www.bbc.co.uk/");}
    @Test
    public void openEbay(){ driver.get("https://www.ebay.co.uk/");}

@After
public void tearDown() throws InterruptedException {
    Thread.sleep(3000);
    driver.close();
}



}
