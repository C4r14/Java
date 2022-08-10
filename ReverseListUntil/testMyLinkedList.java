
public class testMyLinkedList
{
    public static void main(String[] args)
    {
        MyLinkedList list = new MyLinkedList<Integer>();
        MyLinkedList reverseList = new MyLinkedList<Integer>();
        System.out.println("\fReverse empty list: ");
        reverseList = list.reverseUntil(new Integer (8));
        System.out.println("Original list: " + list);
        System.out.println("reverseList: " + reverseList);
        
        System.out.println("\nReverse list until the first element: ");
        list.append(new Integer(1));
        reverseList = list.reverseUntil(list.getFirst());
        System.out.println("Original list: " + list);
        System.out.println("reverseList: " + reverseList);
        
        System.out.println("\nReverse entire list with one element: ");
        reverseList = list.reverseUntil(new Integer (2));
        System.out.println("Original list: " + list);
        System.out.println("reverseList: " + reverseList);
        
        System.out.println("\nReverse list with multiple elements. Reverse until 5: ");
        list.append(new Integer(2));
        list.append(new Integer(3));
        list.append(new Integer(4));
        list.append(new Integer(5));
        list.append(new Integer(6));
        list.append(new Integer(7));
        reverseList = list.reverseUntil(new Integer (5));
        System.out.println("Original list: " + list);
        System.out.println("reverseList: " + reverseList);
        
        System.out.println("\nReverse list where elements are reversed until the last element: ");
        reverseList = list.reverseUntil(list.getLast());
        System.out.println("Original list: " + list);
        System.out.println("reverseList: " + reverseList);
        
        System.out.println("\nReverse entire list with multiple elements: ");
        reverseList = list.reverseUntil(new Integer (-1));
        System.out.println("Original list: " + list);
        System.out.println("reverseList: " + reverseList);
    }
}
