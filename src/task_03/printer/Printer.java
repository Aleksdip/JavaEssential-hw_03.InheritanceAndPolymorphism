package task_03.printer;

import java.util.Random;

public class Printer {
    //  create fields and class object Random for selecting a color
    int min = 31, max = 38;
    Random color = new Random();
    int random = color.nextInt(max - min +1) + min;
    String randomColor = "\u001B" + "[" + random +"m";


    void print (String value) {
        System.out.println(value);
    }
}
