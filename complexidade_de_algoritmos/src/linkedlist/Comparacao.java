package linkedlist;

import java.util.ArrayList;

public class Comparacao {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        //adicionar elementos no array
        int limite = 1000;
        long tempoInicial = System.currentTimeMillis();//pega a hora atual do sistema
        long tempoFinal;
        for(int i=0; i<limite;i++){
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou "+limite+ " elementos no vetor");

        System.out.println(tempoFinal-tempoInicial);

        //adicionando na lista ligada

        tempoInicial = System.currentTimeMillis();//pega a hora atual do sistema

        for(int i=0; i<limite;i++){
            list.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nAdicionou "+limite+ " elementos na lista");
        System.out.println(tempoFinal-tempoInicial);

        //ler valores no vetor
        for(int i=0; i<vetor.size();i++){//vetor.size é um metodo do ArrayList
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura do vetor ");
        System.out.println(tempoFinal-tempoInicial);

        IteratorLinkedList<Integer> iterator = list.getIterator();
        while(iterator.hasNext()){//enquanto o iterator tiver um proximo, ele vai pegar todos os elementos da lista de forma diferente, é mais rápido
            iterator.getNext();

        }

        //ler valores da lista
        for(int i=0; i<list.getSize();i++){//vetor.size é um metodo do ArrayList
            list.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura na lista ");
        System.out.println(tempoFinal-tempoInicial);
    }
}
