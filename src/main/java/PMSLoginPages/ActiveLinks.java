package PMSLoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActiveLinks {
    public WebDriver driver;

    public ActiveLinks(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void activeLinks() {

        List<WebElement> Links = driver.findElements(By.xpath("//a[contains(@class, 'link')]"));
        System.out.println(Links.size());
        for (int i = 0; i < Links.size(); i++) {
            System.out.println(Links.get(i).getText());        }
    }
}
