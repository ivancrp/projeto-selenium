package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.ProcessosProtocolosPage;
import runner.base_class.BaseSteps;
import java.util.List;

public class ProcessosProtocolosSteps extends BaseSteps {
    ProcessosProtocolosPage paginaPesquisa = new ProcessosProtocolosPage();


    @Dado("que o usuario esta na pagina de pesquisa")
    public void que_o_usuario_esta_na_pagina_de_pesquisa() {
        paginaPesquisa.abrir();
        screenshot();
    }

    @Quando("o usuario preeche a pequisa com {string}")
    public void o_usuario_preeche_a_pequisa_com(String _pesquisa) {
        paginaPesquisa.preencherCampoPesquisa(_pesquisa);
        screenshot();
    }

    @Quando("o usuario clica no botao Buscar")
    public void o_usuario_clica_no_botao_pesquisar() {
       
    }

    @Quando("o usuario clica no botao BUSCAR")
    public void o_usuario_clica_no_botao_buscar() {
    	 paginaPesquisa.clicarBtnPesquisar();
    }

    @Entao("o sistema redireciona para a pagina de {string}")
    public void o_sistema_redireciona_para_a_pagina_de(String string) throws InterruptedException {
    	Thread.sleep(3000);
    	String msn =  paginaPesquisa.resultasdos();
		Assert.assertEquals(string, msn);
		screenshot();
    }

    

}
