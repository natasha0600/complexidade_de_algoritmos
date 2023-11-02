package linkedlist;

public class Element<TYPE> {

        private TYPE value;
        private Element<TYPE> next;


        public Element(TYPE newValue){//the variable inside the "ball" is receiving the value, there in my class LinkedList
            this.value = newValue;
        }



    public TYPE getValue() {
        return value;
    }

    public void setValue(TYPE value) {
        this.value = value;
    }

    public Element<TYPE> getNext() {
        return next;
    }

    public void setNext(Element<TYPE> next) {
        this.next = next;
    }



}
