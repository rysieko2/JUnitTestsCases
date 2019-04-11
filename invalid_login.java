import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;
public class invalid_login {

    WebDriver driver;

    String userNameId = "username";
    String passwordId = "password";
    String submitButton ="_submit";
    String submitMsg = "//span";
    String submitWrongData ="/html/body/div/div[1]";
    String userLoggedIn ="user-name";
    String goodUser = "kordecki.k@gmail.com";
    String badUser = "codersguru";
    String goodPassword = "codersguru";
    String badPassword = "kordecki.k@gmail.com";

    @Before
    public void setUp() {

        System.setProperty("webdriver.gecko.driver", "rsc/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://tester.codersguru.pl/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void EmptyPassword() {
        System.out.println("   ---   I test Empty Pasword   ---   ");
        WebElement userNameField = driver.findElement(By.id(userNameId));
        if (userNameField.isDisplayed()) {
            userNameField.click();
            userNameField.clear();
            userNameField.sendKeys(goodUser);
            System.out.println("I write to the field with id=" + userNameId + " value '" + goodUser +"'");
        } else {
            System.out.println("The field with id=" + userNameId + " doesn't exist");
            Assert.fail();
        }
        WebElement passwordField = driver.findElement(By.id(passwordId));
        if (passwordField.isDisplayed()) {
            passwordField.click();
            passwordField.clear();
            System.out.println("I clear the field with id=" + passwordId);
        } else {
            System.out.println("The field with id=" + passwordId + " doesn't exist");
            Assert.fail();
        }
        WebElement submitButtonField = driver.findElement(By.id(submitButton));
        submitButtonField.click();
        WebElement link = driver.findElement(By.xpath(submitMsg));
        String textLinku = link.getText();
        String expectedTekst = "To pole jest wymagane";
        System.out.println("The text of the link '" + textLinku +"'");
        assertTrue(textLinku.equals(expectedTekst));
        System.out.println("The user has been correctly not logged in! - PASS!!!");
    }

    @Test
    public void EmptyUsername() {
        System.out.println("   ---   I test Empty Username   ---   ");
        WebElement userNameField = driver.findElement(By.id(userNameId));
        if (userNameField.isDisplayed()) {
            userNameField.click();
            userNameField.clear();
            System.out.println("I clear the field with id=" + userNameId);
        } else {
            System.out.println("The field with id=" + userNameId + " doesn't exist");
            Assert.fail();
        }
        WebElement passwordField = driver.findElement(By.id(passwordId));
        if (passwordField.isDisplayed()) {
            passwordField.click();
            passwordField.clear();
            passwordField.sendKeys(goodPassword);
            System.out.println("I write to the field with id=" + passwordId + " value '" + goodPassword +"'");
        } else {
            System.out.println("The field with id:'" + passwordId + "' doesn't exist");
            Assert.fail();
        }
        WebElement submitButtonField = driver.findElement(By.id(submitButton));
        submitButtonField.click();
        submitButtonField.click();
        WebElement link = driver.findElement(By.xpath(submitMsg));
        String textLinku = link.getText();
        String expectedTekst = "To pole jest wymagane";
        System.out.println("The text of the link '" + textLinku + "'");
        assertTrue(textLinku.equals(expectedTekst));
        System.out.println("The user has been correctly not logged in! - PASS!!!");
    }

    @Test
    public void EmptyUsernameAndPassword() {
        System.out.println("   ---   I test Empty Username And Password   ---   ");
        WebElement userNameField = driver.findElement(By.id(userNameId));
        if (userNameField.isDisplayed()) {
            userNameField.click();
            userNameField.clear();
            System.out.println("I clear the field with id=" + userNameId);
        } else {
            System.out.println("The field with id=" + userNameId + " doesn't exist");
            Assert.fail();
        }
        WebElement passwordField = driver.findElement(By.id(passwordId));
        if (passwordField.isDisplayed()) {
            passwordField.click();
            passwordField.clear();
            System.out.println("I clear the field with id=" + passwordId);
        } else {
            System.out.println("The field with id=" + passwordId + " doesn't exist");
            Assert.fail();
        }
        WebElement submitButtonField = driver.findElement(By.id(submitButton));
        submitButtonField.click();
        submitButtonField.click();
        WebElement link = driver.findElement(By.xpath(submitMsg));
        String textLinku = link.getText();
        String expectedTekst = "To pole jest wymagane";
        System.out.println("The text of the link '" + textLinku + "'");
        assertTrue(textLinku.equals(expectedTekst));
        System.out.println("The user has been correctly not logged in! - PASS!!!");
    }
    @Test
    public void InvalidUsername() {
        System.out.println("   ---   I test Invalid Username   ---   ");
        WebElement userNameField = driver.findElement(By.id(userNameId));
        if (userNameField.isDisplayed()) {
            userNameField.click();
            userNameField.clear();
            userNameField.sendKeys(badUser);
            System.out.println("I write to the field with id=" + userNameId + " value '" + badUser +"'");
        } else {
            System.out.println("The field with id=" + userNameId + " doesn't exist");
            Assert.fail();
        }
        WebElement passwordField = driver.findElement(By.id(passwordId));
        if (passwordField.isDisplayed()) {
            passwordField.click();
            passwordField.clear();
            passwordField.sendKeys(goodPassword);
            System.out.println("I write to the field with id=" + passwordId + " value '" + goodPassword +"'");
        } else {
            System.out.println("The field with id:'" + passwordId + "' doesn't exist");
            Assert.fail();
        }
        WebElement submitButtonField = driver.findElement(By.id(submitButton));
        submitButtonField.click();
        WebElement link = driver.findElement(By.xpath(submitWrongData));
        String textLinku = link.getText();
        String expectedTekst = "Nieprawidłowe dane.";
        System.out.println("The text of the link '" + textLinku +"'");
        assertTrue(textLinku.equals(expectedTekst));
        System.out.println("The user has been correctly not logged in! - PASS!!!");
    }
    @Test
    public void InvalidPassword() {
        System.out.println("   ---   I test Invalid Password   ---   ");
        WebElement userNameField = driver.findElement(By.id(userNameId));
        if (userNameField.isDisplayed()) {
            userNameField.click();
            userNameField.clear();
            userNameField.sendKeys(goodUser);
            System.out.println("I write to the field with id=" + userNameId + " value '" + goodUser +"'");
        } else {
            System.out.println("The field with id=" + userNameId + " doesn't exist");
            Assert.fail();
        }
        WebElement passwordField = driver.findElement(By.id(passwordId));
        if (passwordField.isDisplayed()) {
            passwordField.click();
            passwordField.clear();
            passwordField.sendKeys(badPassword);
            System.out.println("I write to the field with id=" + passwordId + " value '" + badPassword +"'");
        } else {
            System.out.println("The field with id:'" + passwordId + "' doesn't exist");
            Assert.fail();
        }
        WebElement submitButtonField = driver.findElement(By.id(submitButton));
        submitButtonField.click();
        WebElement link = driver.findElement(By.xpath(submitWrongData));
        String textLinku = link.getText();
        String expectedTekst = "Nieprawidłowe dane.";
        System.out.println("The text of the link '" + textLinku +"'");
        assertTrue(textLinku.equals(expectedTekst));
        System.out.println("The user has been correctly not logged in! - PASS!!!");
    }
    @Test
    public void InvalidUsernameAndPassword() {
        System.out.println("   ---   I test Invalid Username And Password   ---   ");
        WebElement userNameField = driver.findElement(By.id(userNameId));
        if (userNameField.isDisplayed()) {
            userNameField.click();
            userNameField.clear();
            userNameField.sendKeys(badUser);
            System.out.println("I write to the field with id=" + userNameId + " value '" + badUser +"'");
        } else {
            System.out.println("The field with id=" + userNameId + " doesn't exist");
            Assert.fail();
        }
        WebElement passwordField = driver.findElement(By.id(passwordId));
        if (passwordField.isDisplayed()) {
            passwordField.click();
            passwordField.clear();
            passwordField.sendKeys(badPassword);
            System.out.println("I write to the field with id=" + passwordId + " value '" + badPassword +"'");
        } else {
            System.out.println("The field with id:'" + passwordId + "' doesn't exist");
            Assert.fail();
        }
        WebElement submitButtonField = driver.findElement(By.id(submitButton));
        submitButtonField.click();
        WebElement link = driver.findElement(By.xpath(submitWrongData));
        String textLinku = link.getText();
        String expectedTekst = "Nieprawidłowe dane.";
        System.out.println("The text of the link '" + textLinku +"'");
        assertTrue(textLinku.equals(expectedTekst));
        System.out.println("The user has been correctly not logged in! - PASS!!!");
    }
    @Test
    public void ValidUsernameAndPassword() {
        System.out.println("   ---   I test Valid Username And Password   ---   ");
        WebElement userNameField = driver.findElement(By.id(userNameId));
        if (userNameField.isDisplayed()) {
            userNameField.click();
            userNameField.clear();
            userNameField.sendKeys(goodUser);
            System.out.println("I write to the field with id=" + userNameId + " value '" + goodUser + "'");
        } else {
            System.out.println("The field with id=" + userNameId + " doesn't exist");
            Assert.fail();
        }
        WebElement passwordField = driver.findElement(By.id(passwordId));
        if (passwordField.isDisplayed()) {
            passwordField.click();
            passwordField.clear();
            passwordField.sendKeys(goodPassword);
            System.out.println("I write to the field with id=" + passwordId + " value '" + goodPassword + "'");
        } else {
            System.out.println("The field with id:'" + passwordId + "' doesn't exist");
            Assert.fail();
        }
        WebElement submitButtonField = driver.findElement(By.id(submitButton));
        submitButtonField.click();
        WebElement userLoggedInField = driver.findElement(By.id(userLoggedIn));
        if (userLoggedInField.isDisplayed()) {
            System.out.println("The user has been correctly logged in! - PASS!!!");
        } else {
            System.out.println("The user has been not logged in! - FAIL!!!");
            Assert.fail();
        }
    }
    @After
    public void exit () {
     //   driver.quit();
    }
}





