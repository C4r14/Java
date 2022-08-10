
/**
 * Carla Pretorius (36184950)
 * I_Do 1 (due 17 August 2021)
 */
public abstract class AnimalBooking implements Comparable<AnimalBooking>
{
    private String ownerName;
    private String animalName;
    private String contactNum;
    private boolean collection;
    private String serviceType;
    public static int amountOfAnimals = 0;
    
    public AnimalBooking(){amountOfAnimals++;}

    public AnimalBooking(String ownerName, String animalName, String contactNum, boolean collection, String serviceType){
        setOwnerName(ownerName);
        setAnimalName(animalName);
        setContactNum(contactNum);
        setCollection(collection);
        setServiceType(serviceType);
        
        amountOfAnimals++;
    }
    
    public void setOwnerName( String ownerName){
        this.ownerName = ownerName;
    }
    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }
    public void setContactNum(String contactNum){
        this.contactNum = contactNum;
    }
    public void setCollection(boolean collection){
        this.collection = collection;
    }
    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }
    
    public String getOwnerName(){
        return this.ownerName;
    }
    public String getAnimalName(){
        return this.animalName;
    }
    public String getContactNum(){
        return this.contactNum;
    }
    public boolean getCollection(){
        return this.collection;
    }
    public String getServiceType(){
        return this.serviceType;
    }
    
    public abstract double calcGroomingFee();
    
    public String toString(){
        String output = String.format("%-20s%-20s%-20s%-20b", getOwnerName(), getAnimalName(), getContactNum(), getCollection());
        return output;
    }
    
    /*
       Big doggos
       bfjbasfukbakfbawk
       dvkejfvEJAFVJf
       ehvfJQVFJQeavf
       Jcfhasf
       
       Small doggos
       dwrithwkeugw
       wILFBADKSBFAL
       JKFWBDFUKSF*/
    
}
