package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import suporte.Base;

public class ExAssinanteTest {
    private WebDriver nav;

    @Before
    public void setUp() {
        nav = Base.createChrome();
//        nav = Base.createFirefox();
    }

    @Test
    public void testExAssinante() {
        new HomePage(nav)
                .entrarExAssinante()
                .formLoginExAssinante()
                .acessarExAssinante();



    }

    @After
    public void tearDown() {
        nav.quit();
    }
}
