package tests;


import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import suporte.Base;
import pages.HomePage;

public class CadastroUsuarioTest {
    public WebDriver nav;

    @Before
    public void setUp() {
        nav = Base.createChrome();
//        nav = Base.createFirefox();
    }

    @Test
    public void testCadastroNovoUsuario() throws InterruptedException {
        new HomePage(nav)
                .primeiraMateria()
                .assinar()
                .selecionarAssinatura2()
                .tabCadastrar()
                .FormNovoUsuario()
                .botaoCadastrar();
    }


    @After
    public void tearDown() {
        nav.quit();
    }

}
