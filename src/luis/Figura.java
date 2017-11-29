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
public abstract class Figura {

    private double base;
    private double altura;

    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract double getArea();

    public abstract double getPerimetro();
}
