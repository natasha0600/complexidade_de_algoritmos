package complexidade_de_algoritmos;

import java.util.Scanner;

public class BuscaBinaria {
    //busca binária, complexidade O(log n), é um ótimo algoritmo de buscas, pois com um array de 1 milhão ele fez apenas 20 testes
    //se fosse na busca linear, seria feito 1 milhão de testes
    public static void main(String[] args) {
        int [] vetor = new int [1000000];

        for(int i = 0; i<vetor.length;i++){
            vetor[i]= i * 2;
            //System.out.println(vetor[i]);
        }

        System.out.println("Qual número você busca? ");
        Scanner sc = new Scanner(System.in);
        int buscado = sc.nextInt();

        int contador = 0;
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length -1;//menos 1 porque o tamanho do vetor é 8, lembrando que vai de 0 a 7
        int meio;



        while(inicio <= fim){
            meio =(int) ((inicio + fim)/2);
            contador++; //conta quantos testes a busca fez
            if(vetor[meio]==buscado){
                achou = true;
                break;
            }
            else if (vetor[meio]<buscado){
                inicio = meio+1; // mais um pq é uma posição DEPOIS do meio
            }
            else{//esse else só pode ser maior que o n° buscado
                fim = meio-1; // menos 1 pq é uma posição ANTES do meio

            }
        }
        System.out.println("Quantidade de testes "+contador);
        if(achou == true){
            System.out.println("Achou o n° ");
        }
        else{
            System.out.println("Não achou ");
        }
    }
}
