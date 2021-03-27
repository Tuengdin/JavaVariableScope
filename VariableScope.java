package com.aomruk.helloWorld;

public class VariableScope {
	public static void main(String[] args) {
		bark();
		PrimitiveConversion();
		finalHello();
	}
// 1. bark method
	public static void bark() {
		System.out.println("1. bark method");
		String dogName = "Doggie";
		System.out.println("The Dog name = " + dogName + " bark");
	}
	
// 2.Primitive Conversion
	public static void PrimitiveConversion() {
	System.out.println("2.Primitive Conversion");
// a. float -> int
	float myFloat = 5.2f;
	int newInt =(int)myFloat;
	System.out.println("a. Change float to int");
	System.out.println("Original float myFloat = " + myFloat);
	System.out.println("Conversed to int newInt = " + newInt);
	
// b. int -> float
	int myInt = 5;
	float newFloat =(float)myInt;
	System.out.println("b. Change int to float");
	System.out.println("Original int myInt = " + myInt);
	System.out.println("Conversed to float newFloat = " + newFloat);
	
// c. double -> float
	double myDouble = 5.0;
	float newCFloat =(float)myDouble;
	System.out.println("c. Change double to float");
	System.out.println("Original double myDouble = " + myDouble);
	System.out.println("Conversed to float newCFloat = " + newCFloat);

// d. char -> int
	char myChar = 'A';
	int newDInt =(int)myChar;
	System.out.println("d. Change char to int");
	System.out.println("Original char myChar = " + myChar);
	System.out.println("Conversed to int newDInt = " + newDInt);
	}
// 3. final variable
	public static void finalHello() {
		System.out.println("3. final variable");
		final String hello = "Hello";
		//hello = "World";  //final variable can not change value, this line will error compilation problem
		System.out.println("hello = " + hello);
	}
}
