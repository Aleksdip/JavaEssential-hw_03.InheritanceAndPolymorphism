package task_01.class_room;

public class GoodPupil extends Pupil {
    public GoodPupil(String name) {
        super(name);
    }

    @Override
    public void study() {
        System.out.println("Study - good");
    }
    @Override
    public void read() {
        System.out.println("Read - good");
    }
    @Override
    public void write() {
        System.out.println("Write - good");
    }
    @Override
    public  void relax() {
        System.out.println("Relax - good");
    }
}
