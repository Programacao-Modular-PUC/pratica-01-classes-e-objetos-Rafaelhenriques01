/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[10];

        int quantidade = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Sobrenome: ");
            String sobrenome = sc.nextLine();

            System.out.print("Peso: ");
            double peso = sc.nextDouble();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            sc.nextLine();

            System.out.print("Data de nascimento (dd/mm/aaaa): ");
            String data = sc.nextLine();

            String[] partes = data.split("/");

            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);

            Data nascimento = new Data(dia, mes, ano);

            pessoas[i] = new Pessoa(
                    nome,
                    sobrenome,
                    altura,
                    peso,
                    nascimento);

            quantidade++;

            if (i > 0) {

                if (nome.equalsIgnoreCase(pessoas[i - 1].getNome())
                        && sobrenome.equalsIgnoreCase(pessoas[i - 1].getSobrenome())) {

                    quantidade--;
                    break;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < quantidade; i++) {

            System.out.println("Cadastro " + (i + 1) + ":");
            System.out.println("Nome completo: "
                    + pessoas[i].getNome() + " "
                    + pessoas[i].getSobrenome());

            System.out.println("Nome de referência: "
                    + pessoas[i].nomeReferencia());

            System.out.println("Idade: "
                    + pessoas[i].calculaIdade());

            System.out.println("Peso: "
                    + pessoas[i].getPeso());

            System.out.println("Altura: "
                    + pessoas[i].getAltura());

            System.out.println("IMC: "
                    + pessoas[i].calculaIMC());

            System.out.println("Classificação: "
                    + pessoas[i].informaObesidade());

            System.out.println();
        }

        sc.close();
    }
}