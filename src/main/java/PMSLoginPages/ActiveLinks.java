package PMSLoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActiveLinks {
    public WebDriver driver;
    @FindBy(xpath = "//ul/li/a[contains(.,'Manage Global Master Files')]")
    WebElement globalmasterfiles;

    public ActiveLinks(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void activeLinkLeftMenu() {

        List<WebElement> MenuLinks = driver.findElements(By.xpath("//a[contains(@class,'nav-link')]"));
        System.out.println("ActiveLinksInLeftMenu " + MenuLinks.size());
        for (WebElement menuLink : MenuLinks) {
            System.out.println(menuLink.getText());
        }
    }

    public void activeLinkMasterFiles() throws InterruptedException {
        Thread.sleep(4000);
        globalmasterfiles.click();
        List<WebElement> MastersLink = driver.findElements(By.xpath("//ul/li/a[contains(@href,'manage-global-master-files')]"));
        System.out.println("ActiveLinksInGlobalMastreFiles " + MastersLink.size());
        for (int i = 0; i < MastersLink.size(); i++) {
            System.out.println(MastersLink.get(i).getText());
        }
    }
}
