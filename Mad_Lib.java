import java.util.Scanner;
public class Mad_Lib {
	public static void main(String[] args){
		String adjA;
		String nounA;
		String nounB;
		String verbA;
		String nounC;
		String verbB;
		String verbC;
		String adjB;
		String nounD;
		String verbD;
		String adjC;
		String nameA;
		String verbE;
		String placeA;
		String verbF;
		int intA = 0;
		float fltA = 0;
		float fltB = 0;
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Please enter an adjective:");
			adjA = inputDevice.nextLine();
		System.out.println("Please enter a noun:");
			nounA = inputDevice.nextLine();
		System.out.println("Please enter a noun:");
			nounB = inputDevice.nextLine();
		System.out.println("Please enter a verb:");
			verbA = inputDevice.nextLine();
		System.out.println("Please enter a noun:");
			nounC = inputDevice.nextLine();
		System.out.println("Please enter a verb:");
			verbB = inputDevice.nextLine();
		System.out.println("Please enter a verb:");
			verbC = inputDevice.nextLine();
		System.out.println("Please enter an adjective:");
			adjB = inputDevice.nextLine();
		System.out.println("Please enter a noun:");
			nounD = inputDevice.nextLine();
		System.out.println("Please enter a verb:");
			verbD = inputDevice.nextLine();
		System.out.println("Please enter an adjective:");
			adjC = inputDevice.nextLine();
		System.out.println("Please enter a person's name:");
			nameA = inputDevice.nextLine();
		System.out.println("Please enter a verb:");
			verbE = inputDevice.nextLine();
		System.out.println("Please enter a place:");
			placeA = inputDevice.nextLine();
		System.out.println("Please enter a verb:");
			verbF = inputDevice.nextLine();
		System.out.println("Please enter a length:");
			fltA = inputDevice.nextFloat();
		System.out.println("Please enter a width:");
			fltB = inputDevice.nextFloat();	
		System.out.println("Please enter a whole number:");
			intA = inputDevice.nextInt();
			
		System.out.println("The " + adjA + " " + nounA + " was the most amazing " + nounB);
		System.out.println(" anywhere in the country. In fact there has only ever been ");
		System.out.println(intA + " like it in history! It was always being " + verbA);
		System.out.println(" around for everyone to see. It must have been " + fltA);
		System.out.println(" feet long and " + fltB + " feet wide! ");
		System.out.println("Everywhere that they took it people would say it made ");
		System.out.println("them think of a " + nounC + "from another world. ");
		System.out.println("Astounded, people would " + verbB + " and " + verbC);
		System.out.println(" as the " + adjA + " " + nounA + " passed. ");
		System.out.println("One day a " + adjB + " " + nounD + " descended on the country and the ");
		System.out.println(adjA + " " + nounA + " that was loved by so many was " + verbD);
		System.out.println(" and would never be seen again. Until a " + adjC + " hero named ");
		System.out.println(nameA + " came to the rescue and " + verbE + " the ");
		System.out.println(adjA + " " + nounA + " restoring it to its’ former glory. ");
		System.out.println(nameA + " was then taken to " + placeA);
		System.out.println(" where they would be " + verbF);
		System.out.println(" forever and the country can rejoice again.");
				
		
	}
}

