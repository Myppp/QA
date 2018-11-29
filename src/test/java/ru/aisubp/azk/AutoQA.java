package ru.aisubp.azk;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutoQA extends WebDriverSettings {

    @Test
    public void firstTest() throws InterruptedException {

        Thread.sleep(2000);//Некоторые элементы долго открываются и не могут сразу же ответить на запрос, добавил паузы.
        driver.findElementByXPath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/div[1]/li[7]/div[1]/img[1]").click();
        Thread.sleep(1500);
        driver.findElementByXPath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/div[1]/li[7]/ul[1]/li[2]/div[1]/a[1]/span[1]").click();
        Thread.sleep(1000);
        driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[11]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click(); //Сброс фильтра
        System.out.println("Фильтр сброшен");
        Thread.sleep(100);

        //Проверка наличия нужного поля в фильтре "Статус услуги (работы):"
        if (driver.findElementsByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]").isEmpty()) {
            System.out.println("Панель фильтрации была закрыта.");
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[12]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/img[1]").click();
        //Добавляем значение "Новый" в фильтр.
            Actions action = new Actions(driver);
            WebElement element = driver.findElementByXPath("/html[1]/body[1]/div[17]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[4]");
            action.doubleClick(element).perform();
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[6]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
            driver.findElementById("jqg_1").click();
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[6]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
            Thread.sleep(2000);
            driver.findElementByXPath("/html[1]/body[1]/div[19]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
        }
        else {
            System.out.println("Панель фильтрации была открыта");
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/img[1]").click();
            //Добавляем значение "Новый" в фильтр.
            Actions action = new Actions(driver);
            WebElement element = driver.findElementByXPath("/html[1]/body[1]/div[17]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[4]");
            action.doubleClick(element).perform();
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[6]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
            driver.findElementById("jqg_1").click();
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[6]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
            Thread.sleep(2000);
            driver.findElementByXPath("/html[1]/body[1]/div[19]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
        }
        System.out.println("Тест отработал без ошибок.");
    }
}
