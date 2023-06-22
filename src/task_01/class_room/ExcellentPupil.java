package task_01.class_room;

public class ExcellentPupil extends Pupil {
    public ExcellentPupil() {

    }

    public ExcellentPupil(String name) {
        super(name);
    }

    @Override
    public void study() {
        System.out.println("Study - excellent");
    }
    @Override
    public void read() {
        System.out.println("Read - excellent");
    }
    @Override
    public void write() {
        System.out.println("Write - excellent");
    }
    @Override
    public  void relax() {
        System.out.println("Relax - excellent");
    }



}
