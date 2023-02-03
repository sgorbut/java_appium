import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    public AndroidDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {

//        service = new AppiumServiceBuilder()
//                .withAppiumJS(new File("/opt/homebrew/lib/node_modules/appium/build/lib/main.js")) // расположение файла main.js для appium
//                .withIPAddress("127.0.0.1")
//                .usingPort(4733)
//                .withArgument(GeneralServerFlag.BASEPATH, "/wd/hub")
//                .build();
//        service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Android SDK build for x86");
        options.setApp(System.getProperty("user.dir") + "/apks/ApiDemos.apk");
        options.setPlatformName("Android");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
//        service.stop();
    }

}
