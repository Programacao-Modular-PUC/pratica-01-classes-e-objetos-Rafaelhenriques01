/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
 static class Pessoa {

        private String nome;
        private String sobrenome;
        private int idade;
        private double altura;
        private double peso;
        private double imc;

        public Pessoa(String n, String s, int i, double a, double p) {
            nome = n;
            sobrenome = s;
            idade = i;
            altura = a;
            peso = p;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String n) {
            nome = n;
        }

        public String getSobrenome() {
            return sobrenome;
        }

        public void setSobrenome(String s) {
            sobrenome = s;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int i) {
            idade = i;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double a) {
            altura = a;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double p) {
            peso = p;
        }

        public double getImc() {
            return imc;
        }

        public void calculaIMC() {
            imc = peso / (altura * altura);
        }

        public String informaObesidade() {

            if (imc < 18.5)
                return "abaixo do peso";
            else if (imc <= 24.9)
                return "peso normal";
            else if (imc <= 29.9)
                return "sobrepeso";
            else if (imc <= 34.9)
                return "obesidade grau 1";
            else if (imc <= 39.9)
                return "obesidade grau 2";
            else
                return "obesidade grau 3";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        Pessoa p = new Pessoa(nome, sobrenome, idade, altura, peso);

        p.calculaIMC();

        System.out.println("IMC: " + p.getImc());
        System.out.println("Classificação: " + p.informaObesidade());

        sc.close();
    }
