package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static waits.WaitForElement.waitUntilElementIsVisible;

public class LandingPage extends BasePage {

    @FindBy(className = "header__search")
    private WebElement searchBar;

    @Step("Is search bar displayed on landing page?")
    public boolean isSearchBarDisplayed() {
        waitUntilElementIsVisible(searchBar);
        boolean isDisplayed = searchBar.isDisplayed();
        log().info("Returning status of search bar after visiting landing page: " + isDisplayed);
        return isDisplayed;
    }
}