
package pct;

/**
 *
 * @author Erasmo
 */
public class TesteElevador {
    public static void main(String[] args) {
    //Criação da instancia do objeto    
        Elevador elevador = new Elevador();
        //construindo o objeto elevador
        elevador.andarAtual = 0;
        elevador.peso = Math.random()* 1000;
        elevador.portaAberta = true;
        
        //Exibindo o estatus do elevador
        System.out.println("\n\t\t\t --Elevador Parado -- \n");
        elevador.imprimirStatus();
        
        //Subindo
        elevador.subir(5);
        //Exibindo elevador no 5º andar
       System.out.println("\n\t\t\t --Elevador  no  Quinto -- \n");
        elevador.imprimirStatus(); 
    
    //descendo
       elevador.descer(0);
        //Exibindo elevador no 5º andar
       System.out.println("\n\t\t\t --Elevador  no Terreo -- \n");
       elevador.imprimirStatus();  
}
}

