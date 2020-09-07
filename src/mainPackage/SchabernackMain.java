package mainPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SchabernackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver", "/Schabernack/dependencies/geckodriver");
		WebDriver driver = new FirefoxDriver();
		System.out.println("schabernack");
	}

}
