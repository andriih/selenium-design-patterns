package seleniumdesign.srp.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import seleniumdesign.srp.common.SearchSuggestion;
import seleniumdesign.srp.common.SearchWidget;

public class GoogleMainPage {
    private WebDriver driver;
    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;

    public GoogleMainPage(final WebDriver driver){
        this.driver = driver;
        this.searchWidget = PageFactory.initElements(driver,SearchWidget.class);
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
    }

    public void goTo(){
        this.driver.get("https://www.google.com/webhp?hl=en");
    }

    public SearchWidget getSearchWidget(){
        return searchWidget;
    }

    public SearchSuggestion getSearchSuggestion(){
        return searchSuggestion;
    }



}
