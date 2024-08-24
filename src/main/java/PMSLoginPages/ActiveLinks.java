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
    @FindBy(xpath = "//li/a[contains(.,'Entity Setup')]")
    WebElement entitySetUps;

    public ActiveLinks(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void activeLinkLeftMenu() {
        List<WebElement> MenuLinks = driver.findElements(By.xpath("//a/span[contains(@class,'nav-text')]"));
        System.out.println("ActiveLinksInLeftMenu ---------->>>: " + MenuLinks.size());
        for (WebElement menuLink : MenuLinks) {
            System.out.println(menuLink.getText());
        }
    }

    public void activeLinkMasterFiles() throws InterruptedException {
        Thread.sleep(5000);
        globalmasterfiles.click();
        Thread.sleep(4000);
        List<WebElement> MastersLink = driver.findElements(By.xpath("//ul/li/a[contains(@href,'manage-global-master-files')]"));
        System.out.println("ActiveLinksInGlobalMasterFiles ----------->>>: " + MastersLink.size());
        for (int i = 0; i < MastersLink.size(); i++) {
            System.out.println(MastersLink.get(i).getText());
        }
    }

    public void activeLinkEntitySetFiles() throws InterruptedException {
        Thread.sleep(4000);
        entitySetUps.click();
        Thread.sleep(4000);
        List<WebElement> EntiFilesLink = driver.findElements(By.xpath("//ul/li/a[contains(@href,'entity-setup')]"));
        System.out.println("ActiveLinksInEntitySetFiles---------------->>>:  " + EntiFilesLink.size());
        for (int i = 0; i < EntiFilesLink.size(); i++) {
            System.out.println(EntiFilesLink.get(i).getText());
        }
    }
}
