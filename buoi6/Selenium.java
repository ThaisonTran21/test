package com.example.Junit.buoi6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://stackoverflow.co/");

        WebElement buttonShip  = driver.findElement(By.xpath("//a[@id='company-leadership']"));

        buttonShip.click();

       // driver.quit();
    }
}
