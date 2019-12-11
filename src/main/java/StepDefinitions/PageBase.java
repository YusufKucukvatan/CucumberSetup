package StepDefinitions;

import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class PageBase{
    WebDriver driver=null;

    public void initilization(){
        driver=Driver.get();
        driver.get(ConfigurationReader.get("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }



    public void login(){
        WebElement loginbtn=driver.findElement(By.xpath("//span[text()='Log In']"));
        loginbtn.click();
        WebElement email=driver.findElement(By.name("email"));
        BrowserUtils.waitForVisibility(email,5);
        WebElement password=driver.findElement(By.name("password"));
        email.sendKeys(ConfigurationReader.get("username"));
        password.sendKeys(ConfigurationReader.get("password"));
        WebElement loginBtn=driver.findElement(By.xpath("//div[@class=\"ui fluid large blue submit button\"]"));
        loginBtn.click();
    }

    public void menuNavigation(String function){
        WebElement functionButton= Driver.get().findElement(By.xpath("//span[text()='"+function+"']"));
        BrowserUtils.waitForClickablility(functionButton, 5);
        functionButton.click();
    }
}
