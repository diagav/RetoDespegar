package configuration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ShareDriver extends EventFiringWebDriver {

	public static final WebDriver driver; // crea una variable estatica que controla una unica instancia

	static {
		// se inicializan las vbles estaticas
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrive\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public ShareDriver() {
		super(driver);
	}

	// para forzar el cierre de la pagina
	private static final Thread CLOSE_THREAD = new Thread() {
		@Override
		public void run() {
			driver.quit();
		}
	};

	static {
		Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
	}

	@Override
	public void quit() {
		if (Thread.currentThread() != CLOSE_THREAD) {
			throw new UnsupportedOperationException(
					"You shouldn't quit this WebDriver. It's shared and will quit when the JVM exits.");
		}
		super.quit();
	}

}
