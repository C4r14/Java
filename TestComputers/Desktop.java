//This is the Desktop sub class that will inherit attributes/properties from the ComputerObject class
public class Desktop extends ComputerObject {
		//Our private variables that are only applicable to desktop computers can be found here
		private String officeNumber = "Room XX";
		private int residualValue = 2000;
		//Defualt constructor
		public Desktop(){
			//This is just a random set of values I assigned the constructor. 
			this(0,"XXXXXXXX",5000,"XXXXXXXX","ABCDEFG","Dual core I7",12,"Building XX Room X",4500);
		}

		//Here we make use of super to call the constructor from the Super class and then simply add our mutators for the desktops. 
		
		public Desktop(int usefulLife, String stockCode,int purchasingCost,String staffNumber,String serialNumber ,String cpuType, int ramAmount,String officeNumber, int residualValue){
			super(usefulLife,stockCode,purchasingCost,staffNumber,serialNumber,cpuType,ramAmount);
			setOfficeNumber(officeNumber);
			setResidualValue(residualValue);
			// once again - rather use the mutators than assigning the values here directly
		}

		 /**Getter/Accessor method for officeNumber*/ 
		public String getOfficeNumber(){
			return officeNumber; 
		 }

		/**Setter/Mutator method for officeNumber*/ 
		public void setOfficeNumber(String officeNumber){
			this.officeNumber = officeNumber; 
		 } 
		 
		 
		 /**Getter/Accessor method for residualValue*/ 
		public int getResidualValue(){
			return residualValue; 
		 }

		/**Setter/Mutator method for residualValue*/ 
		public void setResidualValue(int residualValue){
			this.residualValue = residualValue; 
		 } 
		//This is the implementation of our abstract method. We need not declare it as abstract but must ensure that the case and spelling is the same as in the Super class 
		 public double AnnualDepreciation(){
			return (getPurchasingCost() - this.residualValue) /  getUsfulLife();
		 }
		 //Our tString method for this class. Yours may look different and there are multiple correct ways to give info to the user. Just make sure it makes sense in your test program.
		 public String toString(){
			return ("Desktop computer with " + this.residualValue + " residual value and can be found at " + this.officeNumber);
		 }
}