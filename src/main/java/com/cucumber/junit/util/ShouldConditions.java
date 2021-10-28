package com.cucumber.junit.util;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;


public class ShouldConditions {
	public void waitUntilElementClickable(By locator) {
		$(locator).should(Condition.enabled);
	}

	public void waitUntilElementVisible(By locator) {
		$(locator).should(Condition.enabled);
	}
}