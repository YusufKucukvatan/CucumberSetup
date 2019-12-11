package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CalendarPageSteps extends PageBase{

//    @Given("^User is already on Home Page$")
//    public void user_is_already_on_home_page() {
//        initilization();
//        login();
//        String expectedTitle="Cogmento CRM";
//        String actualTitle=driver.getTitle();
//        Assert.assertEquals(expectedTitle,actualTitle, "Title not matched");
//    }
//
//    @When("^User clicks on Calendar button$")
//    public void user_clicks_on_new_calendar_button() {
//        menuNavigation("Calendar");
//    }
//
//
//    @Then("^User lands on Calendar Page$")
//    public void user_lands_on_calendar_page() {
//        String logoText= driver.findElement(By.xpath("//div[text()='Calendar']")).getText();
//        Assert.assertEquals(logoText,"Calendar", "Logo not matched");
//
//    }
//    @When("^User clicks on New button$")
//    public void user_clicks_on_new_button() {
//        WebElement newButton= driver.findElement(By.xpath("//button[text()='New']"));
//        newButton.click();
//
//    }
//
//    @Then("^User lands on Create New Event Page$")
//    public void user_lands_on_create_new_event_page() {
//        String logoText=driver.findElement(By.xpath("//button[text()='Create new Event']")).getText();
//        Assert.assertEquals(logoText,"Create new Event", "Logo not matched");
//
//    }
//
//    @Then("^User inserts the information and click Save button$")
//    public void user_inserts_the_information_and_click_save_button() {
//        WebElement title= driver.findElement(By.name("title"));
//        title.sendKeys("Cucumber Intro Lesson");
//        WebElement category= driver.findElement(By.name("category"));
//        category.click();
//        for (int i = 0; i < 4; i++) {
//            category.sendKeys(Keys.ARROW_DOWN);
//        }
//        category.sendKeys(Keys.ENTER);
//        WebElement location= driver.findElement(By.name("location"));
//        location.sendKeys("Fortran");
//        WebElement save= driver.findElement(By.xpath("//button[text()='Save']"));
//        save.click();
//    }
//
//    @Then("^User lands on recently created event page$")
//    public void user_lands_on_recently_created_event_page() {
//        String logoText= driver.findElement(By.xpath("//div[text()='Cucumber Intro Lesson']")).getText();
//        Assert.assertEquals(logoText,"Cucumber Intro Lesson", "Logo not matched");
//        driver.quit();
//    }

}
