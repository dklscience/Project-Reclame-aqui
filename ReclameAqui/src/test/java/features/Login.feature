#language: pt

Funcionalidade: Fazer login
    @T01
    Cenario: logar com sucesso
    Dado que acesso a pagina inicial do reclame aqui
    Quando coloco dados de acesso
    Entao acesso com sucesso

    @T02
    Cenario: cpf não informado
    Dado que acesso a página de login
    Quando submeto o meu login sem o cpf
    Entao devo ver Ops! Alguma informação incorreta.


