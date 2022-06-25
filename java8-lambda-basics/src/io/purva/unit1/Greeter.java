package io.purva.unit1;

public class Greeter {

	public static void main(String[] args) {

		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		MyLambda myLambdaFunction = () -> System.out.print("Hello World");
		
		Greeting myLambdaFunctionGreet = () -> System.out.println("Hello World in Lambda");
		Greeting normalObject = new HelloWorldGreeting();
		
		//FunctionalInterface myLambdaFunctionNew = () -> System.out.print("Hello World");
		
		MyAdd addFunction = (int a, int b) -> a + b;
		
		myLambdaFunction.foo();
		
		myLambdaFunctionGreet.perform();
		normalObject.perform();
		
		
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

// in this case or rule is if we are using below interface for lambda then there is should be only one method declared inside the interface.
interface MyLambda {
	void foo();
}

interface MyAdd {
	int add(int x, int y);
}