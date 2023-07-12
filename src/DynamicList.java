public class DynamicList {


    private class Node{
        Object element ;
        Node next ;

        public Node(Object element,Node next) {
            this.element = element;
            this.next = next ;
        }
    }

    private Node head;

    private Node tail;

    private int count;

    public DynamicList(){
        this.count = 0 ;
        this.tail = null ;
        this.head = null ;
    }

    public void add(Object item){

    }
}
