package ru.aisubp.azk;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;


public class AutoQA extends WebDriverSettings {

    @Test
    public void firstTest() throws InterruptedException {

        Thread.sleep(2000);//Некоторые элементы долго открываются и не могут сразу же ответить на запрос, добавил паузы.
        driver.findElementByXPath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/div[1]/li[7]/div[1]/img[1]").click();
        Thread.sleep(1000);
        driver.findElementByXPath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/div[1]/li[7]/ul[1]/li[2]/div[1]/a[1]/span[1]").click();
        Thread.sleep(2000);
        driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[11]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click(); //Сброс фильтра

        //Проверяем, включен фильтр или нет.
        boolean filter;
        try {
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); //Проверка наличия нужного поля в фильтре "Статус услуги (работы):"
            filter=true;
            System.out.println("Панель фильтрации открыта, задаю нужные параметры.");
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/img[2]").click();
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/img[1]").click();
            driver.findElementByXPath("/html[1]/body[1]/div[18]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]").click();
            driver.findElementByXPath("/html[1]/body[1]/div[18]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[6]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
        } catch (NoSuchElementException e) {
            filter=false;
            System.out.println("Панель фильтрации закрыта, открываю панель фильтрации и задаю нужные параметры.");
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[12]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/img[2]").click();
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/img[1]").click();
            driver.findElementByXPath("/html[1]/body[1]/div[18]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]").click();
            driver.findElementByXPath("/html[1]/body[1]/div[18]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[6]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
        }

        driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]").click();
        driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[6]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
        driver.findElementByXPath("/html[1]/body[1]/div[20]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[2]").click();
        Thread.sleep(1000);
        driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[25]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
    }
}
