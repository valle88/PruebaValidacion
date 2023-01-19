public class Comensales  implements Runnable{
    private String nombre;
    private int quantity = 1;
    private Magdalena action;
    private Mesa mesa;

    public Comensales(String nombre, Mesa mesa) {
        this.nombre = nombre;
        this.mesa = mesa;



    }

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            if (action.equals(Magdalena.EXTRAER)){
                this.mesa.cogerMagdalena(this.nombre);
            }



        }





    }
}
