package task_03.printer;

public class ColorPrinter  extends Printer{
//    override the method, add a random color for the output
    @Override
    void print(String value) {
        super.print(randomColor + value);
    }

}
