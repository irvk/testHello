
public class Dresser {

	private String color;
	private String type;
	private Drawer[] drawers = new Drawer[3];
	int currentIndex = 0;
	
	public void addDrawer(Drawer drawer) {
		//add to drawer.
//		drawers.
 		
		drawers[currentIndex] = drawer;
		currentIndex++;
	}
	
	public void setColor(String color) {
		 
		this.color = color;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	public void printDresser() {
		System.out.println("Color: " + color);
		System.out.println("Type: " + type);
		
		for(int i = 0; i < drawers.length; i++)
			drawers[i].print();
		
	}
	
	
}
