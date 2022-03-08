package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Если;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.lanit.at.utils.Sleep;
import ru.lanit.at.web.pagecontext.PageManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;


public class WebActionSteps {

    private PageManager pageManager;
    private static final Logger LOGGER = LoggerFactory.getLogger(WebActionSteps.class);

    public WebActionSteps(PageManager manager) {
        this.pageManager = manager;
    }

    /**
     * нажимает на элемент по тексту
     *
     * @param text текст элемента
     */
    @Когда("кликнуть на элемент по тексту {string}")
    public void clickElementWithText(String text) {
        $(Selectors.byText(text))
                .shouldBe(Condition.visible, Duration.ofSeconds(6))
                .click();
        LOGGER.info("клик на элемент по тексту '{}'", text);
    }

    @Если("кликнуть на элемент {string}")
    public void clickOnElement(String elementName) {
        SelenideElement element = pageManager
                .getCurrentPage()
                .getElement(elementName);
        element
                .shouldBe(Condition.visible)
                .click();
        LOGGER.info("клик на элемент '{}'", elementName);
    }

    /**
     * скролл до элемента
     *
     * @param elementName наименование элемента
     */
    @Когда("проскроллить страницу до элемента {string}")
    public void scrollToElement(String elementName) {
        SelenideElement element = pageManager.getCurrentPage().getElement(elementName);
        element.shouldBe(Condition.visible)
                .scrollIntoView("{block: 'center'}");
        LOGGER.info("скролл страницы до элемента '{}'", elementName);
    }

    /**
     * скролл до текста
     *
     * @param text текст
     */
    @Когда("проскроллить страницу до текста {string}")
    public void scrollToText(String text) {
        SelenideElement element = $(Selectors.byText(text));
        element.shouldBe(Condition.visible)
                .scrollIntoView("{block: 'center'}");
        LOGGER.info("скролл страницы до текста '{}'", text);
    }

    @И("подождать {int} сек")
    public void waitSeconds(int timeout) {
        Sleep.pauseSec(timeout);
    }

    /**
     * Ввод значения в элемент
     *
     * @param field - наименование элемента
     * @param value - значение
     */
    @Когда("ввести в поле {string} значение {string}")
    public void fillTheField(String field, String value) {
        SelenideElement fieldElement = pageManager
                .getCurrentPage()
                .getElement(field);
        fieldElement
                .shouldBe(Condition.visible)
                .setValue(value);
        LOGGER.info("в поле '{}' введено значение '{}'", field, value);
    }

    @Когда("ввести в список {string} значение {string}")
    public void fillTheDrop(String field, String value) {
        SelenideElement fieldElement = pageManager
                .getCurrentPage()
                .getElement(field);
        fieldElement
                .shouldBe(Condition.visible)
                .selectOptionContainingText(value);
        LOGGER.info("в список '{}' введено значение '{}'", field, value);
    }

    @Когда("загрузить файл в {string} значение {string}")
    public void uploadFile (String field, String value) {

        File file = new File(value);
        SelenideElement fieldElement = pageManager
                .getCurrentPage()
                .getElement(field);
        fieldElement
                .shouldBe(Condition.visible)
                .uploadFile(file);
        LOGGER.info("в элемент '{}' загружен файл '{}'", field, value);
    }

    @Когда("загрузить тестовый файл в {string} имя файла {string} размер файла Mb {int}")
    public void uploadGeneratedFile (String field, String value, int bLen) throws IOException {
        FileOutputStream out = new FileOutputStream(value);
        String text = "1234567812345678";
        byte[] b= text.getBytes();
        for (int i=0; i < bLen*64*1024;i++){
                                out.write(b);
                            }
        out.close();

        File file = new File(value);
        SelenideElement fieldElement = pageManager
                .getCurrentPage()
                .getElement(field);
        fieldElement
                .shouldBe(Condition.visible)
                .find(By.id("file0")).uploadFile(file);
        LOGGER.info("в элемент '{}' загружен файл '{}'", field, value);
        out.flush();
        file.delete();
    }



    /**
     * Очистка поля
     *
     * @param elementName наименование элемента
     */
    @Если("очистить поле {string}")
    public void clearFiled(String elementName) {
        pageManager
                .getCurrentPage()
                .getElement(elementName)
                .shouldBe(Condition.visible)
                .clear();
    }
}
