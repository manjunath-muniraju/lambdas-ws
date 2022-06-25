package io.purva.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.purva.Person;

public class StandardFunctionInterfacesExample {

public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charu","Ammu",30),
				new Person("Sri","Sree",60),
				new Person("Seetha","Chandra",40),
				new Person("Ram","Char",50)
				);
		
		// step 1: sort list by last name
		// step 2: create a method that prints all elements in the list
		// step 3: create a method that prints all people that have ;ast name beginning with C
		
		// to achieve above approach using java 8
		//step 1: java 8 way
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		//step 2: java 8 way
		//printAll(people);
		//instead of print all we can reuse printConditionally
		performConditionally(people, p -> true, p -> System.out.println(p));
		
		System.out.println();	
		
		//step 3: java 8 way
		System.out.println("print all person with last name beginning with C");
		performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
		
		System.out.println("print all person with first name beginning with C");
		performConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));
	}
	
	public static void performConditionally(List<Person> people, Predicate<Person> c, Consumer<Person> consumer) {
		for(Person p : people) {
			if(c.test(p)) {
				consumer.accept(p);
				//System.out.println(p);
			}
		}
	}
}
