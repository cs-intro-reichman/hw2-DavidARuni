// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int n = Integer.parseInt(args[0]);
		double pi = 0.0;
		int shifter = 1;
		for (int i = 1; i <= n*2-1; i+=2){
			pi += 1.0/i * shifter;
			shifter *= -1;
		}
		System.out.println("pi according to Java: "+ Math.PI +"\npi, approximated:     " + pi*4);
	}
}
