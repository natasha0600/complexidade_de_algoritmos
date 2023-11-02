package linkedlist.tests;

import linkedlist.LinkedList;

public class IntegerProgram {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<Integer>();
        num.add(3);
        num.add(4);
        num.add(5);

        System.out.println("Tamanho: "+num.getSize());

        for(int i=0; i<num.getSize();i++){
            System.out.println(num.get(i).getValue());
        }
    }
}
