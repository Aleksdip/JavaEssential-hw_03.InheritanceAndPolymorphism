package task_02.document_worker;

public class ExpertDocumentWorker extends ProDocumentWorker {


    private static final int EXPERT_KEY = 1010;
    @Override
    protected void saveDocument() {
        System.out.println("Document saved in new format");
    }

    public static int getExpertKey() {
        return EXPERT_KEY;
    }
}
