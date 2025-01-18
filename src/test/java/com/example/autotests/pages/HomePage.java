package com.example.autotests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Страница главной страницы веб-приложения.
 */
public class HomePage extends BasePage{

    /**
     * Элемент ссылки для выхода из системы.
     */
    @FindBy(linkText = "Logout")
    private WebElement logoutLink;

    /**
     * Конструктор страницы, инициализирующий элементы страницы.
     *
     * @param driver экземпляр веб-драйвера, необходимый для взаимодействия со страницей
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Нажимает на ссылку для выхода из системы.
     */
    public void clickLogout() {
        logoutLink.click();
    }
}
