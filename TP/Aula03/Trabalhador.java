package TP.Aula03;

public class Trabalhador extends Thread{

    private String produto;
    private int tempo;
    private Boolean acabou = false;

    public Trabalhador(String produto, int tempo){
        this.tempo = tempo;
        this.produto = produto;

    }

    public void run() {
        int i = 1;
        while (!acabou){
            System.out.println (i + " " + produto );

            try {
                sleep( (long) (Math.random() * tempo) );

            } catch (InterruptedException e) { }

            i++;
        }
        System.out.println("Terminei " + produto);
    }

    public void parar(int tempo){

        try {
            
                sleep( (long) (Math.random() * tempo) );

            } catch (InterruptedException e) { }

        this.acabou = true;
    }

}