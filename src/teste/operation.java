package teste;

public class operation {
    private int valor1;
	private int valor2;
	private int opcao;
	private int result;
	
	
	public int getValor1() {
		return valor1;
	}
	
	public int getValor2() {
		return valor2;
		
	}
	
	public void setValor1(int valor1) {
		this.valor1 = valor1;
		
	}
	
	public void setValor2(int valor2) {
		this.valor2 = valor2;
		
	}
	
	public int getOpcao() {
		return opcao;
	}
	
	public int getResult() {
		return result;
	}
	
	
	public int soma() {
		this.result = this.getValor1() + this.getValor2() ;
		System.out.println(result);
		return this.result;
		
	}
	
	
	public int subtrair() {
		this.result = this.getValor1() - this.getValor2() ;
		System.out.println(result);
		return this.result;
		
	}
	
	public int mult() {
		this.result = this.getValor1() * this.getValor2() ;
		System.out.println(result);
		return this.result;
		
	}
	
	public int div() {
		this.result = this.getValor1() / this.getValor2() ;
		System.out.println(result);
		return this.result;
		
	}


}
