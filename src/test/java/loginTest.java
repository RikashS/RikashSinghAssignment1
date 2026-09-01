import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class loginTest
{
    private WebDriver driver;

    @Test
    public void validLoginTest()
    {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }
}
