import java.util.Scanner;

public class TriviaGame {
	
	public static int triviaMethod() {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		String [] questions = {"Question 1: What is captial of CANADA?", 
				"Question 2: What is captial of ITALY?",
				"Question 3: What is captial of INDIA?",
				"Question 4: How many states are there in USA?",
				"Question 5: What is the largest population in the world?",
		};
		
		String [] answers = {"OTTAWA","ROME","DELHI","50","CHINA"};
		int[] points = {2,3,2,3,5};
		String[] useranswer = new String[100];
		
    for(int i=0;i<questions.length;i++) {
    	System.out.println(questions[i]);
    	System.out.println("enter answer:");
    	useranswer[i] = sc.next();
    	if(useranswer[i].equals(answers[i])) {
    		System.out.println("correct");
    		score = score + points[i];
    	}
    	else {
    		System.out.println("incorrect");
    	}
    }
    System.out.println();
    System.out.println("FINAL SCORE IS : " +score);

		return 0;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		triviaMethod();
}
}