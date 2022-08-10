

public class testClass
{
    public static void main(String[] args)
    {
        MyLinkedList list = new MyLinkedList<Integer>();
        MyLinkedList listPalin = new MyLinkedList<Integer>();
        System.out.println("\fList with no elements");
        System.out.println(list.toString());
        System.out.println("Palindrome");
        listPalin = list.makePalindrome();
        System.out.println(listPalin.toString());
        System.out.println("\nNormal list");
        list.append(new Integer(1));
        list.append(new Integer(2));
        list.append(new Integer(3));
        System.out.println(list.toString());
        System.out.println("Palindrome");
        listPalin = new MyLinkedList<Integer>();
        listPalin = list.makePalindrome();
        System.out.println(listPalin.toString());
        
    }
}
