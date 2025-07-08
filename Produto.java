package lista04.exercicio02;

public abstract class Produto {
private String descricao;
private double precoCusto;

public String getDescricao() {
	return descricao;
}

public Produto(String descricao, double precoCusto) {
	this.descricao = descricao;
	this.precoCusto = precoCusto;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public double getPrecoCusto() {
	return precoCusto;
}

public void setPrecoCusto(double precoCusto) {
	this.precoCusto = precoCusto;
}

public abstract void informacoes();
public abstract double calcularPrecoVenda();
public abstract double lucro();
public abstract double desconto();

}
