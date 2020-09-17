
package pct;

public class Elevador {
    //constante
    final int ULTIMO_ANDAR = 5;
    final int PRIMEIRO_ANDAR = 0;
    
    
//Atributos
int andarAtual; 
double peso;
boolean portaAberta;
//Metodos
public void imprimirStatus(){
    System.out.println("Andar Atual:"+ andarAtual);
    System.out.printf("Peso %.3f\n",peso);
    System.out.println(portaAberta?"Porta Aberta!":"Porta Fechada!\n\n");
}
 public void subir(int andarDesejado){
     if((andarDesejado<= ULTIMO_ANDAR)&& (this.fecharPorta())){     
     while(andarDesejado > andarAtual){
         andarAtual++;
         System.out.println(andarAtual + "º andar..");
    }
 }else{
        System.out.println("Andar"+andarDesejado+"invalido ou PortaAberta");          
   }
     this.portaAberta = true;
 }
    public void descer(int andarDesejado){
    if((andarDesejado >= PRIMEIRO_ANDAR)&&(this.fecharPorta())){
    while(andarDesejado < andarAtual){
         andarAtual--;
         System.out.println(andarAtual + "º andar..");
    }
}else{
        System.out.println("Andar"+ andarDesejado +"invalido ou porta Aberta!");
    }
    this.portaAberta = true;
  }
    private boolean fecharPorta(){
        if(peso <= 750.0)
        portaAberta = false;
        return !portaAberta;
        
    }
}
