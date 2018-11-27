package ru.aisubp.azk;

import org.junit.Test;

import java.io.File;


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
        Thread.sleep(10);

        //Проверка наличия нужного поля в фильтре "Статус услуги (работы):"
        if (driver.findElementsByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]").isEmpty())
        {
            System.out.println("Панель фильтрации открыта.");
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[12]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/img[1]").click();
            Thread.sleep(3000);
            driver.findElementByXPath("/html[1]/body[1]/div[18]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]").click();
            //driver.switchTo().frame(1);
            //System.out.println("Переключился на второй фрейм");
        }
        else {
            System.out.println("Панель фильтрации закрыта");
        }


return;
        //Проверяем, включен фильтр или нет. И в соответствие с этим выполняем наполнение фильтра.
/*
        boolean filter;
        try {
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"); //Проверка наличия нужного поля в фильтре "Статус услуги (работы):"
            filter=true;
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[11]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click(); //Сброс фильтра
            System.out.println("Фильтр сброшен");
            Thread.sleep(1500);

            System.out.println("Панель фильтрации открыта, задаю нужные параметры.");
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/img[2]").click();
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/img[1]").click();
            driver.findElementByXPath("/html[1]/body[1]/div[18]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]").click();
            driver.findElementByXPath("/html[1]/body[1]/div[18]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[6]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
        } catch (NoSuchElementException e) {
            filter=false;
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[11]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click(); //Сброс фильтра
            System.out.println("Фильтр сброшен");
            Thread.sleep(1500);

            System.out.println("Панель фильтрации закрыта, открываю панель фильтрации и задаю нужные параметры.");
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[12]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click(); //Открываем фильтр.
            driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/img[1]").click(); //Нажимаю на 3 точки "Статус услуги (работы)"

            driver.switchTo().frame(2);

            driver.findElementById("jqg_1").click();//Отмечаю крыжик у "Новый"
            System.out.println("Отметил крыжик");
            driver.findElementByXPath("/html[1]/body[1]/div[21]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click(); //Нажимаю на кнопку выбрать.
        }

        //driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]").click();
        //driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[6]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
        //driver.findElementByXPath("/html[1]/body[1]/div[20]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[2]").click();
       // Thread.sleep(1000);
        //driver.findElementByXPath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[25]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]").click();
*/
    }
}
