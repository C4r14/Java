// Computer.Java Ths is the Super class from whch laptops and Desktops will inherit the attributes of this class
public abstract class ComputerObject {
	//Here we declare all of the superclass variables that will be used by both Laptops and desktops
	//These are attributes of all computers
	private int usefulLife = 1; 
	private String stockCode = "XXXXXXXX";
	private int purchasingCost = 10000;
	private String staffNumber = "XXXXXXXX";
	private String serialNumber = "ABCDEFG";
	private String cpuType = "Multicore Parallel Threading";
	private int ramAmount = 12;
	  
	/**Default construct Need only be present and we do not need any additional constructors except the one below*/
	 protected ComputerObject() { }
	 
	/**Construct a full Computer object. We receive all of the variable information and place them in the correct private variables using our mutators*/
    /* we use mutators because validation is often done in mutators*/	
	protected ComputerObject(int usefulLife, String stockCode,int purchasingCost,String staffNumber,String serialNumber ,String cpuType, int ramAmount) { 
		setUsfulLife(usefulLife);
		setPurchasingCost(purchasingCost);
		setRamAmount(ramAmount);
		setStockCode(stockCode);
		setStaffNumber(staffNumber);
		setCpuType(cpuType);
		setSerialNumber(serialNumber);
	}
	 
	/**Getter/Accessor method for usefulLife*/ 
	public int getUsfulLife(){
		return usefulLife; 
	 }
	 

	/**Setter/Mutator method for usefulLife*/ 
	public void setUsfulLife(int usefulLife){
		this.usefulLife = usefulLife;
	 } 
	 /**Getter/Accessor method for purchasingCost*/ 
	 public int getPurchasingCost(){
		return purchasingCost; 
	 }
	 
	/**Setter/Mutator method for purchasingCost*/ 
	public void setPurchasingCost(int purchasingCost){
		this.purchasingCost = purchasingCost;
	 } 
	 
	 /**Getter/Accessor method for ramAmount*/ 
	 public int getRamAmount(){
		return ramAmount; 
	 }
	 
	/**Setter/Mutator method for ramAmount*/ 
	public void setRamAmount(int ramAmount){
		this.ramAmount = ramAmount;
	 } 
	 
	 
	 /**Getter/Accessor method for stockCode*/ 
	public String getStockCode(){
		return stockCode; 
	 }
	 
	/**Setter/Mutator method for stockCode*/ 
	public void setStockCode(String stockCode){
		this.stockCode = stockCode; 
	 } 
	 
	 
	  /**Getter/Accessor method for staffNumber*/ 
	public String getStaffNumber(){
		return staffNumber; 
	 }
	 
	/**Setter/Mutator method for staffNumber*/ 
	public void setStaffNumber(String staffNumber){
		this.staffNumber = staffNumber ;
	 } 

	 /**Getter/Accessor method for cpuType*/ 
	public String getCpuType(){
		return cpuType; 
	 }
	 
	/**Setter/Mutator method for cpuType*/ 
	public void setCpuType(String cpuType){
		this.cpuType = cpuType ;
	 } 
	 
	 
	 
	  /**Getter/Accessor method for serialNumber*/ 
	public String getSerialNumber(){
		return serialNumber; 
	 }
	 
	/**Setter/Mutator method for serialNumber*/ 
	public void setSerialNumber(String serialNumber){
		this.serialNumber = serialNumber ;
	 } 
	 
	/**Abstract method AnnualDepreciation*/ 
	//The implimentations of this method can be found in the Laptop and Desktop sub classes
	public abstract double AnnualDepreciation(); 
}

