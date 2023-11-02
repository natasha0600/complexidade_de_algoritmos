package complexidade_de_algoritmos;

import java.util.Scanner;

public class BuscaLinear {
    //aqui a busca é linear porque a medida que vai aumentando os dados, a quantidade de passos para a busca, também, exemplo: se possuo um vetor com 100 possiçoes, serão dados, no pior caso, 100 passos para percorrer o array
    //complexidade O(n)
    public static void main(String[] args) {
        int [] vetor = new int[8];

        for(int i =0; i<vetor.length;i++){
            //preenchendo o vetor com números aleatórios
            vetor[i] = (int)(Math.random()*10);//o "(int)" faz o cast, força a retornar um inteiro pois a classe Math.random() retorna double
            System.out.println(vetor[i]);
        }
        System.out.println("Qual número você busca? ");
        Scanner sc = new Scanner (System.in);
        int buscado = sc.nextInt();


        boolean achou = false;
        for(int i =0; i<vetor.length; i++){
            if(vetor[i]==buscado){
                achou = true;
                break;
            }
        }
        if(achou == true){
            System.out.println("Achou ");
        }
        else{
            System.out.println("Não achou ");
        }
    }
}
