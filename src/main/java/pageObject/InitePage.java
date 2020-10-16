package pageObject;

import Selenium.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitePage extends BaseClass {

    public InitePage(WebDriver driver) {
        super(driver);

    }
   // @FindBy(xpath = ".//input[@title='Поиск']")
   // @FindBy(xpath = ".//h3[@class='LC20lb DKV0Md']")
   @FindBy(xpath = ".//h3[@class='LC20lb DKV0Md']")
    private WebElement setSearchText;

    @FindBy(xpath = "(.//input[@value='Поиск в Google'])[1]")
    private WebElement submitSearch;

    /**
     * Вводим текст в поисковую строку.
     *
     * @param text
     */
    public void setSearchText(String text) {
        setText(setSearchText, text);
    }

    /**
     * Кликаем по кнопке Поиск в гугле.
     */
    public void clickSubmitSearch(){
        click(submitSearch);
    }
}
