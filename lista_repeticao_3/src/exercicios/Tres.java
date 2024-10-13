package exercicios;

import java.util.Scanner;

class Tres {
  
  private int pessoas = 10;
  private int[] idade = new int[pessoas];
  private double[] peso = new double[pessoas];
  private double[] altura = new double[pessoas];
  private double media = 0.0;
  
  public Tres (int[] idade, double[] peso, double[] altura){
    
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
    this.pessoas = pessoas;
    
  }
  
  public void entradaTres(){
    
    Scanner entrada = new Scanner(System.in);
    int opcao = 0;
    
    int[] idade = new int[pessoas];
    double[] peso = new double[pessoas];
    double[] altura = new double[pessoas];
    
    for(int i = 0; i < pessoas; i++){
      
      System.out.print("Informe a idade da " + (i+1) + "° pessoa: ");
      idade[i] = entrada.nextInt();
      
      System.out.print("Informe o peso da " + (i+1) + "° (em kg) pessoa: ");
      peso[i] = entrada.nextDouble();
      
      System.out.print("Informe a altura da " + (i+1) + "° (em m) pessoa: ");
      altura[i] = entrada.nextDouble();
      
    }
    
    
    Tres tres = new Tres(idade,peso,altura);
    
    System.out.println( "Média das idades das dez pessoas: " + mediaIdade(tres) + "\n" +
                     "Total de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro: " + pesoAltura(tres) + "\n" +
                     "Porcentagem de pessoas com idade entre 10 e 30 anos entre aquelas que medem mais de 1,90 m: " +
                       porcentagemIdadeAltura(tres) + "% \nDados coletados: \nIdades: ");
    
    for(int i = 0; i < pessoas; i++){
      
      System.out.printf("%d, ", idade[i]);
      
    }
    
    System.out.println("\nPesos: ");
    
    for(int i = 0; i < pessoas; i++){
      
      System.out.printf("%.1f, ", peso[i]);
      
    }
    
    System.out.println("\nAlturas: ");
    
    for(int i = 0; i < pessoas; i++){
      
      System.out.printf("%.1f, ", altura[i]);
      
    }
    
    System.out.println();
    
  }
  
  public double mediaIdade(Tres novoTres){
    
    int totalIdade = 0;
    
    for(int i = 0; i < pessoas; i++){
      
      totalIdade += novoTres.idade[i];
      
    }
    
    media = (totalIdade/pessoas);
    return media;
  }
  
  public double pesoAltura(Tres novoTres){
    
    double totalAltPeso = 0.0;
    
    for(int i = 0; i < pessoas; i++){
            
      if(novoTres.peso[i] > 90 && novoTres.altura[i] < 1.5){
        
        totalAltPeso++;
        
      }
      
    }
    
    return totalAltPeso;
    
  }
  
  public double porcentagemIdadeAltura(Tres novoTres){
    
    int totalIdadeAltura = 0;
    double porcentagem = 0.0;
    
    for(int i = 0; i < pessoas; i++){
      
      if(novoTres.idade[i] >= 10 && novoTres.idade[i] <= 30){
        totalIdadeAltura++;
      }
      
    }
    
    if(totalIdadeAltura != 0){
      porcentagem = totalIdadeAltura*100/pessoas; 
    }
    
    return porcentagem;
    
  }
  
}
