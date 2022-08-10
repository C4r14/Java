public class TestComputers //Simply a program to test our SU1 assignment 
{
	public static void main(String[]args)
	{
		//I will create the Laptop objects seperately and then place them into the ComputerObject array.
		//If you so wished you could create them directly into the array like so 
		// computers[0] = new Laptop(0,"123456789",5000,"98718224","ABCDEFG","Dual core I7",12,4000);
		//Both the scenarios would get the job done perfectly. 
		Laptop l1 = new Laptop(0,"123456789",5000,"98718224","ABCDEFG","Dual core I7",4,12,4000);
		Laptop l2 = new Laptop(1,"98763733",5400,"93348224","George","Dual core I9",4,10,3000);
		Laptop l3 = new Laptop(2,"12348784",500,"985566224","Jeffrey","Quad core I 11",8,14,5000);
		Laptop l4 = new Laptop(1,"98763735",5400,"12347563","Richard","Dual core I9",8,15,5000);
		Laptop l5 = new Laptop(3,"12348444",12000,"984266224","Frederick","Single core i5",4,12,2000);
		
		//Here I create the Desktop objects in a similar fashion to the Laptops done above. 
		Desktop d1 = new Desktop(1,"1234564",5000,"98718264","ABCDEFG","Dual core I7",4,"Building G",4000);
		Desktop d2 = new Desktop(1,"12342322",5400,"93348424","George","Dual core I9",8,"Building R2 Room 6",3000);
		Desktop d3 = new Desktop(3,"76732374",10000,"98556324","Jeffrey","Quad core I 11",16,"Building G room5",5000);
		Desktop d4 = new Desktop(4,"12353542",7000,"12347543","Richard","Dual core I9",20,"Building 4 room 2",5000);
		Desktop d5 = new Desktop(2,"98767874",12000,"98426124","Frederick","Single core i5",14,"Last computer in S4",2000);
		
		//Here we place our laptop and desktop objects into a ComputerObject array. 
		ComputerObject computers[] = new ComputerObject[10];
		computers[0] = d1;
		computers[1] = d3;
		computers[2] = d2;
		computers[3] = l1;
		computers[4] = l2;
		computers[5] = d4;
		computers[6] = l3;
		computers[7] = l4;
		computers[8] = d5;
		computers[9] = l5;
		
		for(int i =0 ; i< computers.length;i++)
		{
			//I could have said computers[i].toString() but the toString is overloaded by defualt and will thus be automatically called. 
			//Polymorphism ensures that the correct Depreciation method is used without us having to specify how the value should be calculated. 
			System.out.println("Computer " + i + " is a " + computers[i] + " and has a Annual Depreciation value of " + computers[i].AnnualDepreciation());
		}
		
		
	}
}
	
