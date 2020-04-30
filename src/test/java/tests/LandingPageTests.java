package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import page.objects.LandingPage;

import static org.testng.Assert.assertTrue;

public class LandingPageTests extends TestBase {

    @Severity(SeverityLevel.CRITICAL)
    @Test
    @Description("The goal of this test is to open Landing Page and ensure that page was rendered properly.")
    public void openLandingPage() {
        LandingPage landingPage = new LandingPage();
        boolean isSearchBarDisplayed = landingPage
                .isSearchBarDisplayed();

        assertTrue(isSearchBarDisplayed);
    }
}
