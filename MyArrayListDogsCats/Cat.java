/**
 * Carla Pretorius (36184950)
 * I_Do 1 (due 17 August 2021)
 */
public class Cat extends AnimalBooking
{
    public Cat(){}
    public Cat(String ownerName, String animalName, String contactNum, boolean collection, String serviceType){
    super(ownerName,animalName,contactNum,collection,serviceType);
    }
    
    public String serviceTypeLong(){
        String output = "";
        switch (getServiceType())
        {
            case "C1": output = "Coat Wash"; break;
            case "C2": output = "Coat Wash & Coat Trim"; break;
        }
        return output;
    }
    public double calcGroomingFee(){
        double serviceFee = 0;
        /*
         * Coat Wash C1
         * Coat Wash and Trim C2
         * 
           */
        switch (getServiceType())
        {
            case "C1": serviceFee += 60; break;
            case "C2": serviceFee += 130; break;
        }
        if (getCollection())
        {
            serviceFee =+ 50;
        }
        return serviceFee;
    }
    
    public int compareTo(AnimalBooking objAnimalBooking){
        if (this.getClass().equals(objAnimalBooking.getClass()))
        {
            Cat c = (Cat)objAnimalBooking;
            return (this.getAnimalName().compareTo(c.getAnimalName()));
        }
        else
            return this.getClass().getName().compareTo(objAnimalBooking.getClass().getName());
    }
    
    @Override
    public String toString(){
        String output = String.format("%s%-10s%-25s%-20.2f", super.toString(), "Cat", serviceTypeLong(), calcGroomingFee());
        return output;
    }
}
