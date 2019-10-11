package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TecAdminSeleniumTest {

    @PostConstruct
    private void init() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\msiwiak\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://google.com");

        Thread.sleep(1000);

        if (driver.getPageSource().contains("I'm Feeling Lucky")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        driver.quit();

    }


}
