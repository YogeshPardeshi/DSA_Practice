public class LinkedList<T> {
 Node<T> head;
// Node<T> tail;
 int length = 0;
    public LinkedList() {
        head = null;
//        tail = null;
        length =0;
    }

// public LinkedList(T value) {
//     Node<T> newNode = new Node<>(value);
//        head = newNode;
////        tail = newNode;
//        length = 1;
// }

public void prepend(T newValue) {

        Node<T> tempNode = head;
       Node<T> newNode = new Node<>(newValue);
        if(tempNode == null) {
            head = newNode;
//            tail = newNode;
        } else {
//            head = newNode;
//            newNode.next = tempNode;

            newNode.next = head;
            head =  newNode;
        }
        length++;


}

public void append(T newValue) {

        Node<T> tempNode  = head;
        Node<T> newNode = new Node<>(newValue);
    if(tempNode == null) {
        head = newNode;
//        tail = newNode;
    } else {
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
//        tempNode.value = newValue;
//        tail = tempNode;
        length++;
    }
}

    public Node<T> removeLast () {

        Node<T> currentNode = head;
        Node<T> nodeToBeRemoved = null;

        if (length == 0){
            return null;
        } else if(length == 1) {
            head = null;
            length =0;
            return currentNode;
        }else {
            while (currentNode.next.next !=null) {
                currentNode =currentNode.next;
            }
        }
        nodeToBeRemoved = currentNode.next;
        currentNode.next= null;

        length --;
        return nodeToBeRemoved;
    }

    public Node<T> removeFirst () {
        if (length ==0){
            head = null;
            return head;
        }
        Node<T> currentNode = head;
        head = head.next;
        currentNode.next = null;
        length--;
        return currentNode;

    }

        public void printLinkedList() {
        Node<T> temp = head;
        while (temp != null) {
           System.out.print(temp.value);
            if (temp.next!= null) {
                System.out.print(" -> ");
            } else {
                System.out.print(" ->  NULL ");
            }

            temp = temp.next;

        }
    }

    public Node<T> getNode(int index)  {
        if (index < 0 || index>=length)  {
            return null;
        }
        Node<T> tempNode  = head;
        for (int i = 0; i < index; i++) {
          tempNode = tempNode.next;
        }
        return tempNode;

    }

    public boolean setNode(int index, T value) {

        Node<T> tNode = getNode(index);
        if (tNode != null) {
            tNode.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, T value) {

        if(index< 0 || index > length) {
            return false;
        } else if (index == 1) {
            prepend(value);
            return true;
        } else if (index == length){
            append(value);
            return true;
        } else {

            Node<T> beforeNode = getNode(index -1);
            Node<T> afterNode = beforeNode.next;
            Node<T> newNode = new Node<>(value);
            newNode.next = afterNode;
            beforeNode.next = newNode;

            length++;
            return  true;

        }

    }

    public Node<T> reverseRecursively(Node<T> head) {
        if(head == null || head.next == null) return head;

        Node<T> newNode = reverseRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }


    public void reverseList() {
        Node<T> prev = null;
        while(head != null) {
            Node<T> next = head.next;
            head.next = prev;
            prev= head;
            head = next;
            System.out.println();
            printLinkedList();
            System.out.println();

        }
        head = prev;
    }
    public void reverse() {

        Node<T> prev = null;
        while(head!=null) {
            Node<T> next = head.next;
            head.next = prev;
            prev= head;
            head = next;
        }
//        Node<T> previousNode = head;
//        Node<T> currentNode = head.next;
//
//        if (length >1) {
//            while (currentNode != null) {
//                Node<T> nextNode = currentNode.next;
//                currentNode.next = previousNode;
//                // update
//                previousNode = currentNode;
//                currentNode = nextNode;
//            }
//            head.next = null;
//            head = previousNode;
//
//        }

    }

    public  Node<T> findMiddleNode() {

        Node<T> slow_Pointer = head;
        Node<T> fast_Pointer = head;


        while (fast_Pointer != null && fast_Pointer.next !=null) {

            slow_Pointer = slow_Pointer.next;
            fast_Pointer = fast_Pointer.next.next;
        }


        return slow_Pointer;
    }

    public  boolean isCyclicalLinkList() {

        Node<T> slow_Pointer = head;
        Node<T> fast_Pointer = head.next;


        while (slow_Pointer != fast_Pointer) {

            if (fast_Pointer != null && fast_Pointer.next != null) return false;
            slow_Pointer = slow_Pointer.next;
            fast_Pointer = fast_Pointer.next.next;
        }


        return true;
    }


    public  boolean isPalindrome() {

        Node<T> slow_Pointer = head;
        Node<T> fast_Pointer = head;


        while (fast_Pointer != null && fast_Pointer.next !=null) {

            slow_Pointer = slow_Pointer.next;
            fast_Pointer = fast_Pointer.next.next;
        }

        slow_Pointer = reversed(slow_Pointer);
        fast_Pointer = head;

        while (slow_Pointer != null) {
            if(slow_Pointer.value != fast_Pointer.value) {
                return false;
            }
            slow_Pointer = slow_Pointer.next;
            fast_Pointer = fast_Pointer.next;
        }

        return true;
    }

    Node<T> reversed(Node<T> head) {

        Node<T> prev = null;
        while (head != null) {
            Node<T> next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return  prev;

    }

    Node<T> partialReversal(Node<T> head, int m, int n) {

        if (head == null) return head;

        Node<T> current_node = head;
        Node<T> prev = null;

        while (m > 1) {
            prev = current_node;
            current_node = current_node.next;
            m--;
            n--;
        }

        Node<T> connect = prev;
        Node<T> tail = current_node;

        while(n > 0) {
            Node<T> next_node = current_node.next;
            current_node.next = prev;
            prev = current_node;
            current_node = next_node;
            n--;
        }
        if(connect != null) {
            connect.next = prev;
        } else {
            head = prev;
        }

        tail.next = current_node;
        return  prev;

    }

    public Node<T> joinOddEvenList(Node<T>  head) {

        Node<T> oddNode = head;
        Node<T> evenNode = head.next;

        Node<T> evenHead = evenNode;
        if (head== null || head.next == null || head.next.next == null)  return head;

        while(evenNode != null && evenNode.next != null) {
            oddNode.next = oddNode.next.next;
            oddNode = oddNode.next;

            evenNode.next = evenNode.next.next;
            evenNode = evenNode.next;
        }
        oddNode.next = evenHead;
    return  head;

    }

    public Node<T> swapNodes(Node<T> headNode) {

        Node tempNode = new Node(0);
        tempNode.next =  headNode;

        Node<T> currentNode = tempNode;

        if(headNode == null || headNode.next == null) return headNode;

        while(currentNode.next != null && currentNode.next.next != null) {

            Node<T> first_node = currentNode.next;
            Node<T> seconde_node = currentNode.next.next;

            first_node.next = seconde_node.next;
            currentNode.next = seconde_node;
            currentNode.next.next = first_node;

            currentNode = currentNode.next.next;
        }
        head = tempNode.next;
        return tempNode.next;
    }

    public void reorderList (Node<T> head) {

        if (head == null || head.next == null) return;
        //  head of first list
        Node<T> l1 = head;
        //  head of second list
        Node<T> slow = head;
        // tail of second list
        Node<T> fast = head;
        // tail of first list
        Node<T> prev = head;

        while (fast != null && fast.next !=null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        Node<T> l2 = reversed(slow);

        merge(l1,l2);
    }

    public void merge(Node<T> l1, Node<T> l2) {

        while (l1 != null) {
            Node<T> l1_next = l1.next;
            Node<T> l2_next = l2.next;

            l1.next = l2;

            if (l1_next == null) {
                break;
            }
            l2.next = l1_next;
            l1 = l1_next;
            l2 = l2_next;
        }

    }

}
