package linkedlist;

public class LinkedList <TYPE>{
    //in this class, i have only value and next, because my "thing" know just this, what's your value and your next
    //tipes of generics: String, Integer (whole numbers), Boolean, Byte, Character, Double, Short, Float, Long
    private Element <TYPE>first;
    private Element <TYPE> last;

    private int size;

    public LinkedList(){
        this.size = 0;
    }

    public Element getFirst() {
        return first;
    }

    public void setFirst(Element<TYPE> first) {
        this.first = first;
    }

    public Element <TYPE> getLast() {
        return last;
    }

    public void setLast(Element<TYPE>last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void add (TYPE newValue){
        Element<TYPE> newElement = new Element<TYPE>(newValue);//i'm put the value inside the "ball"
        if (first == null && last == null){
            this.first = newElement;
            this.last = newElement;

        }
        else{
            this.last.setNext(newElement);//here, the program get the last element, and set to the next new element
            this.last = newElement;//the last is the new element

        }
        this.size++;

    }
    public void remove (TYPE searchForValue){
        Element<TYPE> previous = null;//the first doesn't have a last
        Element<TYPE> current = this.first;
        for(int i =0; i<this.getSize(); i++){
            if(current.getValue().equals(searchForValue)){//here, the program get the current value and compare with the search value
                if(this.size == 1){ //if my size is 1, i found this guy and i remove
                    this.first = null;
                    this.last = null;
                }
                else if(current == first){
                    this.first = current.getNext();
                    current.setNext(null);
                }
                else if(current == last){
                    this.last = previous;
                    previous.setNext(null);
                }
                else{
                    previous.setNext(current.getNext());
                    current = null;
                }

                this.size--;//i need to put this line here because if i not put, the sistem repeat the last information but i don't need this, in this metod i want remove at the list
                break;//i founded the element so i doesn't need to found again
            }
            previous = current;
            current = current.getNext();
        }


    }
    public Element get(int position){
        Element current = this.first;//current is "atual" in portuguese
        for(int i =0; i<position; i++){
            if(current.getNext() != null){//here, if current has a next, the condition advance
                current = current.getNext();//current is himself and the next

            }

        }
        return current;
    }

    public IteratorLinkedList<TYPE>getIterator(){
        return new IteratorLinkedList<TYPE>(this.first);
    }
}
