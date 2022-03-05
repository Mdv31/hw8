package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "TicketPage")
public class TicketPage extends WebPage {

    @Name("список Queue")
    private SelenideElement QueueDrop = $(By.id("id_queue"));

    @Name("поле Title")
    private SelenideElement TitleField = $(By.id("id_title"));

    @Name("поле Body")
    private SelenideElement BodyField = $(By.id("id_body"));

    @Name("список Priority")
    private SelenideElement PriorityDrop = $(By.id("id_priority"));

    @Name("поле Due Date")
    private SelenideElement DueDataField = $(By.id("id_due_date"));

    @Name("поле Sub Email")
    private SelenideElement SubEmailField = $(By.id("id_submitter_email"));

    @Name("кнопка Submit Ticket")
    private SelenideElement submitTicketButton = $x("//button[@type='submit']");






}
