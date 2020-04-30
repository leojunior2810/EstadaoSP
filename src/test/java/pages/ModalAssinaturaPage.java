package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;



public class ModalAssinaturaPage {
    private WebDriver nav;
    Faker faker = new Faker();

    public ModalAssinaturaPage(WebDriver nav) {
        this.nav = nav;
    }

    public ModalAssinaturaPage assinar() {
        nav.findElement(By.linkText("Assine o Estadão")).click();
        ArrayList<String> tabs = new ArrayList<String> (nav.getWindowHandles());
        nav.switchTo().window(tabs.get(1));
        return this;
    }

    public ModalAssinaturaPage tabCadastrar() {
        nav.findElement(By.cssSelector("div[data-tab=\"2\"]")).click();
        return this;
    }

    public ModalAssinaturaPage selecionarAssinatura2() {
        nav.findElement((By.cssSelector("a[data-teste=\"testeid_btn_impresso_digital\"]"))).click();
        return this;
    }

    public ModalAssinaturaPage FormNovoUsuario() {
        nav.findElement(By.id("firstname")).sendKeys(faker.name().firstName());
        nav.findElement(By.id("lastname")).sendKeys(faker.name().lastName());
        nav.findElement(By.id("email")).sendKeys(faker.internet().emailAddress());
        nav.findElement(By.id("password")).sendKeys(faker.internet().password());
        return this;
    }

    public ModalAssinaturaPage botaoCadastrar() {
        nav.findElement(By.id("go-entrega")).click();
        return this;
    }

}
