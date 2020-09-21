
public class Drawer {

	private String size;
	private String stuff;
	
	public Drawer(String size, String stuff) {
		
		this.size = size;
		this.stuff = stuff;
		
	}
	
	public void print() {
		System.out.println("Size " + size);
		System.out.println("Stuff " + stuff);
	}
	
	
}
