package TP.Aula03;

public class PilhaSincronizada {
    
    private int index = 0;
    private int[] buffer;
    private int tam_max = 100;

    public synchronized int pop(){
        
        while(index == 0){
            try {
                this.wait();
            } catch (InterruptedException e) { }
        }
        this.notify();

        index--;
        int i = this.buffer[index];

        int[] buf = new int[index];

        for (int j = 0; j < buf.length; j++) {
            buf[j] = this.buffer[j];
        }

        this.buffer = buf;
        return i;
    }

    public synchronized void push(int i){

        while(index == tam_max){
            try {
                this.wait();
            } catch (InterruptedException e) { }
        }
        this.notify();

        if(this.index == 0){

            this.buffer = new int[1];
            
            this.buffer[index] = i;
            this.index++;
        }else{

            int[] buf = new int[this.buffer.length + 1];

            for (int j = 0; j < this.buffer.length; j++) {
                buf[j] = this.buffer[j];
            }
            buf[index] = i;
            this.buffer = buf;
            
            this.index++;
        }

    }

}
