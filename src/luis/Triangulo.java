/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis;

/**
 *
 * @author Paredes
 */
public class Triangulo extends Figura {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(double base, double altura, double lado1, double lado2) {
        super(base, altura);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double getArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return (this.base + this.lado1 + this.lado1);
    }
}
