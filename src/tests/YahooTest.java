package tests;

//import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest {
	WebDriver driver;
	@Before
		public void setUp() throws Exception {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
									}

	@After
		public void tearDown() throws Exception {
			driver.close();
								}

	@Test
		public void test() {
			driver.get("http://www.yahoo.com");
			System.out.println(driver.getTitle());
		
	}

}
