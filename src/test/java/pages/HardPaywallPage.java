package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class HardPaywallPage {
    private WebDriver nav;

    public HardPaywallPage(WebDriver nav) {
        this.nav = nav;
    }

    public HardPaywallPage clickExAssinante() throws InterruptedException {
        nav.switchTo().frame("paywall-iframe-estadao");
        nav.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/a[1]")).click();
        sleep(5000);
        return this;
    }

    public HardPaywallPage formExAssinante() throws InterruptedException {
        nav.switchTo().frame("paywall-iframe-estadao");
        nav.findElement(By.id("email")).sendKeys("virtualsabino@estadao.com.br");
        nav.findElement(By.id("password")).sendKeys("3s7@DA0");
        nav.findElement(By.id("connect")).click();
        sleep(5000);
        return this;
    }
}
