package main.java;

import java.util.Scanner;

// USANDO EXTENDS PARA HERDAR OS ATRIBUTOS DA CLASSE CORPO HUMANO
public class Imc extends CorpoHumano {

    // CRIADO METODO PARA EXIBIR IMC
    public double exibirImc(double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;

    }

    // CRIANDO METODO PARA RECEBER OS DADOS
    public void receberDados() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = ler.nextDouble();

        setPeso(peso);

        System.out.println("Digite sua altura: ");
        double altura = ler.nextDouble();
        setAltura(altura);

    }

}
