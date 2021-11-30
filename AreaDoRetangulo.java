/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areadoretangulo;

/**
 *
 * @author padov
 */
public class AreaDoRetangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Retangulo retangulo = new Retangulo();
       retangulo.setX(7);
       retangulo.setY(3);
       
       retangulo.setX1(10);
       retangulo.setY1(5);
       
       System.out.println("Área maior: "+retangulo.getSomaA());
       System.out.println("Área menor: "+retangulo.getSomaA1());
       System.out.println("Diferença: "+retangulo.getDiferença());
       
       
    }
    
}
