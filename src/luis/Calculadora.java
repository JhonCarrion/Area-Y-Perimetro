/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis;

import javax.swing.JOptionPane;

/**
 *
 * @author Paredes
 */
public class Calculadora {
   

    public static void main(String[] args) {
        Rectangulo f = new Rectangulo(10.5, 6.7);
        System.out.println("Figura: Rectangulo");
        System.out.println("Area: " + f.getArea());
        System.out.println("Perimetro: " + f.getPerimetro());
        Circulo f1 = new Circulo(5.7);
        System.out.println("Figura: Circulo");
        System.out.println("Area: " + f1.getArea());
        System.out.println("Perimetro: " + f1.getPerimetro());
        Triangulo f2 = new Triangulo(10.5, 6.7, 4, 7);
        System.out.println("Figura: Triangulo");
        System.out.println("Area: " + f2.getArea());
        System.out.println("Perimetro: " + f2.getPerimetro());
        //opciones a presentar en un seleccionador
        String opt[] = {"opcion1", "opcion2", "opcion3"};
        //Como presnetar un seleccionador en un dialogo
        JOptionPane.showInputDialog(null, "Titulo", "Titulo Ventana", JOptionPane.INFORMATION_MESSAGE, null, opt, opt[0]);
    }
}
