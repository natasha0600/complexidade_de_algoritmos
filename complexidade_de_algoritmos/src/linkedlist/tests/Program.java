package linkedlist.tests;

import linkedlist.LinkedList;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Program {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<String>();
        //i can criat a list of anything, i can criate a class, example, Client and to put my list with this type
        list.add("AC");
        list.add("BA");
        list.add("RS");
        list.add("DF");

        System.out.println("Primeiro "+list.getFirst().getValue());
        System.out.println("Ultimo "+list.getLast().getValue());

        //to stop print every time "element 0,1,2,3..." i could to do a for:
        for(int i=0; i<list.getSize();i++){
            System.out.println(list.get(i).getValue());
        }

        //remove the element "RS"
        list.remove("DF");
        System.out.println("Remove state RS ");
        list.add("SP");
        System.out.println("Adicionou o estado SP ");
        list.remove("AC");
        list.remove("BA");
        list.remove("RS");
        list.remove("SP");
        list.add("RJ");

        System.out.println("Tamanho: "+list.getSize());

        for(int i=0; i<list.getSize();i++){
            System.out.println(list.get(i).getValue());
        }

    }



}
