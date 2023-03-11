

class Sapo extends Thread{

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    private int pulo = 10; //Cm
    private static int linhaDeChegada;
    private static boolean acabou;


    public Sapo(String nome, int tamPulo, int distanciaFinal){
        this.linhaDeChegada = distanciaFinal;
        this.acabou = false;
        this.nome = nome;
        this.pulo = tamPulo;


    }
    
    private int pular(int startDistance){

        int endDistance = startDistance + pulo;

        return endDistance;
    }
    
    public void run (){
        int distancia = 0;
        

        do {

            distancia = pular(distancia);

            System.out.println("O sapo " + nome +" pulou " + pulo + "cm, já percorreu " + distancia + "cm");
            
        } while ( (distancia < linhaDeChegada) && (acabou == false) );

        if(acabou == false){
            this.acabou = true;

            System.out.println("O sapo " + nome +" ganhou a corrida!!!");

        }


    }
}