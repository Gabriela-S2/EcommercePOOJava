package lista04.exercicio02;

public class Aplicativo {
	public static void main(String[] args) {
        Produto regata = new Camiseta("Regata branca 100% Algodão moda verão", 25.0, "P", "Ranço");        
        Produto momJeans = new Calca("Calça Mom Jeans ", 75.0, "M", "Jeans escuro");
        Produto papete = new Sapato("Papete Branca com Strass Floral Colorido", 150.0, "36/37", "Papete");
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarProduto(regata);
        carrinho.adicionarProduto(momJeans);
        carrinho.adicionarProduto(papete);
        carrinho.listarProdutos();
        System.out.println("Valor total da compra: R$ " + carrinho.calcularTotal());

    }
}
