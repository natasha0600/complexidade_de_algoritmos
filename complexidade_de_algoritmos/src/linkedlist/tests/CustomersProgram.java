package linkedlist.tests;

import linkedlist.Client;
import linkedlist.LinkedList;

public class CustomersProgram {
    public static void main(String[] args) {
       LinkedList<Client> c = new LinkedList<Client>();
       c.add(new Client("1234","Jão"));
       c.add(new Client("4567","Maria"));
        c.add(new Client("7890","Vania"));


        System.out.println("Tamanho: "+c.getSize());

        for(int i=0; i<c.getSize();i++){
            System.out.println(c.get(i).getValue());

        }
    }
}
