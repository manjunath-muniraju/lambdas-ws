package io.purva;

public class Greeter {

	public static void main(String[] args) {

		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		MyLambda myLambdaFunction = () -> System.out.print("Hello World");
		Greeting myLambdaFunctionGreet = () -> System.out.println("Hello World in Lambda");
		
		//FunctionalInterface myLambdaFunctionNew = () -> System.out.print("Hello World");
		
		MyAdd addFunction = (int a, int b) -> a + b;
		
		myLambdaFunctionGreet.perform();
		
		
		Greeting innerClassGreeting = new Greeting() {
			public void perform () {
				System.out.println("Hello world! - inner anonmous innner class");
			}
		};
		
		innerClassGreeting.perform();
		
		greeter.greet(myLambdaFunctionGreet);
		greeter.greet(innerClassGreeting);
		
		 
	}
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

}

interface MyLambda {
	void foo();
}

interface MyAdd {
	int foo(int x, int y);
}