package day1.examples;

public class HelloWorldLambda {

	public static void main(String[] args) {
		//implementing sayHelloWorld Using Lambda
		HelloWorldInterface helloWorldInterface = () -> {
			return "Hello Lamda!!";
		};
		
		System.out.println(helloWorldInterface.sayHelloWorld());
	}
}