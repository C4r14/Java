/**
 * Carla Pretorius (36184950)
 * I_Do 1 (due 17 August 2021)
 */
/*
 * // A dog can receive many different services such as 

       - Normal coat wash: ServiceType 1
       - Nail trimming: ServiceType 2
       - Coat wash and coat trim: ServiceType 3
       - Nail trimming and coat wash: ServiceType 4
       - Nail trimming, coat wash and coat trim: ServiceType 5
       
       The shop can collect the dog and drop the dog back off at home for ease of convenience.
    
 */
public class Dog extends AnimalBooking
{
    private double weight;
    
    public Dog(){}
    public Dog(String ownerName, String animalName, String contactNum, boolean collection, String serviceType, double weight){
        super(ownerName,animalName,contactNum,collection,serviceType);
        setWeight(weight);
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public String serviceTypeLong(){
    /*
     * - Normal coat wash: ServiceType 1
       - Nail trimming: ServiceType 2
       - Coat wash and coat trim: ServiceType 3
       - Nail trimming and coat wash: ServiceType 4
       - Nail trimming, coat wash and coat trim: ServiceType 5 
     */
        String output = "";
        switch (getServiceType())
        {
            case "D1": output = "Coat Wash"; break;
            case "D2": output = "Nail Trim"; break;
            case "D3": output = "Coat Wash & Coat Trim"; break;
            case "D4": output = "Coat Wash & Nail Trim"; break;
            case "D5": output = "Coat Wash, Coat Trim & Nail Trim"; break;
        }
        return output;
    }
    
    
    public double calcGroomingFee(){
        int serviceFee = 0;
        if (this.weight <= 15)
        {
            if (getCollection()) serviceFee += 30;
            switch (getServiceType())
            {
                case "D1": serviceFee += 70; break;
                case "D2": serviceFee += 60; break;
                case "D3": serviceFee += 120; break;
                case "D4": serviceFee += 125; break;
                case "D5": serviceFee += 150; break;
            }
        }
        else
        {
            if (getCollection()) serviceFee += 50;
            switch (getServiceType())
            {
                case "D1": serviceFee += 100; break;
                case "D2": serviceFee += 60; break;
                case "D3": serviceFee += 150; break;
                case "D4": serviceFee += 200; break;
                case "D5": serviceFee += 225; break;
            }
        }
        return serviceFee;
    }
    
    public int compareTo(AnimalBooking objAnimalBooking){
        if (this.getClass().equals(objAnimalBooking.getClass()))
        {
            Dog d = (Dog)objAnimalBooking;
            if (this.getWeight() == d.getWeight())
                return 0;
            else if (this.getWeight() < d.getWeight())
                return -1;
            else
                return 1;
            
        }
        else
            return this.getClass().getName().compareTo(objAnimalBooking.getClass().getName());
    }
    
    @Override
    public String toString(){
        String output = String.format("%s%-10s%-25s%-20.2f%-20s", super.toString(), "Dog", serviceTypeLong(), calcGroomingFee(), getWeight());
        return output;
    }
}
