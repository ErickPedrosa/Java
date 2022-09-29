public class atv07 {
    public static void main(String[] args) {
        
        int num = 13;

        while(num != 1){
            
            System.out.print(num + " -> ");
            
            if (num % 2 == 0) {
                num = num / 2;

            }else{
                num = (num * 3) + 1;
            
            }

        }

        System.out.println(num);

    }
}
