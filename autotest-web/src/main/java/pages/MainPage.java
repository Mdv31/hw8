package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "MainPage")
public class MainPage extends WebPage {

    @Name("кнопка логина")
    private SelenideElement searchButton = $(By.id("userDropdown"));
}
