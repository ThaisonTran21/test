package com.example.Junit.buoi6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab5 {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://lms.poly.edu.vn/");

        try {
            driver.manage().window().maximize();

            WebElement buttonHaNoi  = driver.findElement(By.xpath("//p[@class='whitespace-nowrap'][1]"));

            buttonHaNoi.click();

            driver.navigate().back();

            driver.navigate().refresh();

            WebElement button  = driver.findElement(By.xpath("//p[@class='whitespace-nowrap'][1]"));
            button.click();

            WebElement inputUserName = driver.findElement(By.xpath("//input[@id ='username']"));

            WebElement inputPassword = driver.findElement(By.xpath("//input[@id ='password']"));

            WebElement buttonLogin = driver.findElement(By.xpath("//input[@class='btn btn-default btn-sm']"));

            inputUserName.sendKeys("your-name");

            inputPassword.sendKeys("your-password");

            buttonLogin.click();
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
