/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_7_throw_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_7_THROW_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do{
         try{
         Prueba obj = new Prueba();          
         obj.setValor(-1);
         System.out.println("Introduce el valor de x(Que sea entero)");                         
         }catch(Exception ex){//Es la super clase de todas las excepciones
             //por tanto, captura todas las excepciones
             //Complica detectar ek tuoi de excepcuibes , y dar la solucion
             //correcta
            System.out.println(ex.getMessage());
        break; 
        }  
       }while(true);
        System.out.println("El valor caputarado es:" + Prueba);
     }
   }   
        

class Prueba{
            private int valor;

            public int getValor() {
                return valor;
            }
            //checked exceptions:Se deben resolver en tiempo de compilacion
            //unchecked exceptions:errores de logcia del programador
            //                     hava bi te ibkuga a resolverlas 
            public void setValor(int valor) throws Exception {
                if(valor < 0)
                    //Exceptions es del tipo "Checked Exception"
                    throw new Exception("El valor " + valor + "es invalido "
                            + "debe de ser igual a cero");
                else            
                     this.valor = valor;
            }
}