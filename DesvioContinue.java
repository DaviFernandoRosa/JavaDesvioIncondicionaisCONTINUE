/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Davi
 */
public class DesvioContinue {
    
    
    public static void main(String[]args){
      
       for(int i = 0; i < 12; i++){
          if ((i > 4) && (i < 8)){
              continue;
          }

          //apresenta na tela quando o i nao estiver entre 4 e 8
          //Note que o programa não imprimiu os números 5, 6 e 7 devido à execução do
          //comando continue.
          System.out.println("i = " + i);
       }
      
    }
    
}
