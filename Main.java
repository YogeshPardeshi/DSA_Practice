// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.prepend(4);
        integerLinkedList.prepend(5);
        integerLinkedList.prepend(3);
        integerLinkedList.prepend(66);
        integerLinkedList.prepend(77);

//        integerLinkedList.append(99);
//        integerLinkedList.append(155);
//        integerLinkedList.append(37);


        integerLinkedList.printLinkedList();
//        System.out.println("");
//        System.out.println();
//
//        Node<Integer> removedNode = integerLinkedList.removeLast();
//        System.out.print("after removal");
//        integerLinkedList.printLinkedList();
//        System.out.println();
//
//        System.out.print("removed last Node "+removedNode.value);
//
//        System.out.print("removed first Node ");
//
//        Node<Integer> removeFirst = integerLinkedList.removeFirst();
//        integerLinkedList.printLinkedList();

//        Node<Integer> nodeAtIndex =  integerLinkedList.getNode(3);
        System.out.println();

//        System.out.println(" index at node " + nodeAtIndex.value);

//        integerLinkedList.setNode(3, 565);

//        integerLinkedList.printLinkedList();

//        integerLinkedList.insert(3,654);
//        System.out.println();

        System.out.println();
//        integerLinkedList.reverse();
//        integerLinkedList.reverseList();
//        integerLinkedList.head = integerLinkedList.reverseRecursively(integerLinkedList.head);
//        Node<Integer> nodeAtIndex =  integerLinkedList.getNode(3);

//        Node<Integer> middleNode = integerLinkedList.findMiddleNode();
//        System.out.println(middleNode.value);
//
//
//        LinkedList<Integer> cyclicalLinkList = new LinkedList<Integer>();
//        cyclicalLinkList.append(1);
//        cyclicalLinkList.append(2);
//        cyclicalLinkList.append(3);
//
//        System.out.println("is cyclical ? "+ cyclicalLinkList.isCyclicalLinkList());
//        integerLinkedList.printLinkedList();

//        LinkedList<Integer> pendromList = new LinkedList<Integer>();
//        pendromList.append(1);
//        pendromList.append(2);
//        pendromList.append(3);
//        pendromList.append(3);
//        pendromList.append(2);
//        pendromList.append(1);
//
//        System.out.println("is palindrome -->"+pendromList.isPalindrome());

//        integerLinkedList.partialReversal(integerLinkedList.head, 3, 6);
//        integerLinkedList.joinOddEvenList (integerLinkedList.head);

//        integerLinkedList.swapNodes (integerLinkedList.head);
        integerLinkedList.reorderList (integerLinkedList.head);

        integerLinkedList.printLinkedList();
    }
}