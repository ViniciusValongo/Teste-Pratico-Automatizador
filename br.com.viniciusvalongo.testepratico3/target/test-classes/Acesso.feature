# language: pt

@advantage
Funcionalidade: Acessar o site "https://advantageonlineshopping.com" e fazer automação dos cenários abaixo

  Cenário: Validar  especificações do produto de acordo com o BD
    Dado que acessei o site advantage online shopping
    Quando clico na opção Special Offer no menu
    E clico no botão See offer
    Então devo validar as especificações do produto de acordo com as informações retornadas do banco de automação

  Cenário: Validar se o produto é adicionado ao carrinho com a cor selecionada
    Dado que acessei o site advantage online shopping
    Quando clico na opção Special Offer no menu
    E clico no botão See offer
    E altero a cor do produto de acordo com a cor informada no banco de automação
    E clico no botão Add to cart
    Então devo validar se o produto foi adicionado ao carrinho com a cor selecionada

  Cenário: Validar a página de checkout após adicionar produtos ao carrinho
    Dado que acessei o site advantage online shopping
    Quando pesquiso o produto clicando no ícone de lupa
    E seleciono o produto pesquisado
    E altero a cor do produto para uma diferente da existente no banco de automação
    E altero a quantidade de produtos que desejo comprar
    E clico no botão Add to cart
    E acesso a página de checkout
    Então devo validar que a soma dos preços corresponde ao total apresentado na página de checkout
    E realizo um update no banco de automação para alterar a cor existente para a cor selecionada no teste

  Cenário: Validar que o produto é removido do carrinho de compras
    Dado que acessei o site https://advantageonlineshopping.com
    Quando clico na opção Special Offer no menu
    E clico no botão See offer
    E clico no botão Add to cart
    E clico no carrinho de compras
    E removo o produto do carrinho de compras
    Então devo validar que o carrinho de compras está vazio
