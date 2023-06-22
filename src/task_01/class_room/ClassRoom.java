package task_01.class_room;

public class ClassRoom {
     Pupil [] classRoom = new Pupil[4];

    Pupil pupil1;
    Pupil pupil2;
    Pupil pupil3;
    Pupil pupil4;

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this(pupil1, pupil2, new Pupil("Student empty"), new Pupil("Student Empty"));

    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this(pupil1, pupil2, pupil3, new Pupil("Student Empty"));
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupil1 = pupil1;
        classRoom[0] = this.pupil1;
        this.pupil2 = pupil2;
        classRoom[1] = this.pupil2;
        this.pupil3 = pupil3;
        classRoom[2] = this.pupil3;
        this.pupil4 = pupil4;
        classRoom[3] = this.pupil4;

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
