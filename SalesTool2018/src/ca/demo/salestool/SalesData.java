package ca.demo.salestool;

public class SalesData {

	 int data[] = {-1, 0, 4, 42, 84};
	
	public void display() {
		int sum  = 0;
		System.out.println("Data: ");
				for(int i : data) {
			
			System.out.println("Next value: " + i);
			sum += i;
		}
		
		System.out.println("Sum is: " +  sum +" es la suma total");
	}
	
}
