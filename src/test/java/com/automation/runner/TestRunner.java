package com.automation.runner;


import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit5.Karate;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestRunner {

    @Karate.Test
    Karate testParallel() {
        return Karate.run("classpath:features").
                outputCucumberJson(true).
                reportDir("Cucumber-Karate");
    }

}
