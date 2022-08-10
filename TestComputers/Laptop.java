public class Laptop extends ComputerObject { //This class inherits attributes from its super class ComputerObject. 
	private int screenSize = 14;
	private int insurancePolicy = 2000;

	public Laptop(){
		this(0,"XXXXXXXX",5000,"XXXXXXXX","ABCDEFG","Dual core I7",4,12,3000);
	}

	public Laptop(int usefulLife, String stockCode,int purchasingCost,String staffNumber,String serialNumber ,String cpuType, int ramAmount,int screenSize, int insurancePolicy){
		//Call the constructor from our super class and set all of the appropriate values. 
		super(usefulLife,stockCode,purchasingCost,staffNumber,serialNumber,cpuType,ramAmount);
		setScreenSize(screenSize);
		setInsurancePolicy(insurancePolicy);
		
	}

	 /**Getter/Accessor method for screenSize*/ 
	public int getScreenSize(){
		return screenSize; 
	 }

	/**Setter/Mutator method for screenSize*/ 
	public void setScreenSize(int screenSize){
		this.screenSize = screenSize; 
	}

	 /**Getter/Accessor method for insurancePolicy*/ 
	public int getInsurancePolicy(){
		return insurancePolicy; 
	 }

	/**Setter/Mutator method for insurancePolicy*/ 
	public void setInsurancePolicy(int insurancePolicy){
		this.insurancePolicy = insurancePolicy; 
	}

	//This is the implimentation of the abstract class and will vary depending on the size of the screen. 
	public double AnnualDepreciation(){
		 if(screenSize >= 12)
		 {
			 return getPurchasingCost() * 0.20;
		 }else
		 {
			 return getPurchasingCost() * 0.25;
		 }
	 }
	 
	 //Our toString method. This may look different in your version. Just make sure your output looks fine in the test program. 
	 public String toString(){
		return ("Laptop computer with " + getScreenSize() + " screen size and can has an insurance policy of R" + getInsurancePolicy());
	 }
 
 }