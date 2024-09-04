package PMSLoginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordTest {

    @FindBy(name = "usename")
    WebElement EnterEmail;

    @FindBy(tagName = "button")
    WebElement SendInstrButton;
    @FindBy(id = "toast-container")
    WebElement resetEmailLink;

    @FindBy(xpath = "//div[contains(text(),'Email address pattern is invalid.')]")
    WebElement InvalidEmailAdress;

    public ForgotPasswordTest(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setEmailaddres(String username) {
        EnterEmail.sendKeys(username);
    }

    public void setSendInstrButton() {
        SendInstrButton.click();
    }

    public String resetEmailLink() {
        String AccMessage = resetEmailLink.getText();
        return AccMessage;
    }

    public String setInvalidEmailAdress() {
        String InvalidEmail = InvalidEmailAdress.getText();
        return InvalidEmail;
    }
}
