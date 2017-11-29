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
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        super(0, 0);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

}
