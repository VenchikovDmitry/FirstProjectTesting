package ThreePackSeleniumTest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pageObject.InitePage;

public class ThreeTest extends  BaseClass{
    @Test
    @Epic("Селениум")
    @Feature("Гугле тетс")
    @Story("Проверяем картинки")
    public void TestFun()
    {
       getDriver().get("https://www.google.ru/");
       // getDriver().get("https://www.google.com/search?q=%D0%B2%D0%BA&oq=%D0%B2%D0%BA&aqs=chrome.0.69i59l2j0l6.2179j0j15&sourceid=chrome&ie=UTF-8");
        getDriver().manage().window().maximize();
        InitePage in = new InitePage(getDriver());
        in.setSearchText("Привет");
        in.clickSubmitSearch();
    }

}
