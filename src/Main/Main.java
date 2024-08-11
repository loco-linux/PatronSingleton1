package Main;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
    for(int i=0; i<1000;i++){    
        new Thread(()->{
            try {
                DiscountManager.getInstance();
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }){            
        }.start();
        
    }
    }
}
