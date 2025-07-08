package lista04.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Produto> produtos = new ArrayList<>();

	public void adicionarProduto(Produto p) {
	    produtos.add(p);
	}

	public double calcularTotal() {
	    double total = 0.0;
	    for (Produto p : produtos) {
	        total += p.calcularPrecoVenda();
	    }
	    return total;
	}
	    public void listarProdutos() {
	        for (Produto p : produtos) {
	            System.out.println("------");
				p.informacoes();
	        }
	    }
	}

