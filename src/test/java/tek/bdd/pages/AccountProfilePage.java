package tek.bdd.pages;

import org.openqa.selenium.By;

public class AccountProfilePage {
    public static final By ACCOUNT_PROFILE_TEXT=By.className("account__personal-title");

    public static final By PROFILE_NAME=By.cssSelector("h1.account__information-username");

    public static final By PROFILE_EMAIL=By.xpath("//h1[@class='account__information-email']");
}
