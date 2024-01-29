package PoopyPants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.Objects;


public class DGPPHomePageTestCase {
    WebDriver driver;

    @Parameters("browser_to_run")
    @BeforeMethod
    public void testSetup(@Optional("Chrome") String browsername) {

        if (Objects.equals(browsername, "Edge"))
            driver = new EdgeDriver();
        else if (Objects.equals(browsername, "Firefox"))
           driver = new FirefoxDriver();
        else
           driver = new ChromeDriver();

        //open application
        driver.get("https://poopypants.techcoachralph.dev/");

        //Maximize browser
        driver.manage().window().maximize();


    }

    @AfterMethod
    public void testCleanup() throws InterruptedException {

        //wait 4 sec
        Thread.sleep(4000);
        //close current tab
        driver.close();
    }


    @Test

    public void clickquotebuttontest() throws InterruptedException{

        //click on button 3 times
        for (int i = 0; i < 3; i++) {
            //wait 3 secs
            Thread.sleep(3000);

            //click on button
            driver.findElement(By.id("btn")).click();


        }



    }


    }

