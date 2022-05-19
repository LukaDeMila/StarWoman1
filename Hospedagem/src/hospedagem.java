
public class hospedagem {
	private double valorHospedagem;
	
	

	public double getValorHospedagem() {
		return valorHospedagem;
	}

	public void setValorHospedagem(double valorHospedagem) {
		this.valorHospedagem = valorHospedagem;
	}
	
	
	public void valorHospedagem(double valorHospedagem) {
		
		valorHospedagem = this.valorHospedagem = valorHospedagem;
		System.out.println(" O valor da hospedagem é: " + valorHospedagem);
	}
	
  
}
