/* comment to test git */
public class Car {

	private String make;
	private String model;
	private String price;
	
	
	public Car(String m1, String mm2, String p) {
		this.make = m1;
		this.model = mm2;
		this.price = p;
		
	}
	
	
	
	
	
	
	
	public void report() {
		
		System.out.println("My car: ");

		System.out.println("make " + make);
		System.out.println("model : " + model );
		System.out.println("price: " + price );		
	}
	
}
