package TP.Aula03;

public class Produtor extends Thread {
    private PilhaSincronizada pilha;

    public Produtor(PilhaSincronizada pilha){
        this.pilha = pilha;
    }

    public void run(){
        int colorIdx;
        for(int i = 0; i < 40; i++){

            colorIdx = (int) (Math.random() * 100);
            pilha.push(colorIdx);

            System.out.println("Criado : "+ colorIdx);

            try {
                sleep( (int) (Math.random() * 1000) );
            } catch (InterruptedException e) { }

        }
    }

}
