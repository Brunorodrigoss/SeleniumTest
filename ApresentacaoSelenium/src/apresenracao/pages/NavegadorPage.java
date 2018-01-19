package apresenracao.pages;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import apresentacao.constantes.Constantes;

public class NavegadorPage {
	
	private WebDriver driver;
	
	public NavegadorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void carregaPaginaCadastroGoogle() {
		driver.get(Constantes.getPaginaCadastroGoogle());
	}
	
	public void preencheDadosGmail() {
		preencheNomeSobrenome("Nome", "Sobrenome");
		preencheUsuarioGmail("emailcr70weewqwe2");
		preencheSenha("senha123@@");
		preecheConfirmacaoSenha("senha123@@");
		preencheDia("07");
		selecionaMes(5);
		preencheAno("1992");
		preencheSexo(2);
		preencheNumeroCelular("19992367482");
		preencheEmailAtual("email@gmail.com");
		
	}

	public void preencheNomeSobrenome(String nome, String sobrenome) {
		driver.findElement(By.id("FirstName")).sendKeys(nome);
		driver.findElement(By.id("LastName")).sendKeys(sobrenome);
		
	}

	public void preencheUsuarioGmail(String usuarioGmail) {
		driver.findElement(By.id("GmailAddress")).sendKeys(usuarioGmail);
		
	}

	public void preencheSenha(String senha) {
		driver.findElement(By.id("Passwd")).sendKeys(senha);
		
	}

	public void preecheConfirmacaoSenha(String confirmacaoSenha) {
		driver.findElement(By.id("PasswdAgain")).sendKeys(confirmacaoSenha);
		
	}

	public void preencheDia(String dia) {
		driver.findElement(By.id("BirthDay")).sendKeys(dia);
		
	}

	public void selecionaMes(int mes) {
		driver.findElement(By.xpath("//*[@id=\"BirthMonth\"]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\":"+mes+"\"]/div")).click();
		
	}

	public void preencheAno(String ano) {
		driver.findElement(By.id("BirthYear")).sendKeys(ano);
		
	}

	public void preencheSexo(int sexo) {
		driver.findElement(By.xpath("//*[@id=\"Gender\"]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\":f\"]/div")).click();
		
	}

	public void preencheNumeroCelular(String numeroCelular) {
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys(numeroCelular);
		
	}

	public void preencheEmailAtual(String emailAtual) {
		driver.findElement(By.id("RecoveryEmailAddress")).sendKeys(emailAtual);
		
	}

	public void selecionaProximaEtapa() {
		driver.findElement(By.id("submitbutton")).click();

	}

	public void aceitaTermos() {
		while (driver.findElement(By.className("tos-scroll-button-icon")).isDisplayed()) {
			driver.findElement(By.xpath("//*[@id=\"tos-scroll-button\"]/div/img")).click();
		}
		driver.findElement(By.xpath("//*[@id=\"iagreebutton\"]")).click();
//		driver.findElement(By.id("iagreebutton")).click();
			
	}

	public void prosseguirParaGmail() {
		driver.findElement(By.id("iagreebutton")).click();
		
	}

	public void verificaBannerBoasVindas() {
		if (driver.findElement(By.id("gmail-warm-welcome")).isDisplayed()) {
			driver.findElement(By.id("close-button")).click();
		}
		
	}

	public void EscreverEmail() {
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div")).click();
		
	}


	
}
