package code;
import java.io.*;
import java.util.Scanner;


public class code {
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		int variable1,variable2;
		String operation;
		String stop = "stop";
		System.out.println("Write 2 variables and a operation you want to do with them.");
		System.out.println("Write addition, subtraction, division, multiplication for the operation or stop to stop the process.");
		System.out.println("first write 2 numbers and then write the operation.");
		variable1 =read.nextInt();
		variable2 =read.nextInt();
		operation =read.next();
		while(!operation.equals("stop"))
		{
			System.out.println(operation);
			System.out.println("the result of your operation is " + calculus(variable1,variable2,operation));
			System.out.println("first write 2 numbers and then write the operation.");
			variable1 =read.nextInt();
			variable2 =read.nextInt();
			operation =read.next();
			
		}
		read.close();
	}
	public static int calculus(int a, int b , String operation)
	{
		switch(operation)
		{
		case "addition":
		case "add":
		case "+":
		case "Addition":
			return a+b;
		case "substraction":
		case "-":
		case "Substraction":
			return a-b;
		case "divide":
		case "division":
		case "Division":
		case "/":
			return a/b;
		case "multiply":
		case "multiplication":
		case "Multiplication":
		case "*":
			return a*b;
		}
		return 0;
	}
}