package task_01.class_room;

public class ClassRoom {

    Pupil [] classRoom;

    public ClassRoom(Pupil[] classRoom) {
        this.classRoom = classRoom;
    }

    public  void watch () {
        for (Pupil pupil : classRoom) {
            System.out.println("\n" + pupil.name + ":");
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();

        }
    }
}
