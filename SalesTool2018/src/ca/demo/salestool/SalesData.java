package ca.demo.salestool;

public class SalesData {

	private int data[] = {-1, 0, 4, 42, 84};
	
	public void display() {
		System.out.println("Data: ");
		for(int i = 0; i < data.length; i++) {
			
			System.out.println("Next value: " + data[i]);
		}
	}
	
}
