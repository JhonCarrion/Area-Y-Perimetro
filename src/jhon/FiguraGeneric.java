/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhon;

import java.util.ArrayList;

/**
 *
 * @author Paredes
 */
public class FiguraGeneric {

    private double base;
    private double altura;
    private ArrayList<Double> lados;
    private double radio;

    /**
     * Constructor para calculos de Area y Perimetro del Circulo
     *
     * @param radio double, es el radio del circulo
     */
    public FiguraGeneric(double radio) {
        this.radio = radio;
    }

    /**
     * Constructor para calculos de Area y Perimetro del Triangulo
     *
     * @param base doouble, Base del triangulo
     * @param altura double, Altura del triangulo
     * @param lado1 double, lado 1 del triangulo
     * @param lado2 double, lado 2 del triangulo
     */
    public FiguraGeneric(double base, double altura, double lado1, double lado2) {
        lados = new ArrayList<>();
        this.base = base;
        this.altura = altura;
        lados.add(base);
        lados.add(lado1);
        lados.add(lado2);
    }

    /**
     * Constructor para calculos de Area y Perimetro del Rectangulo o Cuadrado
     *
     * @param base double, base de la figura
     * @param altura double, altura de la figura
     */
    public FiguraGeneric(double base, double altura) {
        lados = new ArrayList<>();
        this.base = base;
        this.altura = altura;
        lados.add(base);
        lados.add(altura);
        lados.add(base);
        lados.add(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public ArrayList<Double> getLados() {
        return lados;
    }

    public void setLados(ArrayList<Double> lados) {
        this.lados = lados;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String queFigura() {
        if (radio != 0) {
            return "Circulo";
        }
        if (lados.size() == 4) {
            return "Rectangulo";
        } else if (lados.size() == 3) {
            return "Triangulo";
        }
        return null;
    }

    public double getArea() {
        if (radio != 0) {
            return Math.PI * Math.pow(radio, 2);
        }
        if (lados.size() == 4) {
            return base * altura;
        } else if (lados.size() == 3) {
            return (base * altura) / 2;
        }
        return 0;
    }

    public double getPerimetro() {
        if (radio != 0) {
            return 2 * Math.PI * radio;
        }
        if (lados.size() >= 2) {
            //double c = Math.sqrt(Math.pow((base / 2), 2) + Math.pow(altura, 2));
            double perimetro = 0;
            for (int i = 0; i < lados.size(); i++) {
                perimetro += lados.get(i);
            }
            return perimetro;
        }
        return 0;
    }
}
