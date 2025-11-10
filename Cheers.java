//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                // Get the Inputs
                // capitalize word
                String word = args[0].toUpperCase();
                int times = Integer.parseInt(args[1]);
                String chant = "";

                // breakdown the word into letters
                for (int l = 0; l < word.length(); l++){
                        chant += "Give me a  " +(word.charAt(l)) +": " + word.charAt(l) + "!\n";
                } 

                
                chant += "What does that spell?\n";
                // repeat for the number of times by user input
                for (int r = 1; r < times; r++){
                        chant += word + "!!!\n";
                }

                // edge case for less than 1 time 
                if (times > 0) {
                        // final cheer -> edge case for "\n"
                        chant += word + "!!!\n";
                }

                // Print with syntaxs
                System.out.println(chant);
        }
}
