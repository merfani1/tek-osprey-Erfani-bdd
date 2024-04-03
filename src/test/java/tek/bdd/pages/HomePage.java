package tek.bdd.pages;

import org.openqa.selenium.By;

public class HomePage {

    //Constant Variable POM approach.
    //Constant Variable naming convention. all letter uppercase
    //and _ instead of space.
    public static final By TOP_NAV_LOG= By.className("top-nav__logo");
    public static final By SING_IN_BUTTON=By.id("signinLink");
    public static final By ACCOUNT_LINK=By.linkText("Account");

}
