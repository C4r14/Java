

public class testClass
{
    public static void main(String[] args)
    {
        MyLinkedList list = new MyLinkedList<Integer>();
        System.out.println("\fList without elements");
        MyLinkedList getLastHalfList = list.getLastHalf();
        System.out.println(getLastHalfList);
        System.out.println("\nList with elements");
        list.append(new Integer(1));
        list.append(new Integer(3));
        list.append(new Integer(5));
        list.append(new Integer(4));
        System.out.println("Original list: " + list.toString());
        getLastHalfList = list.getLastHalf();
        System.out.println("List with last elements: " + getLastHalfList.toString());
        list.append(new Integer(9));
        getLastHalfList = list.getLastHalf();
        System.out.println("Original list with uneven numbers: " + list.toString());
        System.out.println("List with uneven amount of elements: " + getLastHalfList.toString());
        
    }
}
