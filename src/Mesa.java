import java.beans.DefaultPersistenceDelegate;

public class Mesa {

    private int magdalenas = 15;
    int quantity = 1;

    public Mesa(int magdalenas ) {
        this.magdalenas = magdalenas;

    }

    public void cogerMagdalena (String name){
        String message = name;


            this.magdalenas -= quantity;
            message += "he cogido" + quantity+ "magdalena";

        System.out.println(message);
        this.printMagdalenas();


    }



    synchronized  private void printMagdalenas(){
        System.out.println("Magdalenas actuales: " +this.magdalenas);
    }

}
