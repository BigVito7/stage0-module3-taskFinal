package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        System.out.println(number > 0);
    }

    public static void main(String[] args) {
        NumbersPrinter printer = new NumbersPrinter();

        // Test cases
        printer.printIsPositive(10);  // true
        printer.printIsPositive(-5);  // false
        printer.printIsPositive(0);   // false
    }
}
