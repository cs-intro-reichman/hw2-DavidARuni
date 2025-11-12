// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		int seed = Integer.parseInt(args[0]); //non-negative integer input by user
		char mode = args[1].charAt(0); //mode input by user
		String output = "";
		String str;
		int steps;
		int num;
		for (int current = 1; current <= seed; current++) {	
			num = current;
			steps = 0;
			str = "";
			// compute hailstone sequence for current seed
			do{
				steps++;
				str += num + " ";
				if (num %2 == 0) {
					num /= 2;
				} else {
					num *= 3;
					num += 1;
				}
			} while (num != 1);
			
			if (num == 1) {
				if (mode == 'v'){
					output += str + "1 ("+ (steps + 1) +")\n";
				}
			}
		}
		// output results concise mode
		if (mode == 'v'){
			System.out.print(output);
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1."); 
	}
}
