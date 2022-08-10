
/**
Carla Pretorius
36184950
I_Do3
 */
public class testInsertSorted
{
    public static void main(String[] args){
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(0, new Integer(1));
        list.add(1, new Integer(2));
        list.add(2, new Integer(4));
        list.add(3, new Integer(6));
        list.add(4, new Integer(8));
        list.add(5, new Integer(5));
        
        list.sortList();
        list.insertSorted(new Integer(5));
        
        System.out.println("\f" + list);
    }
}
