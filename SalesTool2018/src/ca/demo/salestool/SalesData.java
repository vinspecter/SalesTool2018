package ca.demo.salestool;

public class SalesData {

	private int data[] = {0, 4, 42};
	
	public void display() {
		int sum  = 0;
		System.out.println("Data: ");
		for(int i = 0; i < data.length; i++) {
			System.out.println("Next value: " + data[i]);
			sum += data[i];
		}
		
		System.out.println("Sum is: " +  sum);
	}
	
}
