package seleniumdesign.test.factory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import seleniumdesign.factory.GoogleFactory;
import seleniumdesign.factory.GooglePage;
import seleniumdesign.test.BaseTest;

public class GoogleSearchTest extends BaseTest {
    private GooglePage googlePage;

    @Test(dataProvider = "getData")
    public void searchTest(String language, String keyword){
        this.googlePage = GoogleFactory.get(language, this.driver);
        this.googlePage.launchSite();
        this.googlePage.search(keyword);
        int resultCount = this.googlePage.getResultsCount();
        System.out.println("Result Count : "+ resultCount);
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"ENG","selenium"},
                {"FR","design pattern"},
                {"SA","docker"},
                {"ES","selenium"}
        };
    }
}
