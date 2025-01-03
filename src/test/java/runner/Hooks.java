package runner;

import commonfunctions.DriverHelper;
import org.junit.Before;

import java.io.IOException;

public class Hooks {
    @Before
    public void setUp() throws IOException, InterruptedException {
        DriverHelper.launchBrowser();
    }
}
