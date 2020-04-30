package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class CanalComprasPage {
    private WebDriver nav;


    public CanalComprasPage(WebDriver nav) {
        this.nav = nav;
    }

    public CanalComprasPage assinatura() {
        nav.findElement(By.linkText("Assine o Estadão")).click();
        ArrayList<String> tabs = new ArrayList<String> (nav.getWindowHandles());
        nav.switchTo().window(tabs.get(1));
        return this;
    }

    public CanalComprasPage selecionarAssinatura() throws InterruptedException {
        nav.findElement((By.cssSelector("a[data-teste=\"testeid_btn_impresso_digital\"]"))).click();
        sleep(3000);
        return this;
    }

}
