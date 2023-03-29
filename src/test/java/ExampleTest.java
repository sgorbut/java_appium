import android.pageObjects.MainPage;
import android.utils.AndroidActions;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class ExampleTest extends BaseTest{


    @Test
    public void testAnything(){

        MainPage main = new MainPage(driver);

        main.tapPreference();
        main.tapPreferenceDependencies();
        main.preferenceDependenciesCheckboxClick();
        main.wifiSettingsClick();
        String text = main.getPopupText();
        main.enterText(text);
    }

    @Test
    public void ScrollDemoTest(){

        AndroidActions actions = new AndroidActions(driver);
        driver.findElement(AppiumBy.accessibilityId("Views")).click();

        //where to scroll is known prior
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
        actions.scrollToText("WebView");


    }




}
