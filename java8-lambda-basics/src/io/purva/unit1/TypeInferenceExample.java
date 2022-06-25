package io.purva.unit1;

public class TypeInferenceExample {

	public static void main(String[] args) {
		
		StringLengthLambda stringLengthLambda = (String s) -> s.length();
		System.out.println(stringLengthLambda.getLength("Hello Lambda"));
	}
	
	interface StringLengthLambda {
		int getLength(String s);
	}	

}
