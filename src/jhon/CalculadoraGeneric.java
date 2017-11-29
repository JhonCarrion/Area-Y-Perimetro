/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhon;

import javax.swing.JOptionPane;

/**
 *
 * @author Paredes
 */
public class CalculadoraGeneric {

    private static double sumaPerimetros = 0;
    private static double sumaAreas = 0;

    public static void aniadirFigura() {
        String option[] = {"Circulo", "Triangulo", "Rectangulo", "Regresar"};
        String opt;
        do {
            opt = (String) JOptionPane.showInputDialog(null, "Titulo", "Titulo Ventana", JOptionPane.INFORMATION_MESSAGE, null, option, option[0]);
            switch (opt) {
                case "Circulo":
                    double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
                    FiguraGeneric f1 = new FiguraGeneric(radio);
                    sumaAreas += f1.getArea();
                    sumaPerimetros += f1.getPerimetro();
                    break;
                case "Triangulo":
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
                    double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer lado del triangulo"));
                    double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo lado del triangulo"));
                    FiguraGeneric f2 = new FiguraGeneric(base, altura, lado1, lado2);
                    sumaAreas += f2.getArea();
                    sumaPerimetros += f2.getPerimetro();
                    break;
                case "Rectangulo":
                    base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectangulo"));
                    altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectangulo"));
                    FiguraGeneric f = new FiguraGeneric(base, altura);
                    sumaAreas += f.getArea();
                    sumaPerimetros += f.getPerimetro();
                    break;
                case "Regresar":
                    break;
                default:
            }
        } while (!opt.equals("Regresar"));
        JOptionPane.showMessageDialog(null, "la suma de las areas y preimietros de las figuras son:\n" + "Area: " + sumaAreas + "\nPerimetro: " + sumaPerimetros);
    }

    public static void main(String[] args) {
        FiguraGeneric f = new FiguraGeneric(10.5, 6.7);
        System.out.println("Figura: " + f.queFigura());
        System.out.println("Area: " + f.getArea());
        System.out.println("Perimetro: " + f.getPerimetro());
        FiguraGeneric f1 = new FiguraGeneric(5.7);
        System.out.println("Figura: " + f1.queFigura());
        System.out.println("Area: " + f1.getArea());
        System.out.println("Perimetro: " + f1.getPerimetro());
        FiguraGeneric f2 = new FiguraGeneric(10.5, 6.7, 4, 7);
        System.out.println("Figura: " + f2.queFigura());
        System.out.println("Area: " + f2.getArea());
        System.out.println("Perimetro: " + f2.getPerimetro());
        CalculadoraGeneric.aniadirFigura();
    }
}
