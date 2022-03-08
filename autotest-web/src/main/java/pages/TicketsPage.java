package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Name(value = "TicketsPage")
public class TicketsPage extends WebPage {

    @Name("кнопка Save Query")
    private SelenideElement saveQueryButton = $x("//button[@class='btn btn-link collapsed btn-sm']");

    @Name("поле Query Name")
    private SelenideElement queryNameField = $(By.id("id_title"));

    @Name("кнопка2 Save Query")
    private SelenideElement saveQueryButton2 = $x("//input[@type='submit' and @value='Save Query']");

    @Name("кнопка Delete Saved Query")
    private SelenideElement deleteSavedQueryButton = $x("//a[contains(text(), 'Delete Saved Query')]");

    @Name("кнопка2 Delete Saved Query")
    private SelenideElement deleteSavedQueryButton2 = $x("//button[contains(text(), 'Yes')] ");

    @Name("поле Поиск тикета")
    private SelenideElement searchField = $(By.id("search_query"));

    @Name("кнопка Go")
    private SelenideElement goButton = $x("//button[@class='btn btn-primary'] ");

    @Name("кнопка Created")
    private SelenideElement createdButton = $x("//th[contains(text(), 'Created')]");

    @Name("поле новый тикет")
    private SelenideElement newTicketField = $x("//*[@id='ticketTable']//a");

    @Name("кнопка Attach file")
    private SelenideElement attachFileButton = $(By.id("ShowFileUpload"));
/*
    @Name("кнопка Browse файл 0")
    private SelenideElement BrowseFile0Button = $(By.id("file0"));*/
    @Name("кнопка Browse файл 0")
    private SelenideElement BrowseFile0Button = $x("//label[contains(text(), 'Browse')]");


    @Name("кнопка Update This Ticket")
    private SelenideElement updateButton = $x("//button[contains(text(), 'Update This Ticket')]");

}
