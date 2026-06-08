/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // EXERCÍCIO 1

        System.out.println("EXERCICIO 1");

        System.out.print("Digite o primeiro cateto: ");
        double c1 = sc.nextDouble();

        System.out.print("Digite o segundo cateto: ");
        double c2 = sc.nextDouble();

        TrianguloRetangulo triangulo = new TrianguloRetangulo(c1, c2);

        System.out.println("Hipotenusa = " + triangulo.calculaHipotenusa());
        System.out.println("Area = " + triangulo.calculaArea());

        // EXERCÍCIO 2

        System.out.println("\nEXERCICIO 2");

        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        Pessoa pessoa = new Pessoa(
                nome,
                sobrenome,
                idade,
                altura,
                peso,
                0);

        System.out.println("IMC = " + pessoa.calculaIMC());

        System.out.println("Classificacao = "
                + pessoa.informaObesidade());

        sc.close();
    }
}