package com.google;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class YandexTest {
    @Test
    void findSelenideInYa() {
        open("https://ya.ru");
        $("#text").val("Selenide").submit();
        $$("#search-result li").shouldHave(sizeGreaterThan(1));
        $("#search-result li").shouldHave(text("selenide.org"));
    }
}
