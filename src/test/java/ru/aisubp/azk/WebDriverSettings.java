package ru.aisubp.azk;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class WebDriverSettings {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/d.belkin/IdeaProjects/QA/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        System.out.println("Web Driver успешно настроен и запущен!");
        driver.get("http://srv-asugf/login.jsp");
        driver.findElement(By.id("login")).sendKeys("root");
        driver.findElementById("password").sendKeys("toor");
        driver.findElement(By.id("submit")).click();
        System.out.println("Авторизация выполнена!");
    }

    @After
    public void close() {
    }
}
