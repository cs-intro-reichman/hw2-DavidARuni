public class TimeCalc {
    public static void main(String[] args) {
        // Get the Inputs
        String[] timeInput = args[0].split(":");
        int addTime = Integer.parseInt(args[1]);

        // Set the params
        int hours = Integer.parseInt(timeInput[0]);
        int minutes = Integer.parseInt(timeInput[1]);
        // Calculate the new time
        int totalMinutes = hours * 60 + minutes + addTime;
        // Format and print the new time
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;
        System.out.printf("%02d:%02d\n", newHours, newMinutes);
    }
}
