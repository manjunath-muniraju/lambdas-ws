package io.purva.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {

		Thread t = new Thread( () -> printMessage()); //this statement can be replaced with method reference
		Thread t_methodReferenceExample = new Thread( MethodReferenceExample1::printMessage);
		t.start();
		t_methodReferenceExample.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
