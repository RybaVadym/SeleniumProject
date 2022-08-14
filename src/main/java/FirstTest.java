import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FirstTest {


    @Test
    void checkSomething(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String CARD_FROM = "4004159115449003";
        By codePhone = By.xpath("//*[@data-qa-node='phone-code']");
        By search = By.xpath("//input[@placeholder='Пошук']");
        By codeOption = By.xpath("//*[@data-qa-node='phone-code-option']");
        By telFrom = By.xpath("//input[@type='tel']");
        By amount = By.xpath("//input[@data-qa-node='amount']");
        By cardFrom = By.xpath("//*[@data-qa-node='numberdebitSource']");
        By expDate = By.xpath("//*[@data-qa-node='expiredebitSource']");
        By cvv = By.xpath("//*[@data-qa-node='cvvdebitSource']");
        By name = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        By surname = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        By service = By.xpath("//*[contains(text(), 'користування сервісом')]");
        By submitBtn = By.xpath("//button[@type='submit']");


        driver.get("https://next.privat24.ua/mobile");
        driver.findElement(codePhone).click();
        driver.findElement(search).sendKeys("Ukraine");
        driver.findElement(codeOption).click();
        driver.findElement(telFrom)
                .sendKeys("966189252");
        driver.findElement(amount).sendKeys(Keys.CONTROL+"A");
        driver.findElement(amount)
                .sendKeys("1");
        driver.findElement(cardFrom)
                .sendKeys("4004159115449003");
        driver.findElement(expDate)
                .sendKeys("1129");
        driver.findElement(cvv)
                .sendKeys("123");
        driver.findElement(name)
                .sendKeys("Vadym");
        driver.findElement(surname)
                .sendKeys("Ryba");
        driver.findElement(service).click();
        driver.findElement(submitBtn).submit();










    }
}
