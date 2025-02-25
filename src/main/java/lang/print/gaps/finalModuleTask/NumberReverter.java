package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        // Reverse the digits
        int reversedNumber = units * 100 + tens * 10 + hundreds;

        // Print the reversed number
        System.out.println(reversedNumber);
    }

    public static void main(String[] args) {
        NumberReverter reverter = new NumberReverter();

        // Test cases
        reverter.revert(489); // Expected output: 984

    }
}
