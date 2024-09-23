package main.java;

import java.util.Scanner;

public class CorpoHumano {
    // ATRIBUTOS
    private double altura;
    public int massa;
    private double volume;
    private int densidade;

    // CONSTRUTOR
    public CorpoHumano(int massa, double volume, int densidade, double altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

    // METODOS DENSIDADE
    public double getDensidade() {
        return this.densidade;
    }

    public void setDensidade(int densidade) {
        this.densidade = densidade;
    }

    // METODOS MASSA
    public double getMassa() {
        return this.massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    // METODOS VOLUME
    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    // METODOS ALTURA
    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // CRIADO METODO PARA EXIBIR IMC
    public double calcularIMC() {
        return massa / (altura * altura);

    }

    // CRIANDO METODO PARA RECEBER OS DADOS

    // public void receberDados() {

    // Scanner ler = new Scanner(System.in);

    // System.out.println("Digite seu peso: ");
    // int massa = ler.nextInt();

    // setMassa(massa);

    // System.out.println("Digite sua altura: ");
    // double altura = ler.nextDouble();
    // setAltura(altura);

    // // }
}