package com.example.Junit.buoi6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Lab52 {
    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://shopee.vn/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebElement buttondangnhap= driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/header/div[1]/nav/ul/a[3]"));
//        buttondangnhap.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement inputUsername = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/form/div[1]/div[1]/input"));

        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='password']"));

        WebElement buttonLogin = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/form/button"));

        inputUsername.sendKeys("yourName");

        inputPassword.sendKeys("password");

        buttonLogin.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }


    }
}
