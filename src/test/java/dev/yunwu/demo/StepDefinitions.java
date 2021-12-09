package dev.yunwu.demo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @When("^I run this test with \"(.*)\"$")
    public void iRunThisTest(String data) {
        System.out.println(data);
    }

    @Then("I should succeed")
    public void iShouldSucceed() {
    }
}
