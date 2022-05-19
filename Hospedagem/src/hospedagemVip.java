
public class hospedagemVip extends hospedagem  {
	
	    private static int ValorHospedagemVip = 0;

		
		public double ValorAdicional;
	   
	    public double getValorAdicional(){
	    return this.ValorAdicional;
	    }
	    public void setValorAdicional(double valorAdicional){
	        this.ValorAdicional = valorAdicional;
	    }
	    public double valorHospedagemVip(double valorHospedagemVip){
	         hospedagemVip.ValorHospedagemVip = (int) valorHospedagemVip;
	        return this.ValorHospedagemVip + (this.ValorAdicional);       
	    }
	}


