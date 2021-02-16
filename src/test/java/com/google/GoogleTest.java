package com.google;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.*;

public class GoogleTest {

    private static final String URL = "https://www.google.com/";
    private static final String SEARCH = "Selenide";

    @Test
    @DisplayName("Simple test for Google search for word Selenide")
    void simpleGoogleTest() {

        step("Open url " + URL, () -> {
            open(URL);
        });

        step("Setting search value to " + SEARCH, () -> {
            $(byName("q")).setValue(SEARCH).pressEnter();
        });

        step("Making sure if search returned " + SEARCH + " as a result", () -> {
            $("#search").shouldHave(text(SEARCH));
        });

    }
}
