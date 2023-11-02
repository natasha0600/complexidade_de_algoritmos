package complexidade_de_algoritmos;

public class BubbleSort {
    //algoritmo de ordenação, é lento mas para pequenas conjuntos de dados ele serve
    //o Bubble sort vai fixar numa posição, uma variável fixa uma posição, e a outra variável vai ficar andando testando o resto dos elementos
    //mas ele tem um problema com perfonmance pois ele faz vários passos para ordenar
    //O Bubble Sort passa pelo vetor e garante que o menor elemento fica pra esquerda

    public static void main(String[] args) {
        int [] vetor = new int [100000];

        for (int i = 0; i<vetor.length;i++){
            vetor[i] = (int)(Math.random()*vetor.length);
            //System.out.println(vetor[i]);
        }
        //testante o tempo que o Bubble Sort ordena o vetor
        long inicio = System.currentTimeMillis();
        long fim;

        //BUBBLE SORT O(N^2)
        int aux; //tive que criar uma variável auxiliar para o i fixar em uma posição, o j andar no vetor e essa auxiliar, ira armazenar as coisas que ficaram para a esquerda para que ñ se percam
        for(int i =0; i<vetor.length;i++){//for de complexidade O(N)
            for(int j = i+1; j<vetor.length;j++){//for de comolexidade O(N-1).    Fica "j = i+1" porque toda vez que o j avança, é resultado do i + a próxima posição
                if(vetor[i]>vetor[j]){//se o elemento na posição i for maior que o j, quer dizer que tenho um maior pra esquerda e um menor pra direita, e o meu algoritmo quer ordenar isso
                    aux = vetor[j];
                    vetor[j]= vetor[i];
                    vetor[i]=aux;

                }

            }
        }
        fim = System.currentTimeMillis();//testando o tempo que o Bubble Sort leva para ordenar o vetor
        System.out.println("tempo: "+(fim-inicio));
        /*
        System.out.println("Vetor ordenado ");
        for (int i = 0; i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
         */
    }
}
