package com.otajisan.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

import static org.junit.Assert.*;

public class SampleScenarioStep {
    @Given("^ユーザ\"([^\"]*)\"としてログインしている$")
    public void ユーザ_としてログインしている(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^正解となる問題を選択する$")
    public void 正解となる問題を選択する() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^\"([^\"]*)\"ボタンをクリックする$")
    public void ボタンをクリックする(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^次の問題が表示される$")
    public void 次の問題が表示される() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
