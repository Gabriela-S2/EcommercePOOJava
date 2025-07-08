package lista04.exercicio02;

public class Calca extends Produto {
    private String tamanho;
    private String material;  

	public Calca(String descricao, double precoCusto, String tamanho, String material) {
		super(descricao, precoCusto);
		this.tamanho = tamanho;
		this.material = material;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public double desconto(){
		return 10.0;
	}
	
	@Override
    public double calcularPrecoVenda() {
		if(getPrecoCusto()> 300) {
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
    	System.out.println("Tamanho: "+ getTamanho());
    	System.out.println("Material: "+ getMaterial());
    	if(getPrecoCusto()> 100) {
        System.out.println("Valor do produto: "+ (calcularPrecoVenda()+ desconto()));}
    	else {System.out.println("Valor original do produto: "+ (calcularPrecoVenda()));}
    	if(getPrecoCusto()> 100) {
    		System.out.println("Valor original do desconto: "+ desconto());}
    	else {System.out.println("Valor do desconto: 0");}
        System.out.println("Valor total do produto: "+ calcularPrecoVenda());
    }

}
