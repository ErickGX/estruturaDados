import java.util.Scanner;

public class pilha {

    private int[] ArrayElementos;
    private int topo;
    private int capacidade;


    //Construtor para inicilizar a pilha
    public void CriarPilha(int tamanho){
        ArrayElementos =  new int[tamanho];
        capacidade = tamanho;
        topo = -1; //inicilamente a pilha esta vazia
    }

    //Metodo para inserir um elemento na pilha

    public void push(int item){
        if(isFull()){
            System.out.println("Pilha cheia. Não é possivel adicionar carai nenhum : " + item);
            return;
        }

        ArrayElementos[++topo] = item;

    }



    public int pop(){
        if (isEmpty()){
            System.out.println("Pilha vazia. Não há elementos para remover.");
            return -1;
        }
        return ArrayElementos[--topo];
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Pilha vazia não á elementos para procurar.");
            return -1;
        }
        return ArrayElementos[topo];

    }

    //Metodo para verificar se a pilha está vazia
    public boolean isEmpty() {
        return topo == -1;
    }

    //Metodo para verificar se a pilha está cheia
    public boolean isFull() {
        return topo ==  capacidade - 1; //se capacidade 5 para ser cheia topo tem q ser 4
        // array[3] = (posicicoes 0,1,2) , se tiver algo na pos 2 entao está preenchido tudo
        //capacidade(array.lenght exemplo) não pode ser maior que 2 entao capacidade
    }

    //metodo para verificar o tamanho atual da pilha
    public int size(){
        return topo + 1; // retorno em tamanho de itens total (1,2,3) , ao invez do tamanho array (0,1,2)
    }

    public int search(int itemProcurado){
        for (int i = topo; i >= 0 ; i--) {
            if (ArrayElementos[i] == itemProcurado){
                return topo - i;
            }
        }
        System.out.println("Valor não encontrado");
        return  -1; // Retorna -1 se o valor não for encontrado
    }


}
