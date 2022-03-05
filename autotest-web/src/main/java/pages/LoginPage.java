package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "LoginPage")
public class LoginPage extends WebPage {

    @Name("поле логина")
    private SelenideElement usernameField = $(By.id("username"));

    @Name("поле пароля")
    private SelenideElement passwordField = $(By.id("password"));

    @Name("кнопка логина")
    private SelenideElement loginButton = $x("//input[@type='submit' and @value='Login']");
}
