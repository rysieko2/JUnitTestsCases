import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class test_registration_form {                                           //publiczna klasa

    WebDriver driver;                                                           // utworzenie zmiennej driver typu klasy WebDriver

    @Before
    public void setup(){                                                          //nazwa publicznej metody

        System.setProperty("webdriver.gecko.driver","rsc/geckodriver.exe");
        driver = new FirefoxDriver();                                             //stworznie obiektu
        driver.manage().window().maximize();
        driver.get("https://aavtrain.com/create_user.asp");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void registration(){
        WebElement firstNameField = driver.findElement(By.name("first_name"));
        firstNameField.sendKeys("Zbigniew");

        WebElement lastNameField = driver.findElement(By.name("last_name"));
        lastNameField.sendKeys("Nowicki");

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("nowicki@gmail.com");

        WebElement user_nameField = driver.findElement(By.name("user_name"));
        user_nameField.sendKeys("nowicki123");

        WebElement address1Field = driver.findElement(By.name("address1"));
        address1Field.sendKeys("Kiełbaśnicza 4/5");

        WebElement address2Field = driver.findElement(By.name("address2"));
        address2Field.sendKeys("Gmina Krzyki");

        WebElement phoneField = driver.findElement(By.name("phone"));
        phoneField.sendKeys("777 777 777");

        WebElement cityField = driver.findElement(By.name("city"));
        cityField.sendKeys("Wrocław");

        WebElement provField = driver.findElement(By.name("prov"));
        provField.sendKeys("CA");

        WebElement zipField = driver.findElement(By.name("zip"));
        zipField.sendKeys("52129");

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("trudneHasło1@!");

        WebElement submitField = driver.findElement(By.name("Submit"));
        submitField.click();


    }

    @After
    public void close(){
     //   driver.close();

    }



}
