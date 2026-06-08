/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

package javaapplication1;

import java.util.Calendar;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private double altura;
    private double peso;
    private double imc;
    private Data dataNascimento;

    public Pessoa(String nome, String sobrenome,
                  double altura, double peso,
                  Data dataNascimento) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.altura = altura;
        this.peso = peso;
        this.dataNascimento = dataNascimento;
    }

    public double calculaIMC() {
        imc = peso / (altura * altura);
        return imc;
    }

    public String informaObesidade() {

        double imc = calculaIMC();

        if (imc < 18.5)
            return "Magreza";

        else if (imc < 25)
            return "Normal";

        else if (imc < 30)
            return "Sobrepeso";

        else if (imc < 40)
            return "Obesidade";

        else
            return "Obesidade Grave";
    }

    public int calculaIdade() {

        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR)
                - dataNascimento.getAno();

        if (hoje.get(Calendar.MONTH) + 1 < dataNascimento.getMes()
                || (hoje.get(Calendar.MONTH) + 1 == dataNascimento.getMes()
                && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.getDia())) {

            idade--;
        }

        return idade;
    }

    public String nomeReferencia() {
        return sobrenome + ", " + nome.toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
}