package apresentacao.testes.fluxo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import apresenracao.pages.NavegadorPage;

public class TesteFluxo {
	private WebDriver driver;
	private NavegadorPage navegador;

	@Before
	public void inicializa() { // metodo para selecionar em qual navegador deseja testar
//		selecionaChrome("webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
		selecionaFirefox("webdriver.gecko.driver", "C:/geckodriver-v0.19.1-win64/geckodriver.exe");
		
	}

//	@After
//	public void finaliza() {
//		driver.close();
//	}

	@Test
	public void criaContaGmail() {
		navegador.carregaPaginaCadastroGoogle();
		navegador.preencheDadosGmail();
		navegador.selecionaProximaEtapa();
		navegador.aceitaTermos();
		navegador.prosseguirParaGmail();
		navegador.verificaBannerBoasVindas();
		
		
	}

	void selecionaChrome(String keyProperty, String pathProperty) {
		System.setProperty(keyProperty, pathProperty);
		driver = new ChromeDriver();
		this.navegador = new NavegadorPage(driver);
	}	
	
	void selecionaFirefox(String keyProperty, String pathProperty) {
		System.setProperty(keyProperty, pathProperty);
		driver = new FirefoxDriver();
		this.navegador = new NavegadorPage(driver);
		
	}
}
