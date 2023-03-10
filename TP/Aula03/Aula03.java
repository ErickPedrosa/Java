package TP.Aula03;

import java.sql.Time;

public class Aula03 {
    public static void main(String[] args) {
        
        //Atividade 02;
        /*
        Trabalhador erick = new Trabalhador("notebook", 500);
        Trabalhador kaio = new Trabalhador("celular", 300);

        erick.start();
        kaio.start();

        erick.parar(10000);
        kaio.parar(1000);*/



        //Atividade 03;
        PilhaSincronizada pilha = new PilhaSincronizada();
        Produtor produtor = new Produtor(pilha);
        Consumidor consumidor1 = new Consumidor(pilha);
        Consumidor consumidor2 = new Consumidor(pilha);

        produtor.start();
        consumidor1.start();
        consumidor2.start();


        return;
    }
}
