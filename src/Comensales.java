public class Comensales  implements Runnable{
    private String nombre;
    private int prioridad;
    private Mesa mesa;

    public Comensales(String nombre, int prioridad, Mesa mesa) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.mesa = mesa;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            mesa.cogerMagdalena();
            System.out.println(nombre+ "ha cogido una magdalena de la mesa");

            try{
                Thread.sleep(10000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(nombre+ " se ha terminado de comer una magdalena");
            mesa.devolverMagdalena();
        }


    }
}
