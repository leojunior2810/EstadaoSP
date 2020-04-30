package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.*;

public class HomePage {
    private WebDriver nav;
    public HomePage(WebDriver nav) {
        this.nav = nav;
    }

    public ModalAssinaturaPage primeiraMateria() {
        nav.findElement(By.xpath("//*[@id=\"wrapper\"]/section[2]/div/div/div[1]")).click();
        return new ModalAssinaturaPage(nav);
    }

    public CanalComprasPage segundaMateria() {
        nav.findElement(By.xpath("//*[@id=\"wrapper\"]/section[2]/div/div/div[2]/article/div[1]")).click();
        return new CanalComprasPage(nav);
    }

    public ExAssinantePage entrarExAssinante() {
        nav.findElement(By.xpath("//*[@id=\"colunas\"]/section/div/div/div[2]/div/div/div[1]/div/div[1]")).click();

        return new ExAssinantePage(nav);
    }

    public HardPaywallPage acessarColunas() throws InterruptedException {
        sleep(9000);
        JavascriptExecutor jse = (JavascriptExecutor)nav;
        jse.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight," +
                              "document.body.scrollHeight,document.documentElement.clientHeight));");
        nav.findElement(By.xpath("//*[@id=\"colunas\"]/section/div/div/div[2]/div/div/div[1]/div/div[1]/div/a")).click();
        sleep(5000);
        return new HardPaywallPage(nav);
    }


}
