import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;

public class registration_form {

    WebDriver driver;

    String nameId = "first-name";
    String lastnameId = "last-name";
    String male = "/html/body/div/div/form/div[3]/div/div/label[1]";
    String female = "/html/body/div/div/form/div[3]/div/div/label[2]";
    String inBeetwen = "/html/body/div/div/form/div[3]/div/div/label[3]";
    String dateOfBirth = "dob";
    String address = "address";
    String email = "email";
    String password = "password";
    String company = "company";
    String role = "role";
    String expectation = "expectation";
    String readBooks = "/html/body/div/div/form/div[11]/div/div[1]/label/input";
    String TakeOnlineCourses = "//*[@id=\"infoForm\"]/div[11]/div/div[2]/label/input";
    String contributeToOpensourceProjects = "//*[@id=\"infoForm\"]/div[11]/div/div[3]/label";
    String joinTechCons = "/html/body/div/div/form/div[11]/div/div[4]/label";
    String readTechBlogs = "//*[@id=\"infoForm\"]/div[11]/div/div[5]/label";
    String viaDiscoveryAndExperiment = "//*[@id=\"infoForm\"]/div[11]/div/div[6]/label";
    String comment = "comment";
    String submitMsg = "submit-msg";
    String submitButtonId = "submit";

    String firstNameErrorId = "first-name-error";
    String lastNameErrorId = "last-name-error";
    String maleErrorId = "gender-error";
    String dateOfBirthErrorId = "dob-error";
    String addressErrorId = "address-error";
    String emailErrorId = "email-error";
    String passwordErrorId = "password-error";
    String companyErrorId = "company-error";

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "rsc/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testValidUserRegistration() {
        System.out.println("   ----   Test Valid User Registration   ---   ");
        WebElement nameField = driver.findElement(By.id(nameId));                                   //do zmiennej 'nameField' wpisuję wyszukany element przez id: 'nameId'
        if (nameField.isDisplayed()) {                                                              //jeżeli element 'nameField' jest 'podany' wykona się instrukcja IF
            nameField.click();                                                                      //kliknięcie w element
            nameField.clear();                                                                      //wyczyszczenie elementu
            nameField.sendKeys("Zbigniew");                                          //wpisanie tekstu do elementu
            System.out.println("I write to the field with id=" + nameId + " value 'Zbigniew'");     //wyświetlenie napisu na ekranie
        }else {
            System.out.println("The field with id=" + nameId + " doesn't exist");
            Assert.fail();                                                                          //Asercja przerywająca test z wynikiem negatywnym
        }
        WebElement lastnameField = driver.findElement(By.id(lastnameId));
        if (lastnameField.isDisplayed()) {
            lastnameField.click();
            lastnameField.clear();
            lastnameField.sendKeys("Kowalski");
            System.out.println("I write to the field with id=" + lastnameId + " value 'Kowalski'");
        }else {
            System.out.println("The field with id=" + lastnameId + " doesn't exist");
            Assert.fail();
        }
        WebElement maleField = driver.findElement(By.xpath(male));
        if (maleField.isDisplayed()){
        maleField.click();
            System.out.println("I choose the field with xpath=" + male);
        }else{
            System.out.println("The field with xpath=" + male + " doesn't exist");
          Assert.fail();
        }
        WebElement femaleField = driver.findElement(By.xpath(female));
        if (femaleField.isDisplayed()) {
        }else{
            System.out.println("The field with xpath=" + female + " doesn't exist");
            Assert.fail();
        }
        WebElement inBeetwenField = driver.findElement(By.xpath(inBeetwen));
        if (inBeetwenField.isDisplayed()){
        }else{
            System.out.println("The field with xpath=" + inBeetwen + " doesn't exist");
            Assert.fail();
        }
        WebElement dateOfBirthField = driver.findElement(By.id(dateOfBirth));
        if (dateOfBirthField.isDisplayed()) {
            dateOfBirthField.click();
            dateOfBirthField.clear();
            dateOfBirthField.sendKeys("07/27/1983");
            System.out.println("I write to the field with id=" + dateOfBirth + " value '07/27/1983'");
        }else {
            System.out.println("The field with id=" + dateOfBirth + " doesn't exist");
            Assert.fail();
        }
        WebElement addressField = driver.findElement(By.id(address));
        if (addressField.isDisplayed()) {
            addressField.click();
            addressField.clear();
            addressField.sendKeys("Świebodzka");
            System.out.println("I write to the field with id=" + address + " value 'Świebodzka'");
        }else {
            System.out.println("The field with id=" + address + " doesn't exist");
            Assert.fail();
        }
        WebElement emailField = driver.findElement(By.id(email));
        if (emailField.isDisplayed()) {
            emailField.click();
            emailField.clear();
            emailField.sendKeys("kordecki.k@gmail.com");
            System.out.println("I write to the field with id=" + email + " value 'kordecki.k@gmail.com'");
        }else {
            System.out.println("The field with id=" + email + " doesn't exist");
            Assert.fail();
        }
        WebElement passwordField = driver.findElement(By.id(password));
        if (passwordField.isDisplayed()) {
            passwordField.click();
            passwordField.clear();
            passwordField.sendKeys("123!@");
            System.out.println("I write to the field with id=" + password + " value '123!@'");
        }else {
            System.out.println("The field with id=" + password + " doesn't exist");
            Assert.fail();
        }
        WebElement companyField = driver.findElement(By.id(company));
        if (companyField.isDisplayed()) {
            companyField.click();
            companyField.clear();
            companyField.sendKeys("CodersLab");
            System.out.println("I write to the field with id=" + company + " value 'CodersLab'");
        }else {
            System.out.println("The field with id=" + company + " doesn't exist");
            Assert.fail();
        }
        Select roleFiled = new Select(driver.findElement(By.id(role)));
   //       roleFiled.deselectAll();
        roleFiled.selectByVisibleText("Manager");
        System.out.println("I choose the field with id=" + company + " value 'Manager'");

