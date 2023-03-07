/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej8;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class POOEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cadena c1 = new Cadena();
        
        System.out.println("Ingrese una palabra o frase");
        String frase = leer.nextLine();
        
        c1.setFrase(frase);
        c1.setLongitud(frase.length());
        
        System.out.println("La frase contiene " + c1.mostrarVocales(c1) + " vocales.");
        System.out.println("La frase invertida queda asi: " + c1.invertirFrase(c1));
        
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        
        System.out.println("La letra ingresada se repite " + c1.vecesRepetido(letra, c1) + " vez/veces.");
        
        System.out.println("Ingrese otra palabra o frase");
        frase = leer.nextLine();
               
        if (c1.compararLongitud(frase, c1) == true){
          System.out.println("Las frases tienen la misma longitud.");  
        } else {
          System.out.println("Las frases no tienen la misma longitud.");
        }
        
        System.out.println("Ingrese otra palabra o frase");
        frase = leer.nextLine();
        
        System.out.println("La frase original unida a la frase ingresada queda asi:" + c1.unirFrases(frase, c1));
        
        System.out.println("Ingrese un caracter");
        letra = leer.next();
        
        System.out.println("Cambiamos las ´a´ por el caracter ingresado: " + c1.reemplazar(letra, c1));
        
        System.out.println("Ingrese la letra que desee comprobar si se encuentra en la frase");
        letra = leer.next();
        
        if (c1.contiene(letra, c1) == true){
            System.out.println("La frase contiene la letra ingresada.");
        } else {
            System.out.println("La frase no contiene la letra ingresada.");
        }
        
        
    }
    
    }
    
