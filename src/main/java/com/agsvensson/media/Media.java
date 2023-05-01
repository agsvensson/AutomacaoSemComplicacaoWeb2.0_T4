package com.agsvensson.media;

public class Media {

    public String calculaMedia(double valor1, double valor2) {
        double media = (valor1 + valor2) / 2;
        if (media < 5.0) {
            return "Reprovado";
        }
        return "Aprovado";
    }
}
