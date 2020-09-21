
public class Greeting {

	public void doHelloGreeting() {
		formatOutput() ;
		System.out.println("hello there");
		formatOutput() ;

	}

	public void doAMGreeting() {

		System.out.println("good morning");

	}

	public void doPMGreeting() {

		System.out.println("good evening");

	}
	
	
	private void formatOutput() {
		
		System.out.println("-------");
		
	}

}
