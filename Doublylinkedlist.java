import sun.plugin2.applet.context.NoopExecutionContext;

/**
 * Created by user on 15/03/22.
 */
public class Doublylinkedlist<E> {
private Node<E>header;
    private Node<E>trailer;
    private int size=0;

    public Doublylinkedlist() {
        header=new Node<E>(null,null,null);
        trailer=new Node<E>(null,header,null);
        header.setNext(trailer);
    }
    public boolean isempty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public E first(){
        if (isempty())return null;
        return header.getNext().getElement();
    }
    public E last(){
        if (isempty())return null;
        return trailer.getPrev().getElement()  ;
    }
    private void addBetween(E element,Node<E>p,Node<E>s){
        Node<E>newst=new Node<E>(element,p,s);
        p.setNext(newst);
        s.setPrev(newst);
        size++;
    }
public void addfirst(E element){
    addBetween(element,header,header.getNext());
}
public void addlast(E element){
    addBetween(element,trailer.getPrev(),trailer);
}



private E remove(Node<E>x){
    Node<E>p=x.getPrev();
    Node<E>s=x.getNext();
    p.setNext(s);
    s.setPrev(p);
    size--;
    return x.getElement();
}

public E removefirst(){
    if (isempty())return null;
    return remove(header.getNext());
}
    public E removelast(){
        if (isempty())return null;
        return remove(trailer.getPrev());
    }






    private static class Node<E>
    {
   private E element;
    private    Node<E>prev;
      private  Node<E>next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }



}
