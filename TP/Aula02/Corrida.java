

public class Corrida {
    
    public static void main(String[] args) {

        int distanciaFinal = 1000; //cm
    
        Sapo sapo1 = new Sapo("cururu", 25, distanciaFinal); 
        Sapo sapo2 = new Sapo("boi", 22, distanciaFinal); 
        Sapo sapo3 = new Sapo("arabe", 24, distanciaFinal); 
        Sapo sapo4 = new Sapo("corredor", 20, distanciaFinal); 
        

        sapo1.start();
        sapo2.start();
        sapo3.start();
        sapo4.start();


    }
}
