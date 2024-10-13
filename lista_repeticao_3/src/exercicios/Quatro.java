package exercicios;

class Quatro {
	  
	  private int razao = 3;
	  private int n = 4;
	  private int[] termos = new int[n];
	  
	  public Quatro(int razao, int n,int[] termos){
	    
	    this.razao = razao;
	    this.n = n;
	    this.termos = termos;
	    
	  }
	  
	  public double somaTermos(){
	    
	    double resultado = 0.0;
	    
	    for(int i = 0; i < n; i++){
	      
	      termos[i] = ( 1000 - (razao*i) );
	      resultado += termos[i];
	      
	    }
	    
	    return resultado;
	  }
	  
	}
