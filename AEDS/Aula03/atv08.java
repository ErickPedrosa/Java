
public class atv08 {
    public static void main(String[] args) {
        int numLinhas = 5, k ;

        for(int i = 1; i < (numLinhas + 1); i++){
            

            for(int j = 1; j <= i; j++){
                
                k = i * j;  

                System.out.print(k + "\t");
            
            }
            System.out.println("");            
        }
    }
}
