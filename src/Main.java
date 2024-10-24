import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        pilha Pilha = new pilha();

        Pilha.CriarPilha(5);

        Pilha.push(10);
        Pilha.push(20);
        Pilha.push(30);
        Pilha.push(40);
        Pilha.push(50);

        System.out.println("Tamanho da pilha :" +Pilha.size());

        System.out.println("Posicao na pilha do item procurado : " + Pilha.search(50));

        System.out.println("Retirando um item do topo da pilha : " +Pilha.pop());


        System.out.println("Tamanho da pilha :" +Pilha.pop());

        System.out.println("Posicao na pilha do item procurado : " + Pilha.search(20));











    }
}
