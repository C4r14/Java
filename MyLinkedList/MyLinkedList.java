
public class MyLinkedList<E>
{
    private Node<E> head;
    private Node<E> tail;
    public MyLinkedList(){
     head = null;
     tail = null;
    }
    
    private static class Node<E>{
        E element;
        Node<E> next;
        public Node(E element)
        {
            this.element = element;
            next = null;
        }
    }
    
    public void append(E element){
        Node<E> newNode = new Node(element);
        
        if (head == null)
        {
            head = tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public String toString()
    {
        String result = "[";
        Node<E> ptr = head;
        while (ptr != null)
        {
            result += ptr.element.toString();
            if (ptr.next != null)
            {
                result += ",";
            }
            ptr = ptr.next;
        }
        result += "]";
        return result;
    }
    
    public MyLinkedList merge(MyLinkedList param)
    {
        Node<E> ptrThis;
        Node<E> ptrParam;
        MyLinkedList returnList = new MyLinkedList();
        
        ptrThis = head;
        ptrParam = param.head;
        
        if (head == null)
        {
            while (ptrParam != null)
            {
                returnList.append(ptrParam.element);
                ptrParam = ptrParam.next;
            }
            return returnList;
        }
        if (ptrParam == null)
        {
            while (ptrParam !=  null)
            {
                returnList.append(ptrParam.element);
                ptrParam = ptrParam.next;
            }
            return returnList;
        }
        
        while ((ptrParam != null) && (ptrThis != null))
        {
            if (((Comparable)ptrThis.element).compareTo(ptrParam.element) <= 0)
            {
                returnList.append(ptrThis.element);
                ptrThis = ptrThis.next;
            }
            else
            {
                returnList.append(ptrParam.element);
                ptrParam = ptrParam.next;
            }
        }
        
        if(ptrThis == null)
        {
            while (ptrParam != null)
            {
                returnList.append(ptrParam.element);
                ptrParam = ptrParam.next;
            }
        }
        if (ptrParam == null)
        {
            while (ptrThis != null)
            {
                returnList.append(ptrThis.element);
                ptrThis = ptrThis.next;
            }
        }
        
        return returnList;
    }
    
    public boolean delete(E item)
    {
        Node<E> ptr = head;
        Node<E> prevPtr = null;
        
        while ((ptr != null) && (((Comparable)ptr.element).compareTo(item) != 0))
        {
            prevPtr = ptr;
            ptr = ptr.next;
        }
        
        if (ptr == null)
        {
            return false;
        }
        if (ptr == head)
        {
            head = head.next;
        }
        else 
        {
            prevPtr.next = ptr.next;
        }
        if (ptr == tail)
        {
            tail = prevPtr;
        }
        return true;
    }
    
    public MyLinkedList getLastHalf()
    {
        MyLinkedList temp = new MyLinkedList<E>();
        Node<E> ptrCount = head;
        int count = 0;
        
        if (ptrCount == null)
        {
            return temp;
        }
        while (ptrCount != null)
        {
            count++;
            ptrCount = ptrCount.next;
        }
        ptrCount = head;
        count /= 2;
        
        for (int i = 0; i < count; i++)
        {
            ptrCount = ptrCount.next;
        }
        while (ptrCount != null)
        {
            temp.append(ptrCount.element);
            ptrCount = ptrCount.next;
        }
        return temp;
    }
}
