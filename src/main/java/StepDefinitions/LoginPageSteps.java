package StepDefinitions;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageSteps extends PageBase{


    @Given("^User is already on Login Page$")
    public void user_is_already_on_Login_Page(){
        initilization();
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals("Free CRM #1 cloud software for any business large or small", actualTitle);
    }

    @When("^User clicks on Login button on main page$")
    public void user_clicks_on_Login_button_main_page(){
        WebElement loginbtn=driver.findElement(By.xpath("//span[text()='Log In']"));
        loginbtn.click();
    }

    @Then("^User enters \"(.*)\" and \"(.*)\"$")
    //public void user_enters_username_and_password(){
    public void user_enters_username_and_password(String username1, String password1){
        WebElement email=driver.findElement(By.name("email"));
        WebElement password=driver.findElement(By.name("password"));
        //email.sendKeys(ConfigurationReader.get("username"));
        email.sendKeys(username1);
        //password.sendKeys(ConfigurationReader.get("password"));
        password.sendKeys(password1);
    }
    @Then("^User clicks on login button$")
    public void user_clicks_on_login_button(){
        WebElement loginBtn=driver.findElement(By.xpath("//div[@class=\"ui fluid large blue submit button\"]"));
        loginBtn.click();
    }
    @Then("^User is landing Home Page$")
    public  void user_is_landing_Home_Page() throws InterruptedException {
        String actualTitle=driver.getTitle();
        String expectedTitle="Cogmento CRM";
        Assert.assertEquals(expectedTitle,actualTitle);
        //driver.quit();
        Thread.sleep(2000);
    }
    @Given("^User is already on Home Page$")
    public void user_is_already_on_home_page() {
        String expectedTitle="Cogmento CRM";
        String actualTitle=driver.getTitle();
        org.testng.Assert.assertEquals(expectedTitle,actualTitle, "Title not matched");
    }

    @When("^User clicks on Calendar button$")
    public void user_clicks_on_new_calendar_button() {
        menuNavigation("Calendar");
    }


    @Then("^User lands on Calendar Page$")
    public void user_lands_on_calendar_page() {
        String logoText= driver.findElement(By.xpath("//div[text()='Calendar']")).getText();
        org.testng.Assert.assertEquals(logoText,"Calendar", "Logo not matched");

    }
    @When("^User clicks on New button$")
    public void user_clicks_on_new_button() {
        WebElement newButton= driver.findElement(By.xpath("//button[text()='New']"));
        newButton.click();

    }

    @Then("^User lands on Create New Event Page$")
    public void user_lands_on_create_new_event_page() {
        String logoText=driver.findElement(By.xpath("//div[text()='Create new Event']")).getText();
        org.testng.Assert.assertEquals(logoText,"Create new Event", "Logo not matched");

    }

    @Then("^User inserts the information and click Save button$")
    public void user_inserts_the_information_and_click_save_button() {
        WebElement title= driver.findElement(By.name("title"));
        title.sendKeys("Cucumber Intro");
        WebElement category= driver.findElement(By.name("category"));
        category.click();
        for (int i = 0; i < 4; i++) {
            category.sendKeys(Keys.ARROW_DOWN);
        }
        category.sendKeys(Keys.ENTER);
        WebElement location= driver.findElement(By.name("location"));
        location.sendKeys("Fortran");
        WebElement save= driver.findElement(By.xpath("//button[text()='Save']"));
        save.click();
    }

    @Then("^User lands on recently created event page$")
    public void user_lands_on_recently_created_event_page() {
        String logoText= driver.findElement(By.xpath("//div[text()='Cucumber Intro']")).getText();
        org.testng.Assert.assertEquals(logoText,"Cucumber Intro", "Logo not matched");
        driver.quit();
    }
    //What is "Regular Expression"?
    // instead of username or password use exactly the same as these characters==> \"(.*)\" or ==> \"([^\"]*)\"
    // It passes the data to @Given/When/Then annotation what we write in Examples part of feature file under Scenario steps...
}
