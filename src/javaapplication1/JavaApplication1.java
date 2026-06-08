/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;
 
public class JavaApplication1{
    
    static class TrianguloRetangulo{

    double h;
    double c1;
    double c2; 

    double calculaHipotenusa(){
        h = Math.sqrt(Math.pow(c1,2) + Math.pow(c2,2));
        return h;
    }

    double calculaArea(){
        return (c1*c2)/2;
    }
}

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        TrianguloRetangulo triangulo = new TrianguloRetangulo();

        System.out.print("Digite o cateto 1: ");
        triangulo.c1 = sc.nextDouble();

        System.out.print("Digite o cateto 2: ");
        triangulo.c2 = sc.nextDouble();

        System.out.println("Hipotenusa: " + triangulo.calculaHipotenusa());
        System.out.println("Area do triangulo: " + triangulo.calculaArea());

        sc.close();
    }
   
}
