package com.epam.tc.automation.cucumber.demo.pages.selenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class SelenideHomePage {

    @FindBy(id = "user-icon")
    private SelenideElement userIcon;

    @FindBy(id = "name")
    private SelenideElement loginTextField;

    @FindBy(id = "password")
    private SelenideElement passwordTextField;

    @FindBy(id = "login-button")
    private SelenideElement loginButton;

    @FindBy(id = "user-name")
    private SelenideElement userNameLabel;

    public SelenideHomePage() {
        page(this);
    }

    public void login(String username, String password) {
        userIcon.click();
        loginTextField.sendKeys(username);
        passwordTextField.sendKeys(password);
        loginButton.click();
    }

    public String getUserNameText() {
        return userNameLabel.getText();
    }

}
