package lambda.practice;

public class MatchOperations {

	public static void main(String args[]) {
	
	// Add operation
	Calculate calculate = (a, b) -> {
		System.out.println(a+b);
	};
	
	// Substract operation
	Calculate substractCalculation = (a, b) ->{
		System.out.println(a-b);
	};
	
	
	calculate.cal(10, 20);
	substractCalculation.cal(10,20);
	}
}

interface Calculate {
	void cal(int a, int b);
}
