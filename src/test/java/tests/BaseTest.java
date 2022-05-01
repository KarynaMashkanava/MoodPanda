package tests;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import staticdata.WebTimeouts;
import staticdata.WebUrls;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class BaseTest {

    protected static final String EMAIL = "karyna.mashkanava@gmail.com";
    protected static final String PASSWORD = "11235813";

    @BeforeClass
    public void setUp() {
        Configuration.timeout = WebTimeouts.ELEMENT_LOAD_TIMEOUT;
        Configuration.baseUrl = WebUrls.BASE_URL;
        Configuration.startMaximized = true;
    }

    @AfterClass
    public void tearDown() {
        closeWebDriver();
    }

}