        Select expectationFiled = new Select(driver.findElement(By.id(expectation)));
        expectationFiled.selectByVisibleText("High salary");
        System.out.println("I choose the field with id=" + expectation + " value 'High salary'");

        WebElement readBooksField = driver.findElement(By.xpath(readBooks));
        readBooksField.click();
        System.out.println("I choose the field with xpath=" + readBooks + " value 'Read books");

        WebElement TakeOnlineCoursesField = driver.findElement(By.xpath(TakeOnlineCourses));
        TakeOnlineCoursesField.click();
        System.out.println("I choose the field with xpath=" + TakeOnlineCourses + " value 'Take online courses'");

        WebElement contributeToOpensourceProjectsField = driver.findElement(By.xpath(contributeToOpensourceProjects));
        contributeToOpensourceProjectsField.click();
        System.out.println("I choose the field with xpath=" + contributeToOpensourceProjects + " value 'Contribute to opensource projects'");

        WebElement joinTechConsField = driver.findElement(By.xpath(joinTechCons));
        joinTechConsField.click();
        System.out.println("I choose the field with xpath=" + joinTechCons + " value 'Join tech cons'");

        WebElement readTechBlogsField = driver.findElement(By.xpath(readTechBlogs));
        readTechBlogsField.click();
        System.out.println("I choose the field with id=" + readTechBlogs + " value 'Read tech blogs'");

        WebElement viaDiscoveryAndExperimentField = driver.findElement(By.xpath(viaDiscoveryAndExperiment));
        viaDiscoveryAndExperimentField.click();
        System.out.println("I choose the field with xpath=" + viaDiscoveryAndExperiment + " value 'Via discovery and experiment'");

        WebElement commentField = driver.findElement(By.id(comment));
        if(commentField.isDisplayed()) {
            commentField.click();
            commentField.clear();
            commentField.sendKeys("I gitara!!!");
            System.out.println("I write to the field with id=" + comment + " value 'I gitara!!!'");
        }else {
            System.out.println("The field with id=" + comment + " doesn't exist");
            Assert.fail();
        }
        WebElement submitButtonIdField = driver.findElement(By.id(submitButtonId));
        submitButtonIdField.click();
        WebElement link = driver.findElement(By.id(submitMsg));
        String textLink = link.getText();
        String expectedTekst = "Successfully submitted!";
        System.out.println("The text of the link: " + textLink);
        assertTrue(textLink.equals(expectedTekst));
        System.out.println("  ---  Registration was successful - PASS!!!");
    }

    @Test
    public void errorHandling() {
        System.out.println("   ---   Test Error Handling   ---   ");

        driver.findElement(By.id(nameId)).clear();
        driver.findElement(By.id(lastnameId)).clear();
        driver.findElement(By.id(dateOfBirth)).clear();
        driver.findElement(By.id(address)).clear();
        driver.findElement(By.id(email)).clear();
        driver.findElement(By.id(password)).clear();
        driver.findElement(By.id(company)).clear();

        WebElement submitButton = driver.findElement(By.id(submitButtonId));
        submitButton.click();

        WebElement firstNameErrorIdField = driver.findElement(By.id(firstNameErrorId));
        assertTrue(firstNameErrorIdField.isDisplayed());
        System.out.println("The field: '" + nameId + "' doesn't accept empty values correctly - PASS!!!");

        WebElement lastNameErrorIdField = driver.findElement(By.id(lastNameErrorId));
        assertTrue(lastNameErrorIdField.isDisplayed());
        System.out.println("The field: '" + lastNameErrorId + "' doesn't accept empty values correctly - PASS!!!");

        WebElement maleErrorIdField = driver.findElement(By.id(maleErrorId));
        assertTrue(maleErrorIdField.isDisplayed());
        System.out.println("The field: '" + maleErrorId + "' doesn't accept empty values correctly - PASS!!!");

        WebElement dateOfBirthErrorIdField = driver.findElement(By.id(dateOfBirthErrorId));
        assertTrue(dateOfBirthErrorIdField.isDisplayed());
        System.out.println("The field: '" + dateOfBirthErrorId + "' doesn't accept empty values correctly - PASS!!!");

        WebElement addressErrorIdField = driver.findElement(By.id(addressErrorId));
        assertTrue(addressErrorIdField.isDisplayed());
        System.out.println("The field: '" + addressErrorId + "' doesn't accept empty values correctly - PASS!!!");

        WebElement emailErrorIdField = driver.findElement(By.id(emailErrorId));
        assertTrue(emailErrorIdField.isDisplayed());
        System.out.println("The field: '" + emailErrorId + "' doesn't accept empty values correctly - PASS!!!");

        WebElement passwordErrorIdField = driver.findElement(By.id(passwordErrorId));
        assertTrue(passwordErrorIdField.isDisplayed());
        System.out.println("The field: '" + passwordErrorId + "' doesn't accept empty values correctly - PASS!!!");

        WebElement companyErrorIdField = driver.findElement(By.id(companyErrorId));
        assertTrue(companyErrorIdField.isDisplayed());
        System.out.println("The field: '" + companyErrorId + "' doesn't accept empty values correctly - PASS!!!");
    }
    @After
    public void tearDown() {
           driver.quit();
    }
}
