/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaapplication1;

public class TrianguloRetangulo {

    private double h;
    private double c1;
    private double c2;

    public TrianguloRetangulo(double c1, double c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public double calculaHipotenusa() {
        h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        return h;
    }

    public double calculaArea() {
        return (c1 * c2) / 2;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }
}