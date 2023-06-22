package task_01.class_room;

public class BadPupil extends Pupil {
    public BadPupil(String name) {
        super(name);
    }

    @Override
    public void study() {
        System.out.println("Study - bad");
    }
    @Override
    public void read() {
        System.out.println("Read - bad");
    }
    @Override
    public void write() {
        System.out.println("Write - bad");
    }
    @Override
    public  void relax() {
        System.out.println("Relax - bad");
    }
}
