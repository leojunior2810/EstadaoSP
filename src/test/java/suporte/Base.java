package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;



public class Base {

    public static  WebDriver createChrome(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver nav = new ChromeDriver(cap);
        nav.get("https://www.estadao.com.br");
        nav.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return nav;
    }

    public static WebDriver createFirefox() {
        WebDriver navFirefox = new FirefoxDriver();
        navFirefox.get("https://www.estadao.com.br");
        return navFirefox;
    }
}
