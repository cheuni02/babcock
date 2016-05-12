package modules.Header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import step_definitions.Hooks;

import static common_actions.CommonActions.*;

/**
 * Created by ivan.cheung on 5/12/2016.
 */
public class Menu {

    public Menu (WebDriver driver){
        Hooks.driver = driver;
        PageFactory.initElements(driver,this);
    }

    static By header_banner = By.xpath("//header[@class=\'Header\']");

    public static boolean isHeaderBannerPresent(WebDriver driver){
        return isElementPresent(driver,header_banner);
    }

//
//    def header_banner
//    @browser.header(class: "Header")
//    end
//
//    def banner_central
//    header_banner.div(class: "Header-central")
//    end
//
//    def nav_pane
//    banner_central.nav(class: "Nav")
//    end
//
//    def nav_list
//    nav_pane.ul(class: "Nav-list")
//    end
//
//    def nav_link(name)
//    nav_list.link(class: "Nav-link", data_subnav_title: name)
//    end
//
//    def nav_sublink_container
//    @browser.div(class: "Nav-subListContainer").ul(class: "Nav-subList")
//    end
//
//    def nav_sub_link(name)
//    nav_sublink_container.link(class: "Nav-subLink", href: /#{name}/i)
//    end


}
