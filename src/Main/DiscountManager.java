package Main;

// Utilizando Patrón Singleton

public class DiscountManager {
    private static DiscountManager instance = null;
    
    private static int numeroInstancias=0;

    
    private DiscountManager(){
        // Constructor privado para evitar instancias directas
    }
    
    public static DiscountManager getInstance() throws InterruptedException{
        if(instance == null){
            Thread.sleep(500);
            /*
            Solo se permite la ejecucion del bloque por un solo proceso al mismo tiempo.
            Los demas procesos van quedando en espera hasta que el anterior que esta utilizando el bloque termine.
            */
            synchronized(DiscountManager.class){
                if(instance == null){
                    instance = new DiscountManager();
                    numeroInstancias++;
                    System.out.println("Numero de instancias creadas: " + numeroInstancias);
                    System.out.println("Descuento aplicado con exito!");
                }
            }
            
        }
        return instance;
    }
    
}
