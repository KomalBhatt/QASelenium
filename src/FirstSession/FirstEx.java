package FirstSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/");
		
		
	}

}
