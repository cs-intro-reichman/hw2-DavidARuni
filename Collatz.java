// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		int seed = Integer.parseInt(args[0]); //non-negative integer input by user
		char mode = args[1].charAt(0); //mode input by user
		String output = ""; // output string for verbose mode
		String str; // string to store hailstone sequence
		int steps; // number of steps in hailstone sequence
		int num; // current number in hailstone sequence
		for (int current = 1; current <= seed; current++) {	
			num = current;
			steps = 0;
			str = "";
			// compute hailstone sequence for current seed
			// do while loop to ensure at least one iteration for num = 1
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
			// append final 1 to sequence
			if (num == 1) {
				if (mode == 'v'){
					output += str + "1 ("+ (steps + 1) +")\n";
				}
			}
		}
		// output results verbose mode
		if (mode == 'v'){
			System.out.print(output);
		}
		// output results final statement
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1."); 
	}
}
