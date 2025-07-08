package lista04.exercicio02;

public class Sapato extends Produto {
    private String numero;
    private String tipo;  

	public Sapato(String descricao, double precoCusto, String numero, String tipo) {
		super(descricao, precoCusto);
		this.numero = numero;
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public double desconto(){
		return 10.0;
	}
	
	@Override
    public double calcularPrecoVenda() {
		if(getPrecoCusto()> 150) {
        return getPrecoCusto() + (getPrecoCusto() * 0.05) - desconto();}
		else {return getPrecoCusto() + (getPrecoCusto() * 0.05);}
    }

    @Override
    public double lucro() {
        return calcularPrecoVenda() - getPrecoCusto();
    }
    
    @Override
    public void informacoes() {
    	System.out.println("Produto: "+ getDescricao());
    	System.out.println("Número: "+ getNumero());
    	System.out.println("Tipo: "+ getTipo());
    	if(getPrecoCusto()> 100) {
        System.out.println("Valor original do produto: "+ (calcularPrecoVenda()+ desconto()));}
    	else {System.out.println("Valor original do produto: "+ (calcularPrecoVenda()));}
    	if(getPrecoCusto()> 100) {
    		System.out.println("Valor do desconto: "+ desconto());}
    	else {System.out.println("Valor do desconto: 0");}
        System.out.println("Valor total do produto: "+ calcularPrecoVenda());
    }
}
