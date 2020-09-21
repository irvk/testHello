
public class App {

	public static void main(String[] args) {
  		
		//i am going to create an instance of a Greeting object
/*		Greeting greeting = new Greeting();
		greeting.doHelloGreeting();
		 
		System.out.println(" ----- ");
		
		
		Car tesla = new Car("tesla", "model 3 ", " 50000");
		
		Car clunker = new Car("mb", " 240d", "1700");
		
		
		tesla.report();
		clunker.report();
	
*/
		
		Drawer d1 = new Drawer("small", "socks");
		Drawer d2 = new Drawer("large", "trousers");
		Drawer d3 = new Drawer("medium", "shirt");
		
		Dresser dresser = new Dresser();
		dresser.setColor("blue");
		dresser.setType("hutch");
		dresser.addDrawer(d1);
		dresser.addDrawer(d2);
		dresser.addDrawer(d3);
		
		dresser.printDresser();
		
		
		
		
	}

}
