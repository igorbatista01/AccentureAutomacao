package drivers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverWeb {
	
	private static WebDriver driver = null;
	private static ChromeOptions options = new ChromeOptions();
	static Properties properties = new Properties();
	
	private DriverWeb() {}
	
	public static WebDriver getDriver() {
		if(driver == null) {
			
			try {
				properties.load(new FileInputStream("config/configuration.properties"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String url = properties.getProperty("url");
			System.out.println(url);
			
			options.addArguments("--no-sandbox");
			options.addArguments("--enable-precise-memory-info");
			options.addArguments("--start-maximized");
			options.addArguments("--ignore-certificate-errors");
			options.addArguments("--disable-popup-blocking");
			options.addArguments("--disable-gpu");
			//options.addArguments("--incognito");
			
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			//driver.manage().window().maximize();
			driver = (options != null) ? new ChromeDriver(options) : new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get(url);
			
			System.out.println("driver setado");
			return driver;
		}
		else {
			System.out.println("driver chamado");
			return driver;
		}
	}
	
	public static WebDriver finalizar() {
		if(driver!=null) {
			driver.quit();
			
			try {
				Process process = Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
				@SuppressWarnings("resource")
				Scanner leitor = new Scanner(process.getInputStream());
				while (leitor.hasNextLine()) {
					System.out.println(leitor.nextLine());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			driver = null;
		}
		return driver;
	}
	
	public static void abreUrl(String url) {
		driver.get(url);
	}
}
