/**
 * Carla Pretorius (36184950)
 * I_Do 1 (due 17 August 2021)
 */
public class TestAnimalBookings
{
    public static void main(String[] args)
    {
        System.out.print("\f");
        
        MyArrayList<AnimalBooking> list = new MyArrayList<>();
        //AnimalBooking[] arrAnimalBooking = new AnimalBooking[10];
        AnimalBooking a1 = new Dog("Pieter Nel","Max","0625589456",true,"D4", 15.8);
        AnimalBooking a6 = new Cat("Delmain Opperman", "Tigger", "0745563455", false, "C2");
        AnimalBooking a2 = new Dog("Marnu Pretorius","Jonny","0627582556",false,"D1", 5);
        AnimalBooking a3 = new Dog("Leon Vieira","Stoney","0535482556",false,"D2", 15);
        AnimalBooking a4 = new Dog("Scott Sassman","Poncho","055448856",false,"D2", 15);
        AnimalBooking a5 = new Cat("Franco Jakobs", "Gertie", "0511613455", true, "C1");
        AnimalBooking a7 = new Cat("Dorothy Reeder", "Balie", "0877613455", true, "C2");
        
        list.add(0,a1);
        list.add(1,a6);
        list.add(2,a3);
        list.add(3,a4);
        list.add(4,a5);
        list.add(5,a2);
        list.add(6,a7);
        
        System.out.println("Unsorted mixed dogs and cats:");
        System.out.printf("%-20s%-20s%-20s%-20s", "Owner Name", "Animal Name", "Contact Num", "Collection");
        System.out.printf("%-10s%-25s%-20s%-20s\n","Animal", "Service Type", "Grooming Fee", "Weight");
        for (int i = 0; i <= list.getSize() - 1; i++)
        {
                System.out.println(list.get(i).toString());
        }
        
        System.out.println("\nSorted mix of dogs and cats:");
        System.out.printf("%-20s%-20s%-20s%-20s", "Owner Name", "Animal Name", "Contact Num", "Collection");
        System.out.printf("%-10s%-25s%-20s%-20s\n","Animal", "Service Type", "Grooming Fee", "Weight");
        list.sortList();
        for (int i = 0; i <= list.getSize() - 1; i++)
        {
                System.out.println(list.get(i).toString());
        }
        
        System.out.println("\nDogs:");
        System.out.printf("%-20s%-20s%-20s%-20s", "Owner Name", "Animal Name", "Contact Num", "Collection");
        System.out.printf("%-10s%-25s%-20s%-20s\n","Animal", "Service Type", "Grooming Fee", "Weight");
        for (int i = 0; i <= list.getSize() - 1; i++)
        {
            if (list.get(i) instanceof Dog)
            {
                System.out.println(list.get(i).toString());
            }
        }
        
        System.out.println("\nCats:");
        System.out.printf("%-20s%-20s%-20s%-20s", "Owner Name", "Animal Name", "Contact Num", "Collection");
        System.out.printf("%-10s%-25s%-20s\n","Animal","Service Type", "Grooming Fee");
        for (int i = 0; i <= list.getSize() - 1; i++)
        {
            if (list.get(i) instanceof Cat)
            {
                System.out.println(list.get(i).toString());
            }
        }
        
    heaviestDog(list);
    }
    private static void heaviestDog(MyArrayList list)
    {
        double weight = 0;
        Dog HeaviestDog = null;
        for (int i = 0; i < list.getSize(); i++)
        {
            if (list.get(i) instanceof Dog)
            {
                Dog objDog = (Dog) list.get(i);
                if (objDog.getWeight() > weight)
                {
                    weight = objDog.getWeight();
                    HeaviestDog = objDog;
                }
            }
        }
        System.out.print("\nHeaviest Dog:\n");
        System.out.printf("%-20s%-20s%-20s%-20s", "Owner Name", "Animal Name", "Contact Num", "Collection");
        System.out.printf("%-10s%-25s%-20s%-20s\n","Animal", "Service Type", "Grooming Fee", "Weight");
        System.out.print(HeaviestDog.toString());         
        
    }
    }
