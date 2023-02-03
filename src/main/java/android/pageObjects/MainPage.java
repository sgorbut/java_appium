package android.pageObjects;

import android.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AndroidActions {

    AndroidDriver driver;

    public MainPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "Preference")
    private WebElement preference;

    @AndroidFindBy(accessibility = "3. Preference dependencies")
    private WebElement preferenceDependencies;

    @AndroidFindBy(id = "android:id/checkbox")
    private WebElement checkbox;

    @AndroidFindBy(xpath = "(//android.widget.RelativeLayout)[2]")
    private WebElement wifiSettings;

    @AndroidFindBy(id = "android:id/alertTitle")
    private WebElement popupTitle;

    @AndroidFindBy(id = "android:id/edit")
    private WebElement textInput;

    @AndroidFindBy(className = "")
    private WebElement tapButtonOk;



    public void tapPreference(){
        preference.click();
    }

    public void tapPreferenceDependencies (){
        preferenceDependencies.click();
    }

    public void preferenceDependenciesCheckboxClick(){
        checkbox.click();
    }

    public void wifiSettingsClick(){
        wifiSettings.click();
    }

    public String getPopupText(){
        return popupTitle.getText();
    }

    public void enterText(String text){textInput.sendKeys(text);}
}
