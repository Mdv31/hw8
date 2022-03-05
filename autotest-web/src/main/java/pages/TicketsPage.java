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
    private SelenideElement saveQueryButton = $x("//*[@id=\"headingTwo\"]/h5/button");

    @Name("поле Query Name")
    private SelenideElement queryNameField = $(By.id("id_title"));

    @Name("кнопка2 Save Query")
    private SelenideElement saveQueryButton2 = $x("//*[@id=\"collapseTwo\"]/div/form/div/input");

    @Name("кнопка Delete Saved Query")
    private SelenideElement deleteSavedQueryButton = $x("//*[@id=\"collapseOne\"]/form/ul/li[9]/a");

    @Name("кнопка2 Delete Saved Query")
    private SelenideElement deleteSavedQueryButton2 = $x("//*[@id=\"content-wrapper\"]/div/form/button");

    @Name("поле Поиск тикета")
    private SelenideElement searchField = $(By.id("search_query"));

    @Name("кнопка Go")
    private SelenideElement goButton = $x("//*[@id=\"searchform\"]/div/div/button");

    @Name("кнопка Created")
    private SelenideElement createdButton = $x("//*[@id=\"ticketTable\"]/thead/tr/th[4]");

    @Name("поле новый тикет")
    private SelenideElement newTicketField = $x("//*[@id=\"ticketTable\"]/tbody/tr[1]/td[2]/div/a");

    @Name("кнопка Attach file")
    private SelenideElement attachFileButton = $(By.id("ShowFileUpload"));

    @Name("файл 0")
    private SelenideElement file0 = $(By.id("file0"));

    @Name("кнопка Update This Ticket")
    private SelenideElement updateButton = $x("//*[@id=\"content-wrapper\"]/div/div[3]/div[2]/form/button");






}
