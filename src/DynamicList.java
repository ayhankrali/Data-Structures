public class DynamicList {


    private static class Node{
        Object element ;
        Node next ;

        public Node(Object element, Node tail) {
            this.element = element;
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
        if (head == null){
            head = new Node(item, tail);
            tail = head ;
        }else {
            Node newNode = new Node(item, tail);
            tail = newNode ;
        }
        count ++ ;
    }


    public Object remove (int index){
        if (index >= count || index < 0 ){
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }

        int currentIndex = 0 ;
        Node currentNode = head ;
        Node prevNode = null ;

        while (currentIndex < index) {

            prevNode = currentNode;

            currentNode = currentNode.next;

            currentIndex++;

        }

        //remove the element
        if (count == 0) {

            head = null;

            tail = null;

        } else if (prevNode == null) {

            head = currentNode.next;

        } else {

            prevNode.next = currentNode.next;

        }

        return currentNode.element;
    }

    public int remove(Object item){

        // Find the element containing searched item

        int currentIndex = 0;

        Node currentNode = head;

        Node prevNode = null;

        while (currentNode != null) {

            if ((currentNode.element!=null &&

                    currentNode.element.equals(item)) ||

                    (currentNode.element==null) && (item==null)){

                break;

            }

            prevNode = currentNode;

            currentNode = currentNode.next;

            currentIndex++;

        }



        if (currentNode != null) {

            // Element is found in the list. Remove it

            count--;

            if (count==0) {

                head = null;

                tail = null;

            } else if (prevNode == null) {

                head = currentNode.next;

            } else {

                prevNode.next = currentNode.next;

            }

            return currentIndex;

        } else {

            // Element is not found in the list

            return -1;

        }

    }





    }

