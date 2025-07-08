# Sistema de Carrinho de Compras em Java (POO)

Este projeto simula um sistema básico de carrinho de compras, aplicando os princípios fundamentais da Programação Orientada a Objetos (POO) em Java para gerenciar diferentes tipos de produtos e calcular o valor total de uma compra.

## 🚀 Conceitos de POO Abordados

* **Herança:** Classes específicas de produtos (`Camiseta`, `Calca`, `Sapato`) herdam características e comportamentos de uma classe base abstrata (`Produto`).
* **Abstração:** A classe abstrata `Produto` define uma interface comum para todos os itens do carrinho, garantindo que métodos essenciais como `calcularPrecoVenda()`, `lucro()`, `desconto()` e `informacoes()` sejam implementados por suas subclasses.
* **Polimorfismo:** Diferentes tipos de produtos podem ser tratados de forma genérica pelo `CarrinhoDeCompras`, e o cálculo do preço de venda ou a exibição de informações é realizado de acordo com o tipo específico do objeto.
* **Encapsulamento:** Os atributos das classes são privados, sendo acessados e modificados apenas por meio de métodos públicos (`getters` e `setters`), protegendo a integridade dos dados.
* **Composição/Agregação:** A classe `CarrinhoDeCompras` gerencia uma coleção de objetos `Produto`, demonstrando uma relação "tem um" ou "tem muitos".

## 📂 Estrutura do Projeto

O projeto está organizado no pacote `lista04.exercicio02` e contém as seguintes classes:

* `Produto.java`: Classe abstrata base para todos os produtos, definindo atributos comuns e métodos abstratos para cálculo de preço, lucro e informações.
* `Camiseta.java`: Estende `Produto`, com atributos específicos para camisetas (tamanho, estampa).
* `Calca.java`: Estende `Produto`, com atributos específicos para calças (tamanho, material).
* `Sapato.java`: Estende `Produto`, com atributos específicos para sapatos (número, tipo).
* `CarrinhoDeCompras.java`: Gerencia a lista de produtos no carrinho, permite adicionar produtos, calcular o total e listar os itens.
* `Aplicativo.java`: Classe principal com o método `main` para demonstrar a criação de produtos, adição ao carrinho e exibição do resumo da compra.

