import java.beans.DefaultPersistenceDelegate;

public class Mesa {

    private int cantidad;
    private boolean disponible;

    public Mesa( ) {
        this.cantidad = 15;
        this.disponible = true;

    }

    public synchronized void cogerMagdalena (){
        while (!disponible){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        cantidad--;
        if (cantidad ==0){
            disponible = false;
        }
        notifyAll();

    }
    public synchronized void devolverMagdalena(){
        while (disponible){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        cantidad++;
        if (cantidad >0){
            disponible = true;
        }
        notifyAll();
    }

}
