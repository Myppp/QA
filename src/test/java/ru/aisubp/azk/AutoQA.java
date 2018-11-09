package ru.aisubp.azk;

import org.junit.Test;


public class AutoQA extends WebDriverSettings {

    @Test
    public void firstTest() throws InterruptedException {

        Thread.sleep(2000);//Некоторые элементы долго открываются и не могут сразу же ответить на запрос открыться, добавил паузы.
        driver.findElementByXPath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/div[1]/li[6]/div[1]/img[1]").click();

        Thread.sleep(2000);
        driver.findElementByXPath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/div[1]/li[6]/ul[1]/li[1]/div[1]/img[1]").click();

        Thread.sleep(2000);
        driver.findElementByXPath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/div[1]/li[6]/ul[1]/li[1]/ul[1]/li[8]/div[1]/a[1]/span[1]").click();
        System.out.println("Списковая форма ЭД Уведомление о бюжетных назначениях по расходам - открыта.");

        Thread.sleep(2000);
        driver.findElementByXPath("//button[@id='ext-gen237']").click();
        System.out.println("Инициализация процесса создания нового документа.");

        Thread.sleep(2000);

    }
}