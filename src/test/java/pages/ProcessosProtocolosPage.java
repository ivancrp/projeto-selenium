package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;

import runner.base_class.BasePage;

public class ProcessosProtocolosPage extends BasePage {

    private String url = "https://www.tce.ce.gov.br/contexto/#/processos-protocolos";
    private By inputPesquisa = By.xpath("//input[1]");
    //private By btnPesquisar = By.xpath("(/html/body/ion-app/ng-component/ion-split-pane/ion-nav/page-processos-protocolos/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-row[2]/ion-col[2]/button[1]");
    private By resultado = By.xpath("//h2[text()='Resultados']");

    public void abrir() {
        driver.get(url);
    }

    public void preencherCampoPesquisa(String _texto) {
        driver.findElement(inputPesquisa).sendKeys(_texto);
    }

    public void clicarBtnPesquisar() {
        //driver.findElement(btnPesquisar).click();
    	  driver.findElement(inputPesquisa).sendKeys(Keys.ENTER);
    }
    
    public String resultasdos() {
    	return  driver.findElement(resultado).getText().toString();
    	
    }
}
