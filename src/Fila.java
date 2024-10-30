public class Fila {
    private int[] elementos;
    private int primeiro;
    private int ultimo;
    private int total;

    public Fila(int capacidade) {
        this.elementos = new int[capacidade]; // Inicializando o array da classe
        this.primeiro = 0;
        this.ultimo = 0;
        this.total = 0;
    }

    public void ENQUEUE(int elemento) {
        if (isFull()) {
            throw new RuntimeException("Fila cheia, não é possível adicionar mais itens");
        }
        elementos[ultimo] = elemento;
        ultimo = (ultimo + 1) % elementos.length;
        total++;
    }

    public int DEQUEUE() {
        if (EMPTY()) {
            throw new RuntimeException("Fila vazia, não é possível remover itens");
        }
        int elemento = elementos[primeiro];
        primeiro = (primeiro + 1) % elementos.length;
        total--;
        return elemento;
    }

    public boolean EMPTY() {
        return total == 0;
    }

    public boolean isFull() {
        return total == elementos.length;
    }

    public int SIZE (){
        return elementos.length;
    }
}
