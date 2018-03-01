package precisionFDA.pages.apps;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Link;
import precisionFDA.locators.AppsLocators;
import precisionFDA.pages.AbstractPage;

public class AppsManageMyAssetsPage extends AbstractPage {

    private final Logger log = Logger.getLogger(this.getClass());

    @FindBy(xpath = AppsLocators.APPS_MANAGE_MY_ASSETS_ACTIVATED_LINK)
    private Link appsManageMyAssetsActivatedLink;

    public AppsManageMyAssetsPage(final WebDriver driver) {
        super(driver);
        waitUntilScriptsReady();
        waitForPageToLoadAndVerifyBy(By.xpath(AppsLocators.APPS_MANAGE_MAIN_TOOLBAR));
    }

    public Link getAppsManageMyAssetsActivatedLink() {
        return appsManageMyAssetsActivatedLink;
    }

    public boolean isManageMyAssetsAcivated() {
        return isElementPresent(getAppsManageMyAssetsActivatedLink());
    }
}
