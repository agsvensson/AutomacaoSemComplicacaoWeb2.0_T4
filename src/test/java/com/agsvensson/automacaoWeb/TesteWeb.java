package com.agsvensson.automacaoWeb;

import com.agsvensson.core.Driver;
import com.agsvensson.enums.Browser;
import com.agsvensson.pages.CursoPage;
import com.agsvensson.pages.PrincipalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TesteWeb {
    Driver driverWeb;
    WebDriver driver;
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void inicializaTeste() {
        driverWeb = new Driver(Browser.CHROME);
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);
    }

    @Test
    public void primeiroTeste() {
        String titulo = principalPage.getTitulo();
        assertEquals("Porque Tempo É Conhecimento.", titulo);
    }

    @Test
    public void segundoTeste() {
        cursoPage = new CursoPage(driver);
        principalPage.clickBotao();
        String titulo = cursoPage.getTitulo2();

        assertEquals("Conheça todos os nossos cursos.", titulo);
    }

    @After
    public void finalizaTeste() {
        driver.quit();
    }
}
