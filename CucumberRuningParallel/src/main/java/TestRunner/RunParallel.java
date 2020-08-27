package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;


public class RunParallel extends AbstractTestNGCucumberTests {

      @Override
      @DataProvider(parallel = true)
      public Object[][] scenarios() {
            return super.scenarios();
      }
}