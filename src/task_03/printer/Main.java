package task_03.printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Not color");

        Printer colorPrinter = new ColorPrinter();
        colorPrinter.print("Color");
    }
}
