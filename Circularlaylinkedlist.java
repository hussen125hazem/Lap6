/**
 * Created by user on 15/03/22.
 */
public class Circularlaylinkedlist<E> {
    private Node<E>tail=null;
    private int size=0;
    public boolean isempty()
    {

        return size==0;
    }
    public int size()
    {

        return size;
    }
    public E first(){
        if (isempty())return null;
        return tail.getNext().getElement();
    }
    public E last(){
        if (isempty())return null;
        return tail.getElement();
    }
    public void rotate(){
        if (tail!=null)
            tail=tail.getNext();
    }
public void addfirst(E element){
    if (isempty()){
        tail=new Node<E>(element,null);
        tail.setNext(tail);
    }
    else {
     Node<E>newst=new Node<E>(element,tail.getNext());
        tail.setNext(newst);
    }
    size++;

}
public void addlist(E element){
    addfirst(element);
    tail=tail.getNext();
}
public E removefirst()
{
    if (isempty())return null;
    Node<E> x=tail.getNext();
    if (x==tail)
    tail=null;
    else
    tail.setNext(x.getNext());
    size--;
    return x.getElement();

}




    private static class Node<E>{
        private E element;
        private Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
