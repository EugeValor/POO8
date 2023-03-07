/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author 54343
 */
public class Cadena {
      private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
    
    public int mostrarVocales(Cadena c){
        int contador;
        contador = 0;
        String fra = c.getFrase().toLowerCase();
        for (int i = 0; i < c.getLongitud(); i++){
            switch (fra.substring(i, i+1)){
                case "a":
                    contador++;
                    break;
                case "e":
                    contador++;
                    break;
                case "i":
                    contador++;
                    break;
                case "o":
                    contador++;
                    break;
                case "u":
                    contador++;
                    break;
                default:    
                    break;    
                    
            }
        }
        return contador;
        
    }
    
    public String invertirFrase(Cadena c){
        String fraseInv;
        fraseInv = "";
        for (int i = c.getLongitud()-1; i >= 0; i--){
            fraseInv += c.getFrase().charAt(i);
            
        }
        return fraseInv;
        
    }
    public int vecesRepetido(String letra, Cadena c){
        int contador;
        String fra = c.getFrase();
        
        contador = 0;
        for (int i = 0; i < c.getLongitud(); i++){
            String letra1 = fra.substring(i, i+1);
            if (letra.equalsIgnoreCase(letra1)){
                contador++;
            }
            
                
        }
        return contador;
              
    }
     public boolean compararLongitud(String frase, Cadena c){
        boolean igualLong;
        igualLong = c.getLongitud() == frase.length();
        
        return igualLong;      
   
    }
    
    public String unirFrases(String frase, Cadena c){
        String frase2 = c.getFrase() + " " + frase;
        
        return frase2;        
    }
    
    public String reemplazar(String letra, Cadena c){
        String frase1 = "";
        String fra = c.getFrase();
        for ( int i = 0; i < c.getLongitud(); i++){
            if (fra.substring(i, i+1).equalsIgnoreCase("a")){
                frase1 += letra;
            } else {
                frase1 += fra.charAt(i);
            }
        }
        return frase1;
    }
    
    public boolean contiene(String letra, Cadena c){
        boolean contener = false;        
        for (int i = 0; i < c.getLongitud(); i++){
            if (c.getFrase().substring(i, i+1).equalsIgnoreCase(letra)){
                contener = true;
                break;
            }
        }        
        return contener;
    }
    
}
