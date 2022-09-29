public class fibonacci {
    public static void main(String[] args) {
        
        int atual = 1, ant = 1;

        System.out.println(atual + " ");

        while(atual < 100){

            System.out.println(atual + " ");

            atual = atual + ant;
            ant = atual - ant;

        }

    }
}
