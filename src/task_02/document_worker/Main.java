package task_02.document_worker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int key; //variable for the activation key

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you access key (4 numbers), but you can use Basic version - enter any number");

        key = sc.nextInt();

        //create class needed version depending on the key entered
        DocumentWorker document;

        if (key == ProDocumentWorker.getProKey()) {
            document = new ProDocumentWorker();
            System.out.println("Pro version:");
        } else if (key == ExpertDocumentWorker.getExpertKey()) {
             document = new ExpertDocumentWorker();
            System.out.println("Expert version:");
        } else {
             document = new DocumentWorker();
            System.out.println("Basic version");
        }

        document.openDocument();
        document.editDocument();
        document.saveDocument();

    }
}
