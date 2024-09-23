package main.java;

import java.util.Scanner;

public class App {
    // Comentário

    public static void main(String[] args) throws Exception {

        CorpoHumano c1 = new CorpoHumano(0,0,0,0);
        // AQUI OCORRE ERRO, POIS "massa" ESTA COMO "private", OU SEJA NAO É VISIVEL
        // OBS: DEIXEI "c1.massa='1' COMENTADO PARA O CODIGO FUNCIONAR"
        c1.massa = 1;

        // AGORA DEIXANDO MASSA COMO PUBLIC
        c1.massa = 1;
        // PERCEBEMOS QUE AGORA É POSSIVEL ATRIBUIR O VALOR NORMALMENTE

        // AQUI OCORRE ERRO, POIS SETVOLUME ESTA COMO PRIVADO
        c1.setVolume(1);

        // DESAFIO IMC
        c1.setMassa(97);
        c1.setVolume(0.07);
        c1.setDensidade(2000);
        c1.setAltura(1.81);

        
        System.out.printf("%.2f%n", c1.calcularIMC());

    }
}
