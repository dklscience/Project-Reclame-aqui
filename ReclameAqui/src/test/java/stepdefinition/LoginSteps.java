package stepdefinition;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import navegador.Navegador;
import objetos.Objetos;


public class LoginSteps {
    Objetos objetos = new Objetos();


    @Dado("^que acesso a pagina inicial do reclame aqui$")
    public void que_acesso_a_pagina_inicial_do_reclame_aqui() throws Throwable {
        Navegador.executarChromedriver();
    }

    @Quando("^coloco dados de acesso$")
    public void coloco_dados_de_acesso() throws Throwable {
        Navegador.acessarPagina();
    }

    @Entao("^acesso com sucesso$")
    public void acesso_com_sucesso() throws Throwable {

    }

    @Dado("^que acesso a página de login$")
    public void que_acesso_a_página_de_login() throws Throwable {
        Navegador.executarChromedriver();
    }

    @Quando("^submeto o meu login sem o cpf$")
    public void submeto_o_meu_login_sem_o_cpf() throws Throwable {
   Navegador.acessarsCPF();
    }

    @Entao("^devo ver Ops! Alguma informação incorreta\\.$")
    public void devo_ver_Ops_Alguma_informação_incorreta() throws Throwable {

    }}




