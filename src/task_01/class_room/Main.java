package task_01.class_room;

public class Main {
    public static void main(String[] args) {
        Pupil pupil1 = new ExcellentPupil("Aleks");
        Pupil pupil2 = new GoodPupil("Oleg");
        Pupil pupil3 = new BadPupil("Volodimir");
        Pupil pupil4 = new Pupil();

        ClassRoom classRoom = new ClassRoom(pupil1, pupil2, pupil3, pupil4);
        classRoom.watch();

    }

}
