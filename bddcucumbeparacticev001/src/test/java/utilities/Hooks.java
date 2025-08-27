package utilities;

import io.cucumber.java.*;


public class Hooks {

    private final Launchthebrowser driver;

    public Hooks(Launchthebrowser driver) {
        this.driver = driver;
    }

    @Before
    public void setUp() {
    	driver.getDriver();
    }

    @After
    public void tearDown() {
    	driver.quitDriver();
    }
}