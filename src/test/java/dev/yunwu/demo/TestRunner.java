package dev.yunwu.demo;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"pretty"},
        tags = "@dev or @qa",
        glue = {"dev.yunwu.demo"}
)
public class TestRunner {}