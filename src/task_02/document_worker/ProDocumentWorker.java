package task_02.document_worker;

public class ProDocumentWorker extends DocumentWorker {


    private static final int PRO_KEY = 1001;
    @Override
    protected void editDocument() {
        System.out.println("Document edited");
    }
    @Override
    protected void saveDocument() {
        System.out.println("Document is saved in the old format. Saving in other formats is available in version Expert");
    }

    public static int getProKey() {
        return PRO_KEY;
    }
}