## 🛠️ Como Compilar e Rodar

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/SeuUsuario/EcommercePOOJava.git](https://github.com/SeuUsuario/EcommercePOOJava.git)
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd EcommercePOOJava
    ```
3.  **Compile os arquivos Java:**
    A partir da raiz do projeto (`EcommercePOOJava/`), execute:
    ```bash
    javac src/lista04/exercicio02/*.java -d out
    ```
    (Este comando compila todos os arquivos `.java` dentro do pacote e os coloca no diretório `out`).
4.  **Execute a aplicação:**
    ```bash
    java -cp out lista04.exercicio02.Aplicativo
    ```

## 📄 Exemplo de Saída

Ao executar o `Aplicativo.java`, você verá uma saída similar a esta no console:
Sim, este sistema de gerenciamento de produtos e carrinho de compras também é muito bom e seria uma excelente adição ao seu perfil do GitHub! Ele demonstra uma aplicação prática de conceitos de Programação Orientada a Objetos (POO) em um cenário de e-commerce, abordando:

Herança: As classes Camiseta, Calca e Sapato estendem a classe abstrata Produto.

Abstração: A classe Produto define métodos abstratos como informacoes(), calcularPrecoVenda(), lucro() e desconto(), garantindo que todas as subclasses de produto implementem esses comportamentos essenciais.

Polimorfismo: Cada tipo de produto (Camiseta, Calca, Sapato) implementa calcularPrecoVenda() e informacoes() de sua própria maneira, e o CarrinhoDeCompras interage com eles de forma genérica.

Encapsulamento: Os atributos das classes são privados, com acesso controlado por métodos getters e setters.

Composição/Agregação: A classe CarrinhoDeCompras contém uma lista de objetos Produto, demonstrando como classes podem ser construídas a partir de outras.

Este projeto é um ótimo exemplo de como você aplica a POO para resolver um problema real, o que é muito valioso.

Como adicionar e apresentar no seu perfil do GitHub:
Assim como os projetos anteriores, a melhor forma é criar um repositório dedicado e bem documentado.

Aqui está um rascunho do que você pode incluir:

1. Crie um Novo Repositório no GitHub
Dê um nome claro e conciso, por exemplo: EcommercePOOJava ou CarrinhoDeComprasJava.

Adicione uma descrição breve, como: "Sistema simples de carrinho de compras em Java, utilizando conceitos de Programação Orientada a Objetos (POO) para gerenciar produtos e calcular o total da compra."

Marque a opção para inicializar o repositório com um README.md.

2. Organize Seus Arquivos no Repositório
Mantenha a estrutura de pacotes que você já tem (lista04.exercicio02).

Exemplo de estrutura de pastas:

EcommercePOOJava/
├── src/
│   └── lista04/
│       └── exercicio02/
│           ├── Aplicativo.java
│           ├── Calca.java
│           ├── Camiseta.java
│           ├── CarrinhoDeCompras.java
│           ├── Produto.java
│           └── Sapato.java
└── README.md
3. Crie um README.md Detalhado para o Repositório
Este é o documento principal que explica o seu projeto.

Markdown

# Sistema de Carrinho de Compras em Java (POO)

Este projeto simula um sistema básico de carrinho de compras, aplicando os princípios fundamentais da Programação Orientada a Objetos (POO) em Java para gerenciar diferentes tipos de produtos e calcular o valor total de uma compra.

## 🚀 Conceitos de POO Abordados

* **Herança:** Classes específicas de produtos (`Camiseta`, `Calca`, `Sapato`) herdam características e comportamentos de uma classe base abstrata (`Produto`).
* **Abstração:** A classe abstrata `Produto` define uma interface comum para todos os itens do carrinho, garantindo que métodos essenciais como `calcularPrecoVenda()`, `lucro()`, `desconto()` e `informacoes()` sejam implementados por suas subclasses.
* **Polimorfismo:** Diferentes tipos de produtos podem ser tratados de forma genérica pelo `CarrinhoDeCompras`, e o cálculo do preço de venda ou a exibição de informações é realizado de acordo com o tipo específico do objeto.
* **Encapsulamento:** Os atributos das classes são privados, sendo acessados e modificados apenas por meio de métodos públicos (`getters` e `setters`), protegendo a integridade dos dados.
* **Composição/Agregação:** A classe `CarrinhoDeCompras` gerencia uma coleção de objetos `Produto`, demonstrando uma relação "tem um" ou "tem muitos".

## 📂 Estrutura do Projeto

O projeto está organizado no pacote `lista04.exercicio02` e contém as seguintes classes:

* `Produto.java`: Classe abstrata base para todos os produtos, definindo atributos comuns e métodos abstratos para cálculo de preço, lucro e informações.
* `Camiseta.java`: Estende `Produto`, com atributos específicos para camisetas (tamanho, estampa).
* `Calca.java`: Estende `Produto`, com atributos específicos para calças (tamanho, material).
* `Sapato.java`: Estende `Produto`, com atributos específicos para sapatos (número, tipo).
* `CarrinhoDeCompras.java`: Gerencia a lista de produtos no carrinho, permite adicionar produtos, calcular o total e listar os itens.
* `Aplicativo.java`: Classe principal com o método `main` para demonstrar a criação de produtos, adição ao carrinho e exibição do resumo da compra.

## 🛠️ Como Compilar e Rodar

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/SeuUsuario/EcommercePOOJava.git](https://github.com/SeuUsuario/EcommercePOOJava.git)
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd EcommercePOOJava
    ```
3.  **Compile os arquivos Java:**
    A partir da raiz do projeto (`EcommercePOOJava/`), execute:
    ```bash
    javac src/lista04/exercicio02/*.java -d out
    ```
    (Este comando compila todos os arquivos `.java` dentro do pacote e os coloca no diretório `out`).
4.  **Execute a aplicação:**
    ```bash
    java -cp out lista04.exercicio02.Aplicativo
    ```

## 📄 Exemplo de Saída

Ao executar o `Aplicativo.java`, você verá uma saída similar a esta no console:

Produto: Regata branca 100% Algodão moda verão Tamanho: P Estampa: Ranço Valor original do produto: 25.5 Valor do desconto: 0 Valor total do produto: 25.5
Produto: Calça Mom Jeans Tamanho: M Material: Jeans escuro Valor original do produto: 78.75 Valor do desconto: 0 Valor total do produto: 78.75
Produto: Papete Branca com Strass Floral Colorido
Número: 36/37
Tipo: Papete
Valor original do produto: 157.5
Valor do desconto: 0
Valor total do produto: 157.5
Valor total da compra: R$ 261.75

![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
