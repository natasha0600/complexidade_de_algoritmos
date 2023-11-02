package linkedlist;

import java.lang.reflect.Type;

public class IteratorLinkedList<TYPE> {
    private Element<TYPE> element;


    public IteratorLinkedList(Element<TYPE> current){
        this.element = current;

    }
    public boolean hasNext(){
        if(element.getNext()==null){
            return false;
        }
        else{
            return true;
        }
    }
    public Element<TYPE> getNext(){
        element = element.getNext();
        return element.getNext();
    }
}
