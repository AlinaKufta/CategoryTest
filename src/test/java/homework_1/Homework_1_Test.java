package homework_1;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_1_Test {

private static WebDriver driver;

@BeforeClass
    public static void setUp(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://automationpractice.com");
    }

    @Test
    public void checkCategoryPage() {

        String expectedCategoryName = "Women";

        WebElement womanCategoryButton = driver.findElement(By.xpath("//a[@title='Women']"));
        womanCategoryButton.click();

        WebElement categoryName = driver.findElement(By.xpath("//span[@class='category-name']"));
        String actualCategoryName = categoryName.getText();

        Assert.assertEquals(expectedCategoryName, actualCategoryName);
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
