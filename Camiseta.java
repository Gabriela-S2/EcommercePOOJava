package lista04.exercicio02;

public class Camiseta extends Produto {
    private String tamanho;
    private String estampa;  
    
	public Camiseta(String descricao, double precoCusto, String tamanho, String estampa) {
		super(descricao, precoCusto);
		this.tamanho = tamanho;
		this.estampa = estampa;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getEstampa() {
		return estampa;
	}
	public void setEstampa(String estampa) {
		this.estampa = estampa;
	}
	
	@Override
	public double desconto(){
		return 10.0;
	}
	
	@Override
    public double calcularPrecoVenda() {
		if(getPrecoCusto()> 100) {
        return getPrecoCusto() + (getPrecoCusto() * 0.02) - desconto();}
		else {return getPrecoCusto() + (getPrecoCusto() * 0.02);}
    }

    @Override
    public double lucro() {
        return calcularPrecoVenda() - getPrecoCusto();
    }
    
    @Override
    public void informacoes() {
    	System.out.println("Produto: "+ getDescricao());
    	System.out.println("Tamanho: "+ getTamanho());
    	System.out.println("Estampa: "+ getEstampa());
    	if(getPrecoCusto()> 100) {
        System.out.println("Valor original do produto: "+ (calcularPrecoVenda()+ desconto()));}
    	else {System.out.println("Valor do produto: "+ (calcularPrecoVenda()));}
    	if(getPrecoCusto()> 100) {
		System.out.println("Valor original do desconto: "+ desconto());}
    	else {System.out.println("Valor do desconto: 0");}
        System.out.println("Valor total do produto: "+ calcularPrecoVenda());
    }
	
}
