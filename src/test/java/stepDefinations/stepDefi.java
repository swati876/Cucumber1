package stepDefinations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepDefi {

    WebDriver driver;

        @Given("^User can launch the browser for google search$")
        public void user_can_launch_the_browser_for_google_search() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rscha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        }

        @Then("^Enter the data in the text field$")
        public void enter_the_data_in_the_text_field() throws Throwable {
        driver.get("http://www.google.com");
        }

        @Then("^User clicked enter$")
        public void user_clicked_enter() throws Throwable {
        driver.close();
        }
    }


