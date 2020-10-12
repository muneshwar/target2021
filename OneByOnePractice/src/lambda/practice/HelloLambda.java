package lambda.practice;

public class HelloLambda {
	public static void main(String args[]) {
		
		FirstLambda firstLambda = () -> System.out.println("My first lambda function");
		

		FirstLambda secondLambda = () -> System.out.println("My second lambda function");
		
		firstLambda.sayHello();
		secondLambda.sayHello();	
}
}

interface FirstLambda{
	void sayHello();
}