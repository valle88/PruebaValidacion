public class Main {
    public static void main(String[] args) {
        Mesa mesita = new Mesa();
        Comensales micomensal = new Comensales("Valle",1,mesita);
        Thread  comensal = new Thread(micomensal);


        Comensales micomensal2 = new Comensales("Pipol",5, mesita);
        Thread  comensal2 = new Thread(micomensal2);

        Comensales micomensal3 = new Comensales("Lupe",10, mesita);
        Thread  comensal3 = new Thread(micomensal3);


        try {

            comensal.start();

            comensal2.start();
            comensal3.start();
            comensal. join();
            comensal2.join();
            comensal3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}