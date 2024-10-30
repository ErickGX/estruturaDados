public class Main {

    public static void main(String[] args) {


        Fila fila =  new Fila(5);

        fila.ENQUEUE(100);


        System.out.println("Retirando elemento : " +fila.DEQUEUE());

        System.out.println(fila.EMPTY());

        fila.ENQUEUE(100);

        System.out.println(fila.isFull());

        System.out.println(fila.SIZE());

    }
}
