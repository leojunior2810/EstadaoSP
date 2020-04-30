package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExAssinantePage {
    private WebDriver nav;

    public ExAssinantePage(WebDriver nav) {
        this.nav = nav;
    }


    public ExAssinantePage formLoginExAssinante() {
        nav.findElement(By.id("email_login")).sendKeys("virtualsabino@estadao.com.br");
        nav.findElement(By.id("senha")).sendKeys("3s7@DAO");
        return this;
    }

    public ExAssinantePage acessarExAssinante() {
        nav.findElement(By.id("btn-login")).click();
        return this;
    }

}
